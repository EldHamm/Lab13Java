import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Введите размер массива: ");
            int n = sc.nextInt();

            byte[] arr = new byte[n];

            System.out.println("Введите элементы:");
            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();

                if (val < -128 || val > 127) {
                    throw new ArithmeticException("Выход за диапазон byte");
                }

                arr[i] = (byte) val;
            }

            int sum = 0;
            for (byte b : arr) {
                sum += b;
            }

            System.out.println("Сумма = " + sum);

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: ввод должен быть числом");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
