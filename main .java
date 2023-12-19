import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        runDate();
    }

    public static void runDate() {
        System.out.println("Введите дату в виде dd/mm/yyyy");
        Scanner sc1 = new Scanner(System.in);
        String input = sc1.next();

        if (isDate(input)) {
            System.out.println("Строка соответствует шаблону и является правильной датой");
        } else {
            System.out.println("Строка не соответствует шаблону или не является правильной датой");
        }
    }

    private static boolean isDate(String input) {
        
    }
}
