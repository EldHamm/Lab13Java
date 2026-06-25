import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Введите размер массива: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Введите элементы:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int sum = 0;
            int count = 0;

            for (int x : arr) {
                if (x > 0) {
                    sum += x;
                    count++;
                }
            }

            if (count == 0) {
                throw new ArithmeticException("Нет положительных элементов");
            }

            System.out.println("Среднее = " + (sum / (double) count));

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: нужно вводить числа");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
