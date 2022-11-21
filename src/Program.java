import java.io.*;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        //Задания из изучения урок 5 Задача 3* поиск простых чисел//
        int k = 0; //счетчик массива простых чисел
        int[] mas = new int[10]; //массив простых чисел
        int sum=0; //переменная суммы простых чисел
        int i; //счетчик цикла
        int num = 1; //стартовая позиция поиска простых чисел (-1)
        while (k != 10) { //перебор для записи простых чисел
            num+=2;
            i = num - 1; //чтобы не делить на самого себя
            while (i > 1 & num % i != 0) { //Выход из перебора если число разделилось без остатка
                if (i == 2) { // запись простого числа при достижении дна цикла
                    mas[k] = num;
                    System.out.println("Ура!!! Число: " + num + " " + k);
                    k++;
                }
                i--;
            }
        }
        for (int sum1:mas){
            sum+=sum1;
        }
        System.out.println("Сумма всех простых чисел: "+sum);

        //Задания из изучения урок 5 Задача 2 заполнение массива//
        /*Scanner in = new Scanner(System.in);
        int[] mas = new int[5];
        for (int i = 0; i != 5; i++) {
            System.out.printf("Введите %d член массива:", i);
            mas[i] = in.nextInt();
        }
        for (int i = 0; i < mas.length; i++) {
            if (i == 0) {
                System.out.println(mas[i] + mas[mas.length-1]);
            } else {
                System.out.println(mas[i] + mas[i - 1]);
            }
        }
        in.close();*/

        //Задания из изучения урок 5 Задача 1 заполнение массива//
        /*char[] name = new char[]{'А', 'Л', 'Е', 'К', 'С', 'А', 'Н', 'Д', 'Р'};
        System.out.println(name);
        for (char buk : name
        ) {
            System.out.printf("%c", buk);
        }
        String imya = "";
        for (char buk : name
        ) {
            imya += buk;
        }
        System.out.println("\n"+ imya);*/

        //Задания из изучения урок 4 Задача 5 угадать число//
       /* Scanner in = new Scanner(System.in);
        int num;
        do {
            System.out.println("Введите число:");
            num=in.nextInt();
            if (num!=1) {
                System.out.println("Не угадал!!!");
            }
        }
        while (num!=1);
        System.out.println("Угадал!!!");
        in.close();*/

        //Задания из изучения урок 4 Задача 4 чтото с числами//
/*        Scanner in = new Scanner(System.in);
        System.out.print("Введите число:");
        int num2= in.nextByte();
        for (int i=1;i<11;i++){
        if (num2%2==0&&num2!=0) {
            System.out.printf("%d + %d = %d\n",i, num2, i+num2);
            if (num2==i) {
                System.out.printf("Числа %d и %d равны \n",num2,i);}
        } else if (num2==0) {
            System.out.printf("Не стоило вводить 0!!!!\n");
        }
         else {
            System.out.printf("%d - %d = %d\n",i,num2, i-num2);
            if (num2==i) {
                System.out.printf("Числа %d и %d равны \n",num2,i);}}
        }
        in.close();*/


        //Задания из изучения урок 4 Задача 3 нарисовать прямоугольник//
        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите ширину:");
        int a = in.nextInt();
        System.out.print("Введите высоту:");
        int b = in.nextInt();

        System.out.printf("+");
        for (int i = 1; i != a; i++) {
            System.out.printf("-");
        }
        System.out.printf("+\n");

        int a1;

        while (b > 1) {
            a1 = a;
            System.out.printf("|");
            while (a1 > 1) {
                System.out.printf(" ");
                a1--;
            }
            System.out.printf("|\n");
            b--;
        }
        System.out.printf("+");
        for (int i = 1; i != a; i++) {
            System.out.printf("-");
        }
        System.out.printf("+");*/

        //Задания из изучения урок 4 Задача 2 сумма числ числа//
        /*Scanner in=new Scanner(System.in);
        System.out.println("Введите число:");
        int num1 = in.nextInt();
        int num=num1;
        int sum=0;
        while (num>0){
        sum+=num%10;
        num/=10;
            System.out.printf("%d %d \n" ,sum,num);}
        System.out.printf("Итоговая сумма цифр числа %d = %d",num1, sum);*/
        //Задания из изучения урок 4 Задача 1 факториал//
   /*     Scanner in=new Scanner(System.in);
        System.out.print("Введите основание факториала:");
        int fak=in.nextInt();
        int fakt=1;
        if (fak>0){
        for (int i=1;i!=fak+1;i++){
            fakt*=i;
            System.out.println(fakt);
        }}
        else {
            System.out.println("Ты че, должно быть больше 0!!!!");}
        System.out.println(fakt);*/
        //Калькулятор 2 упражнение 6 циклы метанит//
/*        Scanner in=new Scanner(System.in);
        for(int otv=2;otv!=1;){
            System.out.print("Введите число А:");
            int a=in.nextInt();
            System.out.print("Введите число B:");
            int b=in.nextInt();
            System.out.println(a+"*"+b+"="+a*b);
            System.out.println("Хотите ещ раз? Если нет введите 1:");
            otv=in.nextInt();
        }*/
//калькулятор1 упражнение 5 циклы метанит//
/*char probel=' ';
for (int a=1;a<10;a++){
    System.out.println();
    for (int b=1;b<10;b++){
        System.out.print(a*b+" ");
        if (a*b<10) {System.out.print(probel);}
    }
}

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d\t", i * j);
            }
            System.out.println();
        }*/
/*        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму вклада:");
        float vklad = in.nextFloat();
        System.out.println("Введите срок вклада (месяцы):");
        int srok= in.nextInt();
        int i=1;
        //for (int i=1;i<=srok;i++)
        while(i<=srok){
            vklad+= vklad*0.07;
            System.out.printf(" %d сумма %f\n",i,vklad);
            i++;
        }*/
 /*       String strana = "XYZ";
        double nas = 10000000d;
        double rozd = 14d / 1000;
        double smertn = 8d / 1000;
        int srok = 10;
        int i=1;


        do {

            if (rozd>7d/1000) {rozd=rozd-1d/1000;}
            if (smertn>6d/1000) {smertn=smertn-1d/1000;}
            nas = nas - Math.ceil(nas * smertn) + Math.ceil(nas * rozd);
            System.out.printf("%d. Население: %.2f\n" ,i,nas);
            i++;
        } while(i<11);
        System.out.printf("Население: %.2f\n" ,nas);*/

/*        String strana = "XYZ";
        double nas = 10000000d;
        double rozd = 14d / 1000;
        double smertn = 8d / 1000;
        int srok = 10;


        for (int i = 1; i <= srok; ++i) {

            if (rozd>7d/1000) {rozd=rozd-1d/1000;}
            if (smertn>6d/1000) {smertn=smertn-1d/1000;}
            nas = nas - Math.ceil(nas * smertn) + Math.ceil(nas * rozd);
            System.out.printf("%d. Население: %.2f\n" ,i,nas);
        }
        System.out.printf("Население: %.2f\n" ,nas);

        int population = 10000000;
        int born = 14;
        int death = 8;
        for(int i = 1; i <= 10; i++){
            if (born > 7) born -= 1;
            if  (death > 6) death -=1;
            population += population * (born - death) / 1000;
        }
        System.out.println(population);*/

 /*       String strana = "XYZ";
        double nas = 10000000d;
        double rozd = 14d / 1000;
        double smertn = 8d / 1000;
        int srok = 10;


        for (int i = 1; i <= srok; ++i) {
            nas = nas - Math.ceil(nas * smertn) + Math.ceil(nas * rozd);
            System.out.printf("%d. Население: %.2f\n" ,i,nas);
        }
        System.out.printf("Население: %.2f\n" ,nas);

        int population = 10000000;
        int born = 14;
        int death = 8;
        int dif = born - death;
        for(int i = 1; i <= 10; i++){
            population += population * dif / 1000;
        }
        System.out.println(population);
*/
 /*       int a = 5;

        int b = 10;
        // место для вашего кода
        int c;
        c = a;
        a = b;
        b = c;
        // место для вашего кода

        System.out.println("Значение а: " + a + ". Значение b: " + b);
        b = a + b;
        a = b - a;
        b = b - a;
        System.out.println("Значение а: " + a + ". Значение b: " + b);

        String name = "Аксенов Александр Михайлович";
        char symb1 = 'С';
        char symb2 = 'а';
        char symb3 = 'ш';
        String name2;
        final char[] symbols = new char[10];
        symbols[0] = 'A';
        symbols[1] = 'B';
        System.out.println(symbols);

        System.out.println(name);
        System.out.println(name);
        System.out.println(symb1 + "" + symb2 + "" + symb3 + "" + symb2);
        System.out.println(symb1 + "\n" + symb2 + "\n" + symb3 + "\n" + symb2);

        System.out.print(symb1);
        System.out.print(symb2);
        System.out.print(symb3);
        System.out.print(symb2);
        System.out.print(name);


        System.out.print("\n" + symb1);
        System.out.print("\n" + symb2);
        System.out.print("\n" + symb3);
        System.out.print("\n" + symb2);

        char[] nn = name.toCharArray();

        int i = 0;

        while (i <= nn.length-1) {
            System.out.print(nn[i] + "\n");
            i++;
        }*/
        //       in.close();
    }
}