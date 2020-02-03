public class Main {
    public static void main(String[] args) {
        int[] a = {3, 2, 1, 6, 1};
        String number = "";
        for (int i = 0; i < a.length; i ++) {
            number = number + a[i];
        }
        System.out.println(number);
    }
}