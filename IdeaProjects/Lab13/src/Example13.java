public class Example13 {
    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("размер массива = " + l);

            int h = 10 / l;   // может быть деление на 0

            args[l + 1] = "10"; // выход за границы массива

        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс не существует");
        }
    }
}
