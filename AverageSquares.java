public class AverageSquares {
    public static void main(String[] args) {

        int startNum = Integer.parseInt(args[0]);
        int endNum   = Integer.parseInt(args[1]);

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
