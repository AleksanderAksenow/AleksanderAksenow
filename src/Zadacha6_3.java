import java.util.Scanner;


public class Zadacha6_3 {
    public static void main(String[] args) {
        System.out.println("Привет, сейчас будем рисовать прямоугольник!!");
        int a = zapros("Введите высоту А:");
        int b = zapros("Введите ширину B:");
        risuem(a,b);
        risuemMassiv(massiv(a,b));
    }

/*
    static char[][][] massiv3D(char[][] massiv) {
        char[][][] massiv3d=new char[massiv.length][massiv[0].length][massiv.length];
        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv[0].length; j++) {
                massiv3d[i][j][0] = massiv[i][j];
                massiv3d[i][j][massiv.length - 1] = massiv[i][j];
            }
        }
    }
*/
    static int zapros(String zap) {
        Scanner in = new Scanner(System.in);
        System.out.print(zap);
        int vvod = in.nextInt();
        in.close();
        return vvod;
    }
    static void risuem(int a, int b){
        risuemGran(b);
        for (int i=1;i<a+1;i++){
            risuemProm(b);
        }
        risuemGran(b);
    }

    static void risuemGran(int b){
        System.out.print("+");
        for(int i=1;i<b+1;i++){
            System.out.print("-");
        }
        System.out.print("+\n");
    }

    static void risuemProm(int a){
        System.out.print("|");
        for(int i=1;i<a+1;i++){
            System.out.print(" ");
        }
        System.out.print("|\n");
    }

    static char[][] massiv(int a, int b) {
        char[][] mas=new char[a+2][b+2];
        mas[0][0]='+';
        mas[0][b+1]='+';
        for (int i = 1; i < b+1; i++) {
            mas[0][i]='-';
        }


        for(int j=1;j<a+1;j++){
            mas[j][0]='|';
            mas[j][b+1]='|';
            for (int k = 1; k < b +1; k++) {
                mas[j][k]=' ';
            }
        }

        mas[a+1][0]='+';
        mas[a+1][b+1]='+';
        for (int i = 1; i < b +1; i++) {
            mas[a+1][i]='-';
        }

        return mas;
    }
    static void risuemMassiv(char[][] mas){
        for (int i=0;i<mas.length;i++){
            for (int k=0;k<mas[1].length;k++){
                System.out.print(""+mas[i][k]);
            }
            System.out.print("\n");
        }
    }
}
