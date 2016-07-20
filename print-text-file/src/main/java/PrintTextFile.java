import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Ivan on 20.07.2016.
 */
public class PrintTextFile implements PrintTextI {
    PrintTextFile(String string) {
        printText(string);
    }

    public void printText(String string) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + "\\log.txt"));
            bufferedWriter.write(java.lang.String.valueOf(string));
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
