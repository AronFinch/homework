/**
 * Created by Ivan on 20.07.2016.
 */
public class RunPrint {
    public static void run(int version, String string) {
        if (version == 1) {
            PrintTextI print = new PrintTextFile(string);
        } else if(version == 0){
            PrintTextI print = new PrintTextConsole(string);
        }

    }
}
