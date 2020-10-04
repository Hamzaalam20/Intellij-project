package Hello;
import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        while (true){
            System.out.println("Whats up");

            System.out.println("Do you know that 100+200 is");

            int a=100;
            int b=200;
            System.out.println(a+b);

            Scanner alam = new Scanner(System.in);

            System.out.println("Enter no 1");
            int num1 = alam.nextInt();
            System.out.println("num2");
            int num2 =alam.nextInt();
            System.out.println(num1+num2);
            System.out.println("Enter no 1");
        }
    }
}
