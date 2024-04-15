import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        double maxNumber = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Введите три раза число больше нуля");
            double number = scanner.nextDouble();

            if (number <= 0 || number >= Double.MAX_VALUE) {
                System.out.println("Необходимо было ввести числа больше 0 и меньше 1.7976931348623157E308. Конец программы");
                return;
            }

            if (number >= maxNumber) {
                maxNumber = number;
            }
        }
        System.out.println(maxNumber);
    }
}
//Даны три числа с плавающей точкой (double, float).
// Вывести наибольшее из них.
// Не использовать встроенные методы Math.Max(...);