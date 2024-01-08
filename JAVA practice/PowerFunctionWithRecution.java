  import java.util.Scanner;
public class PowerFunctionWithRecution {
    
  


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int power = sc.nextInt();
        sc.close();

        int result = power(num, power);
        System.out.println("The value of " + num + " power " + power + " is " + result);
    }

    public static int power(int base, int p) {
        if (p == 0) {
            return 1;
        } else if (base == 0) {
            return 0;
        } else if (p == 1) {
            return base;
        }
        return base * power(base, p - 1);
    
}

}
