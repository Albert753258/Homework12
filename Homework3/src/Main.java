import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for(int number = scanner.nextInt(); number != 0; number = number / 10){
            sum = sum + number % 10;
        }
        System.out.println(sum);
    }
}
