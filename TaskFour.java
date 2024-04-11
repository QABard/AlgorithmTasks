import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число больше 0");
        long number = scanner.nextLong();
        if (number < 0 || number > 2147483646) {
            System.out.println("Необходимо было ввести число больше 0 и меньше 2147483647. Конец программы");
            return;
        }
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FIZZBUZZ");
            } else if (i % 3 == 0) {
                System.out.println("FIZZ");
            } else if (i % 5 == 0) {
                System.out.println("BUZZ");
            } else {
                System.out.println(i);
            }
        }
    }
}
//Написать FizzBuzz. Дано число N > 0.
// Для чисел от 0 до N: если число кратно 3 вывести FIZZ, если кратно 5 вывести BUZZ,
// если кратно 3 и 5 вывести FIZZBUZZ, иначе вывести число