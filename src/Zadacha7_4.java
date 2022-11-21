import java.util.Scanner;

public class Zadacha7_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите основание n:");
        int osnov = in.nextInt();
        if (osnov < 1) {
            System.out.println("Нельзя такое вводить!!!!");
        } else {
            System.out.println("Результат:" + formula(osnov));
        }
    }

    static double formula(int osnov) {
        double sum=0;
        if (osnov > 1) {
            sum+=Math.sqrt(osnov+formula(osnov - 1));            ;
            return sum;
        } else return 1;
    }
}
