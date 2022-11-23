import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

//Legge le righe di un file
//Le scrive in un altro file
//Scrive anche il numero di ogni riga

public class FileReader {
    public static void main(String[] args) {
        File fileToRead = new File("Test.txt");
        int line = 1;
        try {
            Scanner read = new Scanner(fileToRead);
            while(read.hasNextLine()) {
                System.out.println(line + "   "+ read.nextLine());
                line++;
            }
            read.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
