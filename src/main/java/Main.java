/**
 * Created by Ivan on 20.07.2016.
 */
public class Main {
    public static void main(String[] args) {
        try {
            RunPrint.run(Integer.parseInt(args[0]), args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели неправильный формат для аргумента, повторите запуск.");
        } catch (Exception e) {
            System.out.println("Вы ввели неверные данные.");
        } finally {
            System.out.println("Программа завершила работу.");
        }
    }
}
