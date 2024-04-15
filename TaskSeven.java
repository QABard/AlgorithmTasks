import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        System.out.println("Введите число больше нуля");
        var scanner = new Scanner(System.in);
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double number3 = scanner.nextDouble();


        if (number1 <= 0 || number1 > Double.MAX_VALUE) {
            System.out.println("Необходимо было ввести число больше 0 и меньше 2147483647. Конец программы");
            return;
        }
        if (number2 <= 0 || number2 > Double.MAX_VALUE) {
            System.out.println("Необходимо было ввести число больше 0 и меньше 2147483647. Конец программы");
            return;
        }
        if (number3 <= 0 || number3 > Double.MAX_VALUE) {
            System.out.println("Необходимо было ввести число больше 0 и меньше 2147483647. Конец программы");
            return;
        }

        if (number1 > number2 && number1 > number3) {
            System.out.println(number1);
        }
        if (number2 > number1 && number2 > number3) {
            System.out.println(number2);
        }
        if (number3 > number2 && number3 > number1) {
            System.out.println(number3);
        }
    }
}
//Даны три числа с плавающей точкой (double, float).
// Вывести наибольшее из них.
// Не использовать встроенные методы Math.Max(...);