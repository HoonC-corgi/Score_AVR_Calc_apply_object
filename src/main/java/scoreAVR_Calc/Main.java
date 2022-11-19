package scoreAVR_Calc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("수학, 과학, 영어 >> ");

        double math = scanner.nextDouble();
        double science = scanner.nextDouble();
        double english = scanner.nextDouble();

        Grade me = new Grade(math, science, english);
        System.out.print(me.average());

        scanner.close();
    }
}
