   import java.util.Scanner;
public class GetterAndSetter {
 


    private String name;
    private int num1;
    private int num2;

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void setnum1(int num1) {
        this.num1 = num1;
    }

    public int getnum1() {
        return num1;
    }

    public void setnum2(int num2) {
        this.num2 = num2;
    }

    public int getnum2() {
        return num2;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        GetterAndSetter main = new GetterAndSetter();

        String name = sc.nextLine();
        main.setname(name);
        System.out.println(main.getname());

        int num1 = sc.nextInt();
        main.setnum1(num1);
        System.out.println(main.getnum1());

        int num2 = sc.nextInt();
        main.setnum2(num2);
        System.out.println(main.getnum2() + "%");
    }
}

