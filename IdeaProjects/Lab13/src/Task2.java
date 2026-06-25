import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Введите размер матрицы (n m): ");
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[][] a = new int[n][m];

            System.out.println("Введите матрицу:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            System.out.print("Введите номер столбца: ");
            int col = sc.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.println(a[i][col]);
            }

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: ввод должен быть числом");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: нет такого столбца");
        }
    }
}