import java.util.Scanner;
public class FunzioneMaggiore {
    public static void main(String[] args) {
        largestImputInt();
    }

    public static void largestImputInt() {
        boolean isRunning = true;
        int baseNum = 0;

        while(isRunning) {
            Scanner r = new Scanner(System.in);
            System.out.println("Inserisci un numero");
            int inputNum = r.nextInt();

            if(inputNum > baseNum && inputNum != 0) {
                baseNum = inputNum;
            } else if (inputNum == 0) {
                isRunning = false;
                System.out.println("Il numero maggiore tra quelli inseriti è " + baseNum );
            }
            }
        }
    }

