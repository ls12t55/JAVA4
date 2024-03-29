import java.util.Scanner;

public class JPA401 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 宣告一個陣列來儲存 10 個整數
        int[] numbers = new int[10];

        // 輸入 10 個整數
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("第 %d 個整數：", i + 1);
            numbers[i] = scanner.nextInt();
        }

        // 計算陣列中大於 60 的數值個數、總合及平均值
        int count = 0;
        int sum = 0;
        for (int number : numbers) {
            if (number > 60) {
                count++;
                sum += number;
            }
        }
        double average = (double) sum / count;

        // 輸出結果
        System.out.println();
        System.out.printf("大於 60 的數值個數：%d\n", count);
        System.out.printf("大於 60 的數值總合：%d\n", sum);
        System.out.printf("大於 60 的數值平均值：%.2f\n", average);
    }
}

