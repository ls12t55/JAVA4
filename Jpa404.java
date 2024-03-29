public class JPA404 {

    public static void main(String[] args) {
        // 宣告一個陣列來儲存費氏數
        int[] fibonacciNumbers = new int[10];

        // 計算前 10 個費氏數
        for (int i = 0; i < fibonacciNumbers.length; i++) {
            if (i == 0 || i == 1) {
                fibonacciNumbers[i] = i;
            } else {
                fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
            }
        }

        // 輸出結果
        for (int fibonacciNumber : fibonacciNumbers) {
            System.out.printf("%d ", fibonacciNumber);
        }
        System.out.println();
    }
}
