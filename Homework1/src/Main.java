public class Main {
    public static void main(String[] args) {
        int number10 = 234;
        String number2 = "";
        while(number10 > 0){
            number2 = number10 % 2 + number2;
            number10 = number10 / 2;
        }
        System.out.println(number2);
    }
}
