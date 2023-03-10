public class Main {
    public static void main(String[] args) {
        int balance = 150;
        int payment = 1200;
        int bonus = balance + payment;
        if (payment > 999)
            bonus = balance + payment + payment / 100;
        System.out.println(bonus);
    }
}