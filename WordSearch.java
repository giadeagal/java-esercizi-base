import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class WordSearch {
    public static void main(String[] args) throws FileNotFoundException {
        File cinqueMaggio = new File("test.txt");
        System.out.println(searchWord("immobile", cinqueMaggio));
    }

    public static boolean searchWord(String WordToSearch, File targetFile) throws FileNotFoundException {
        boolean result = false;

        Scanner reader = new Scanner(targetFile);

        if (reader.nextLine().contains(WordToSearch)) {
            reader.close();            
            result = true;            
            return result;
       } else {
        reader.close(); 
        return result;
       }

    }

}
