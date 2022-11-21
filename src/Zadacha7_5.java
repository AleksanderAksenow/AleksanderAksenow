public class Zadacha7_5 {
    public static void main(String[] args) {
        int max = 10;
        int count = 1;
        int[] mas = new int[max];
        mas[max - 1] = 1;
        mas[max - 2] = 2;
        mas[max - 3] = 3;
        mas = poisk(mas, max - 3, count);
//        System.out.println("Сумма простых чисел=" + summa(mas, max));
        for (int i = 0; i < max; i++) {
            System.out.println(mas[i]);
        }

    }

    static int summa(int[] mas, int max) {
        int sum = 0;
        if (max > 0) {
            sum += mas[max]+summa(mas, max - 1);
        }
        return sum;
    }

    static int[] poisk(int[] mas, int max, int count) {
        if (max > 0) {
            for (int i = 2; count % i != 0 && i * 2 < count; i++) {
                if ((i + 1) * 2 >= count && count % i != 0) {
                    mas[max - 1] = count;
                                       System.out.println("!!!!!"+count+"!!!!!!");
                    --max;
                }
            }
            System.out.println("ddd  " + count + " " + max);
            mas = poisk(mas, max, ++count);

        }
        //   System.out.println(count);
        return mas;
    }
}
