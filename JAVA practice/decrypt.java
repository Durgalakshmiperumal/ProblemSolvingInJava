public class decrypt {
    public static String decrypt(String code){
	    char[] chars = code.toCharArray();
	    int n = chars.length;
	   
	    for(int i= 0; i < n-1;i++){
	        if(Character.isDigit(chars[i]) && Character.isDigit(chars[i+1])){
	            char temp = chars[i];
	            chars[i] = chars[i+1];
	            chars[i+1] = temp;
	           
	            i++;
	        }
	    }
	    return new String(chars);
	}
}
