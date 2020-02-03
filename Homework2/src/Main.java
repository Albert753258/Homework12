public class Main {
    public static void main(String[] args) {
        int number = 32123;
        String received = "";
        while (number > 0){
            received = number % 10 + received;
            number = number / 10;
        }
        System.out.println(received);
    }
}
