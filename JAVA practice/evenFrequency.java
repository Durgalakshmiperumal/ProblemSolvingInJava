

public class evenFrequency {
    
    
    public static void main(String[] args) {
   
        String input = "aaabbaccccd";
        int count = 1;
        int sum = 0;
        
        for (int i = 0; i < input.length() - 1; i++) {
            //input.charAt(i);
            if(input.charAt(i) == input.charAt(i + 1)){
              count++;
            }
            else{
                if(count % 2 == 0){
                     sum+= count;
                }
                count=1;
            }
         
     
        }
            if(count % 2 == 0 ){
             sum += count;
            }
            System.out.println(sum);


        }
        }  