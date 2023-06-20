import java.util.*;

public class Avg3Num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое вещестевенное число: ");
        double dnum1 = scanner.nextDouble();
        System.out.println("Вы ввели: " + dnum1);
        System.out.println("Введите второе вещестевенное число: ");
        double dnum2 = scanner.nextDouble();
        System.out.println("Вы ввели: " + dnum2);
        System.out.println("Введите третье вещестевенное число: ");
        double dnum3 = scanner.nextDouble();
        System.out.println("Вы ввели: " + dnum3);
        double avg = (dnum1 + dnum2 + dnum3) / 3.0;
        System.out.print("Среднне арифмитическое введённых чисел - ");
        System.out.printf("%.4f", avg);
    }
}