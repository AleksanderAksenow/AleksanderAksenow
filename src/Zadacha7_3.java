import java.util.Scanner;

public class Zadacha7_3 {//Найти факториал рекруссией
    public static void main(String[] args) {
        int osn=vvod("Введите основание факториала:");
        output(osn);
    }

    static void output(int osn){
        if (osn==0) {
            System.out.println("Факториал 0! равен: 1!");
        } else if (osn==1) {
            System.out.println("Факториал 1! равен: 1!");
        } else if (osn<0) {
            System.out.println("Нельхя вычислить факториал отрицательного числа!!!");
        } else {
            System.out.println("Факториал "+osn+"! равен:"+faktorial(osn));
        }
    }
    static int faktorial(int osn){
        if (osn==1) {
            return 1;}
            return osn*faktorial(osn-1);
        }

    static int vvod(String zapros){
        Scanner in=new Scanner(System.in);
        System.out.print(zapros);
        int osnovanie=in.nextInt();
        return osnovanie;
    }

}
