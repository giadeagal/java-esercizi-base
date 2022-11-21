public class Compreso {
    public static void main(String[] args) {
        isBetween(1,23,3);
    }

    public static void isBetween(int a, int b, int c) {
        if (a < b && b < c) {
            System.out.println(b+ " è compreso tra "+ a + " e " + c);
        } else {
            System.out.println(b+ " non è compreso tra "+ a + " e " + c);
        }
    }
}
