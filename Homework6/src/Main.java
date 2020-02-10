public class Main {
    public static void main(String[] args) {
        int[] a = {3, 2, 1, 6, 1};
        int number = 0;
        int length = a.length - 1;
        for (int i = 0; i < a.length; i ++) {
            number = number + degree(a[i], length);
            length--;
        }
        System.out.println(number);
    }
    public static int  degree(int a, int b){
        while(b > 0){
            a = a * 10;
            b --;
        }
        return a;
    }
}