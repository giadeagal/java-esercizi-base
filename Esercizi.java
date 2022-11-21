public class Esercizi {
    public static void main(String[] args) {
        int laps = 20;
        int num1 = 0;
        int num2 = 1;
        int result;

        for(int i = 0; i < laps; i++ ) {
            if (i == 0) {
                System.out.print(num1 + " " + num2);
            }
            result = num1 + num2;    
            System.out.print(" "+ result);    
            num1 = num2;    
            num2 = result;  
        }
    }
}