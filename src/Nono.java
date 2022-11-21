import java.util.Scanner;

public class Nono {
    public static void main(String [] args){

        int numC;
        int numL;
        //ввод количества строк
        System.out.println("Введите число строк ");
        Scanner inp = new Scanner(System.in);
        numL = inp.nextInt();
        //ввод количества столбцов
        System.out.println("Введите число столбцов ");
        numC = inp.nextInt();
        inp.close();

        char arrSqu[][] = new char[numL][numC];

/*
        arrSqu[0][0] = '*';
        arrSqu[numL-1][0] = '*';
        arrSqu[0][numC-1] = '*';
        arrSqu[numL-1][numC-1] = '*';
*/

        for (int i = 0; i <= numL-1; i++){

            for (int j = 0; j <= numC-1; j++){
                if (i == 0 | i == numL-1){
                    if (j!=0 & j!= numC-1){
                        arrSqu[i][j] = '-';
                    }
                    else arrSqu[i][j] = '*';

                }

                if (i != 0 & i != numL-1) {
                    if (j == 0 | j == numC - 1){
                        arrSqu[i][j] = '|';
                    }
                    else{
                        arrSqu[i][j] = ' ';
                    }

                }

                System.out.print(arrSqu[i][j]);

            }

            System.out.println();

        }

    }

}