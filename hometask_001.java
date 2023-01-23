// Написать программу вычисления n-ого треугольного числа.
import java.util.Scanner;

public class hometask_001 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int x = iScanner.nextInt();
        int n = (x * (x + 1)) / 2;
        System.out.printf("Треугольное число равно: " + n);
        iScanner.close();
    }
}

// Вариант 2

// public class hometask_001 {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.print("Введите число: ");
//         int x = iScanner.nextInt();
//         System.out.println("Треугольное число равно: " + Trnumber(x));
//         iScanner.close();
//     }

//     public static int Trnumber(int n) {
//         if (n == 1) {
//             return 1;
//         }
//         return Trnumber(n - 1) + n;
//     }
// }