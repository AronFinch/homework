package com.simbirsoft.java.liseikin;

/**
 * Created by Ivan on 20.07.2016.
 */
public class RunPrint {
    public static void run(int version, String string) {
        if (version == 1) {
            runPrint(new PrintTextFile(), string);
        } else if (version == 0) {
            runPrint(new PrintTextConsole(), string);
        }

    }

    static void runPrint(PrintTextI outputMode, String string){
        outputMode.printText(string);
    }

    public static void main(String[] args) {
        try{
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
