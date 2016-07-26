package com.simbirsoft.java.liseikin;

/**
 * Created by Ivan on 20.07.2016.
 */
public class RunPrint {
    public static void run(int version, String string) {
        if (version == 1) {
            PrintTextI print = new PrintTextFile(string);
        } else if (version == 0) {
            PrintTextI print = new PrintTextConsole(string);
        }

    }

    public static void main(String[] args) {
        try {
            RunPrint.run(Integer.parseInt(args[0]), args[1]);
        } catch (NumberFormatException e) {
            System.out.println("You have entered incorrect format for an argument, repeat run.");
        } catch (Exception e) {
            System.out.println("You entered a invalid data.");
        } finally {
            System.out.println("The program is finalized.");
        }
    }
}
