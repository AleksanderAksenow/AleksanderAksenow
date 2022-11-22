import java.util.Scanner;

/**
 * Написать программу, которая принимает длину и ширину прямоугольника (2 целых числа).
 * Нарисовать в консоли заданный прямоугольник, используя “-“ и “|”.
 * Углы прямоугольника обозначить символом “ “.
 * Каждая единица длины должна обозначаться одним символом “-“,
 * каждая единица ширины – символом “|“.
 * <p>
 * Произвести декомпозицию по своему усмотрению. Рекомендую скинуть на проверку. Контакт ниже.
 */
public class Zadacha9_1 {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);*/
        final Scanner SCANNER=new Scanner(System.in);

        int length = Rectangle.requireInt(/*scanner,*/ "Enter rectangle's length: ");
        int width = Rectangle.requireInt(/*scanner,*/ "Enter rectangle's width: ");

        /*Rectangle.*/SCANNER.close();

        String horizontalLine = Rectangle.createHorizontalLine(length);
        String verticalLines = Rectangle.createVerticalLines(length, width);

        Rectangle.printRectangle(horizontalLine, verticalLines);
    }

/*
    static int requireInt(Scanner scanner, String requiringMessage) {
        System.out.print(requiringMessage);

        return scanner.nextInt();
    }

    static void printRectangle(String horizontalLine, String verticalLines) {
        System.out.print(horizontalLine + verticalLines + horizontalLine);
    }

    static String createHorizontalLine(int length) {
        String horizontalLine = " ";

        for (int i = 0; i < length; i++) {
            horizontalLine += "-";
        }

        horizontalLine += " \n";

        return horizontalLine;
    }

    static String createVerticalLines(int length, int width) {
        String verticalLinesUnit = getVerticalLinesUnit(length);

        String verticalLines = "";

        for (int i = 0; i < width; i++) {
            verticalLines += verticalLinesUnit;
        }
        return verticalLines;
    }

    static String getVerticalLinesUnit(int length) {
        String verticalLinesUnit = "|";

        for (int i = 0; i < length; i++) {
            verticalLinesUnit += " ";
        }

        verticalLinesUnit += "|\n";
        return verticalLinesUnit;
    }
*/
}
