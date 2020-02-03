import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        readArray(expandArray(fillArray(array)));
    }
    public static int[] fillArray(int[] array){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < array.length; i ++){
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static void readArray(int[] array){
        for (int i = 0; i < array.length; i ++){
            System.out.println(array[i]);
        }
    }
    public static int[] expandArray(int[] array){
        int[] array1 = new int[array.length];
        for (int i = 0; i < array.length; i ++){
            array1[i] = array[array.length - i - 1];
        }
        return array1;
    }
}
