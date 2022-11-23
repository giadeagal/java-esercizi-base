import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class WordSearch {
    public static void main(String[] args) throws FileNotFoundException {
        File cinqueMaggio = new File("test.txt");
        System.out.println(searchWord("Solio", cinqueMaggio, true));
    }

    public static boolean searchWord(String wordInput, File targetFile, boolean caseSensitive) throws FileNotFoundException {
        boolean result = false;
        Scanner reader = new Scanner(targetFile);
        String wordToSearch;
        if(!caseSensitive) {
            wordToSearch = wordInput.toLowerCase();
        } else {
            wordToSearch = wordInput;
        }
        

        while (reader.hasNextLine()) {
            if (reader.nextLine().contains(wordToSearch)) {
                result = true;
                break;
            }
        }
        reader.close();
        return result;
    }
}
