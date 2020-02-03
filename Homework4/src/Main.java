import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfNumbers  = 0;
        int current1 = 0;
        int current;
        current1 = scanner.nextInt();
        while (current1 != -1){
            int sum = 1;
            for(current = current1; current != 0; current = current / 10){
                sum = sum * (current % 10);
            }
            if(sum % 3 == 0){
                sumOfNumbers = sumOfNumbers + current1;
            }
            else{
            }
            current1 = scanner.nextInt();
        }
        System.out.println(sumOfNumbers);
    }
}
