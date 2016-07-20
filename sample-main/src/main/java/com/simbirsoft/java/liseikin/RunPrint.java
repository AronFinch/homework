package com.simbirsoft.java.liseikin;

import com.simbirsoft.java.liseikin.PrintTextConsole;
import com.simbirsoft.java.liseikin.PrintTextFile;
import com.simbirsoft.java.liseikin.PrintTextI;

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
