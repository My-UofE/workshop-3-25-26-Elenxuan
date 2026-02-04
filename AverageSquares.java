import java.util.Scanner;

public class AverageSquares {
    public static void main(String[] args) {

        int startNum, endNum;

        if (args.length >= 2) {
            startNum = Integer.parseInt(args[0]);
            endNum   = Integer.parseInt(args[1]);
        } else {
            Scanner in = new Scanner(System.in);
            startNum = in.nextInt();
            endNum   = in.nextInt();
        }

        double sum = 0;
        int count = 0;

        int i = startNum;
        do {
            sum += i * i;
            count++;
            i++;
        } while (i <= endNum);

        double average = sum / count;

        System.out.println("Average of squares from " + startNum + " to " + endNum + ":");
        System.out.println(average);
    }
}
