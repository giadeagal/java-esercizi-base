public class SizeMatters {
    public static void main(String[] args) {
        pescEPesc(12, 17);
    }

    public static void pescEPesc(int pesc1, int pesc2) {
        if (pesc1 > pesc2) {
            System.out.println(pesc1 + " vince");
        } else {
            System.out.println(pesc2 + " vince");
        }
    }
}
