import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
public static void main(String[] args) {
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
String[] parts = input.split("/");

if (parts.length != 3) {
return false; 
}

int day = Integer.parseInt(parts[0]);
int month = Integer.parseInt(parts[1]);
int year = Integer.parseInt(parts[2]);

if (year < 1600 || year > 9999) {
return false; 
}

if (month < 1 || month > 12) {
return false; 
}

int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
days[2] = 29; 
}

return day >= 1 && day <= days[month];
}
}