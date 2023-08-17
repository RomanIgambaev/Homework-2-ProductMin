import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
        System.out.print("Введите третье число: ");
        double num3 = scanner.nextDouble();
        double min1, min2;
        if (num1 <= num2 && num1 <= num3) {
            min1 = num1;
            if (num2 <= num3) {
                min2 = num2;
            } else {
                min2 = num3;
            }
        } else if (num2 <= num1 && num2 <= num3) {
            min1 = num2;
            if (num1 <= num3) {
                min2 = num1;
            } else {
                min2 = num3;
            }
        } else {
            min1 = num3;
            if (num1 <= num2) {
                min2 = num1;
            } else {
                min2 = num2;
            }
        }
        double productMin = min1 * min2;
        System.out.println("Произведение двух наименьших чисел: " + productMin);
    }
}