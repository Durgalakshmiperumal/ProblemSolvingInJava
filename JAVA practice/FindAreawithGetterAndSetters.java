 import java.util.Scanner;
public class FindAreawithGetterAndSetters {
   
 
     
        private int num1;
        private int num2;
    
    
        public void setnum1(int num1) {
            this.num1 = num1;
        }
    
        public double getnum1() {
            int r2 = num1 * num1;
            double area = r2 * 3.14;
            return area;
        }
    
       
    
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
    
            FindAreawithGetterAndSetters main = new FindAreawithGetterAndSetters();
    
           
    
            int num1 = sc.nextInt();
            main.setnum1(num1);
    System.out.println("Enter the value of Radius:");
            System.out.println( "Area of Circle: " + main.getnum1());
      
           
        }
    }

