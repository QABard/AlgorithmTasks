import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Введите какой-нибудь текст:");
        String s = scanner.nextLine();
        char[] letters = s.toCharArray();
        int left = 0;
        int right = letters.length - 1;

        while (left < right) {
            char swap = letters[left];
            letters[left] = letters[right];
            letters[right] = swap;
            left++;
            right--;
        }
        String reversed = new String(letters);
        System.out.println(reversed);
    }
}
//Дана строка S введённая с клавиатуры (либо заданная var s = "some string").
// Развернуть строку в обратном направлении: "gnirts emos")