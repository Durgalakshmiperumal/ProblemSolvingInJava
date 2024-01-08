import java.util.Scanner;

class constructor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Cube\n2.Sphere\n3.Cylinder\nEnter the choice");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("length");
                int length = scanner.nextInt();
                System.out.println("breadth");
                int breadth = scanner.nextInt();
                System.out.println("height");
                int height = scanner.nextInt();

                Shape cube = new Shape(length, breadth, height);
                System.out.println("Area of Cube is " + cube.calculateAreaOfCube());
                break;

            case 2:
                System.out.println("radius");
                int radiusSphere = scanner.nextInt();

                Shape sphere = new Shape(radiusSphere);
                System.out.println("Area of Sphere is " + sphere.calculateAreaOfSphere());
                break;

            case 3:
                System.out.println("radius");
                int radiusCylinder = scanner.nextInt();
                System.out.println("height");
                int heightCylinder = scanner.nextInt();

                Shape cylinder = new Shape(radiusCylinder, heightCylinder);
                System.out.println("Area of Cylinder is " + cylinder.calculateAreaOfCylinder());
                break;

            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}

class Shape {
    private int length;
    private int breadth;
    private int height;
    private int radius;

    public Shape() {
        // Default constructor
    }

    public Shape(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public Shape(int radius) {
        this.radius = radius;
    }

    public Shape(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public float calculateAreaOfCube() {
        return length * breadth * height;
    }

    public float calculateAreaOfCylinder() {
        return (float) (Math.PI * radius * radius * height);
    }

    public float calculateAreaOfSphere() {
        return (float) ((4.0 / 3.0) * Math.PI * Math.pow(radius, 3));
    }
}
