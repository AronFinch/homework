package com.simbirsoft.java.liseikin;

/**
 * Created by Ivan on 20.07.2016.
 */
public class PrintTextConsole implements PrintTextI {
    PrintTextConsole(String string) {
        printText(string);
    }

    public void printText(String string) {
        System.out.println(string);
    }
}
