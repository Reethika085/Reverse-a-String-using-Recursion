import java.util.Scanner;

public class AntReturnCounter {
    public static int countReturns(int[] A) {
        int position = 0;
        int count = 0;
        for (int move : A) {
            position += move;
            if (position == 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] moves = new int[n];
        for (int i = 0; i < n; i++) {
            moves[i] = scanner.nextInt();
        }
        int result = countReturns(moves);
        System.out.println(result);

        scanner.close();
    }
}
