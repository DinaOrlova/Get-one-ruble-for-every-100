public class Main {
    public static void main(String[] args) {
        int refill = 1753;
        int totalBonus;
        if (refill > 1000) {
            int oneBonus = 100;
            totalBonus = refill / oneBonus;
        } else {
            totalBonus = 0;
        }
        int currentBalance = 143;
        int totalBalance = currentBalance + refill + totalBonus;
        System.out.println(totalBalance);
    }
}
