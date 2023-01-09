import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số : ");
        int numbers = scanner.nextInt();
        System.out.printf("Các số nguyên tố là: ", numbers);
        int n = 2;
        while (n<numbers) {
            if (checkSnt(n)) {
                System.out.print(n + " ");
            }
            n++;
        }
    }

    public static boolean checkSnt(int i) {
        if (i<2) {
            return false;
        }
        for (int j=2;j<=i-1;j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}