import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char text[] = scanner.nextLine().toCharArray();
        int array[] = analyze(text);
        for(int i = 0; i < array.length; i ++){
            if(array[i] != 0){
                System.out.println(array[i]);
            }
        }
    }
    public static int[] analyze(char text[]){
        int countArray[] = new int[70];
        for(int i = 0; i < text.length; i ++){
            int temp = text[i] - 97;
            countArray[temp] ++;
        }
        return countArray;
    }
}