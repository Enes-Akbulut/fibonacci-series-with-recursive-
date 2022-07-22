import java.util.Scanner;

public class Main {
    static int fib(int f){
        Scanner input = new Scanner(System.in);

        if (f==1||f==2){
            return 1;
        }
        return fib(f-1)+fib(f-2);
    }


    public static void main(String[] args) {
        int f;
        System.out.print("Enter a number :");
        Scanner input = new Scanner(System.in);

        System.out.println( fib( f=input.nextInt()));

    }
}