public class Main {
    public static void main(String[] args) {
        int[] a = {3, 2, 1, 6, 1};
        int number = 0;
        for (int i = 0; i < a.length;i ++){
            for(int e = a.length; i > 0; i --){
                number = number + degree(a[i], e);
            }
        }
        System.out.println(number);
    }
    public static int degree(int a, int b){
        int c = a;
        for(int i = 1; i < b; i ++){
            c = c * 10;
        }
        return c;
    }
}