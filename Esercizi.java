public class Esercizi {
    static void fibonacciamo(int laps, int num) {
        int num1 = num-1;
        int num2 = num-2;
        int result;

        for( int i = 0; i < laps; i++) {
            if (i == 0 && num == 0) {
                System.out.print(0 + " " + 1);
            } else {
                result = num1 + num2;    
            System.out.print(" "+ result);    
            num1 = num2;    
            num2 = result; 
            }
        }

        System.out.println();
      }

    static void fibonacciamo(int laps) {
        int num1 = 0;
        int num2 = 1;
        int result;

        for( int i = 0; i < laps; i++) {
            if (i == 0) {
                System.out.print(0 + " " + 1);
            } else {
                result = num1 + num2;    
            System.out.print(" "+ result);    
            num1 = num2;    
            num2 = result; 
            }
        }
        System.out.println();
      }

      public static void main(String[] args) {
        //Con funzione a 2 argomenti (lunghezza e numero di partenza)
        fibonacciamo(5, 6);

        //Con funzione ad argomento singolo (lunghezza, partendo da 0)
        fibonacciamo(5);

        //Senza funzione
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
    }}
