import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        double maxNumber = -Double.MAX_VALUE;
        System.out.println("Введите три раза число");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Введите число " + i + "-ое число");
            double number = scanner.nextDouble();

            if (number <= -Double.MAX_VALUE || number >= Double.MAX_VALUE) {
                System.out.println("Необходимо было ввести числа больше 4.9E-324 и меньше 1.7976931348623157E308. Конец программы");
                return;
            }

            if (number >= maxNumber) {
                maxNumber = number;
            }
        }
        System.out.println("Самое большое число " + maxNumber);
    }
}
//Даны три числа с плавающей точкой (double, float).
// Вывести наибольшее из них.
// Не использовать встроенные методы Math.Max(...);