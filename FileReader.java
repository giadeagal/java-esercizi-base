import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;



//Legge le righe di un file 
//Le scrive in un altro file
//Scrive anche il numero di ogni riga

public class FileReader {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File fileToRead = new File("Test.txt");
        int lineNum = 1;

        Scanner reader = new Scanner(fileToRead);
        FileWriter writer = new FileWriter("manzoni.txt");

        while(reader.hasNextLine()) {
            String lineContent = reader.nextLine();
            writer.write(lineNum + "   " + lineContent + "\n");
            lineNum++;
        }
        reader.close();
        writer.close();    
        } 
    }

