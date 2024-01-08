
public class amstrongnum {
    public static void main(String[] args) {
        int findnum = 373;
          int number = findnum;
           int cubenum = 0;

        while (findnum > 0) {
            int splitnum = findnum % 10;
             cubenum += splitnum * splitnum * splitnum;
           
         
            findnum = findnum / 10;
        }
        if (cubenum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
       
       


    }
}
