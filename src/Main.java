import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total no of checks");
        int n=sc.nextInt();

        for(int i=0;i<n;i++) {
            System.out.println("Enter the value for x1");
            int x1=sc.nextInt();
            System.out.println("Enter the value for x1");
            int y1=sc.nextInt();
            System.out.println("Enter the value for x2");
            int x2=sc.nextInt();
            System.out.println("Enter the value for y2");
            int y2=sc.nextInt();
            System.out.println("Enter the value for x3");
            int x3=sc.nextInt();
            System.out.println("Enter the value for y3");
            int y3=sc.nextInt();

            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);
            Point p3 = new Point(x3, y3);

            Triangle t = new Triangle(p1, p2, p3);
            t.setType();
            System.out.println(t.getType());
            System.out.println(t.getPerimeter());
            System.out.println(t.getArea());
            System.out.println("Enter the point to check");
            System.out.println("Enter the value for x");
            int x=sc.nextInt();
            System.out.println("Enter the value for y");
            int y=sc.nextInt();
            Point p=new Point(x,y);
            Boolean b=t.insideOrOutside(p);
            if(b){
                System.out.println("The point is inside");
            }
            else{

                System.out.println("The point is outside");
            }
        }
    }
}