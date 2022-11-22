import java.util.Scanner;

public class Rectangle {
    public static final String UGOL="++";
    public static final String GORIZONT="==";
    public static final String VERTICAL="||";
    public static final String PROBEL="  ";
 /*   public static final Scanner SCANNER=new Scanner(System.in);*/

    static int requireInt(/*Scanner scanner,*/ String requiringMessage) {
        System.out.print(requiringMessage);

        return SCANNER.nextInt();
    }

    static void printRectangle(String horizontalLine, String verticalLines) {
        System.out.print(horizontalLine + verticalLines + horizontalLine);
    }

    static String createHorizontalLine(int length) {
        String horizontalLine = UGOL;

        for (int i = 0; i < length; i++) {
            horizontalLine += GORIZONT;
        }

        horizontalLine += UGOL+"\n";

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
        String verticalLinesUnit = VERTICAL;

        for (int i = 0; i < length; i++) {
            verticalLinesUnit += PROBEL;
        }

        verticalLinesUnit += VERTICAL+"\n";
        return verticalLinesUnit;
    }

}
