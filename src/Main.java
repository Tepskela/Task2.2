public class Main {
    public static void main(String[] args) {
        int balans = 100;
        int depositAmount = 1500;

        int bonus;
        if (depositAmount > 1000) {
            bonus = depositAmount / 100;
        } else {
            bonus =0;
        }
        System.out.println(bonus);
    }
}