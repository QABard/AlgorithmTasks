import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        }
    }
//Пользователь вводит число с клавиатуры. Число > 0.
// Вывести сумму чисел от 0 до числа НЕ включительно.