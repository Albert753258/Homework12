import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(fib(scanner.nextInt()));
    }
    public static int fib(int n){
        if(n == 1){
            return 1;
        }
        if(n == 0){
            return 0;
        }
        else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
