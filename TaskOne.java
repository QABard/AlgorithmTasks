import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        System.out.println("Введите число больше нуля");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Long sum = 0L;
        if (number > 0 && number < 2147483647) {
            for (int i = 1; i < number; i++) {
                sum = sum + i;
            }
            System.out.println(sum);
        } else {
            System.out.println("Необходимо было ввести число больше 0 и меньше 2147483647. Конец программы");
        }
    }
}
//Пользователь вводит число с клавиатуры. Число > 0.
// Вывести сумму чисел от 0 до числа НЕ включительно.