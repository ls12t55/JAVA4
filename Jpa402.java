import java.util.Scanner;

public class JPA402 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 輸入學生人數
        System.out.print("請輸入學生人數：");
        int studentCount = scanner.nextInt();

        // 建立一個陣列來儲存學生成績
        double[] scores = new double[studentCount];

        // 輸入每位學生成績
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("第 %d 位學生成績：", i + 1);
            scores[i] = scanner.nextDouble();
        }

        // 計算總分、平均值
        double totalScore = 0;
        for (double score : scores) {
            totalScore += score;
        }
        double averageScore = totalScore / studentCount;

        // 輸出結果
        System.out.println();
        System.out.printf("總分：%.2f\n", totalScore);
        System.out.printf("平均值：%.2f\n", averageScore);
    }
}
