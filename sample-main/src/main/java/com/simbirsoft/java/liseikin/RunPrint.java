package com.simbirsoft.java.liseikin;

/**
 * Created by Ivan on 20.07.2016.
 */
public class RunPrint {
    public static void run(int version, String string) {
        PrintTextI print = null;
        if (version == 1) {
            print = new PrintTextFile();
        } else if (version == 0) {
            print = new PrintTextConsole();
        }
        print.printText(string);

    }
    
    public static void main(String[] args) {
        try {
            int outputMode = Integer.parseInt(args[0]);
            String text = args[1];
            RunPrint.run(outputMode, text);
        } catch (NumberFormatException e) {
            System.out.println("You have entered incorrect format for an argument, repeat run.");
        } catch (Exception e) {
            System.out.println("You entered a invalid data.");
        } finally {
            System.out.println("The program is finalized.");
        }
    }
}
