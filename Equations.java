public class Equations {
    public static void main(String[] args) {
        menoEquazioniPiuRigatoni(12,1,27);
    }

    public static void menoEquazioniPiuRigatoni(int coeffGrado2, int coeffGrado1, int termineNoto) {
        //Calcolo il valore di Delta
        double delta = (coeffGrado1 * coeffGrado1) - (4 * coeffGrado2) * termineNoto;

        if (delta < 0.0) {
            double r1 = (-coeffGrado1 + Math.pow(delta, 0.5)) / (2.0 * coeffGrado2);
                double r2 = (-coeffGrado1 - Math.pow(delta, 0.5)) / (2.0 * coeffGrado2);
                System.out.println("Le radici sono " + r1 + " e " + r2);
        } else if (delta == 0.0) {
            double r1 = -coeffGrado1 / (2.0 * coeffGrado2);
            System.out.println("La radice è " + r1);
        } else {
            System.out.println("L'equazione non ha radici reali.");
        }
    }
}
