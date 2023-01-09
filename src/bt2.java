import java.util.Scanner;
public class bt2 {
    public static void main(String[] args) {
        int[] arrays = {1, 5, 7, 9, 5, 10, 1, 11, 30, 4, 16, 3};
        System.out.print("Mảng : ");
        int total = 0;
        int max = arrays[0];
        for (int i : arrays) {
            total += i;
            System.out.print(i + " ");
            if (max < i) {
                max = i;
            }
        }
        System.out.println(" ");
        System.out.println("Tổng của mảng là: " + total);
        System.out.println("Số lớn nhất là: " + max);
    }
}