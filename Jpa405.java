public class JPA409 {

    public static void main(String[] args) {
        // 宣告一個陣列來儲存 10 個字元
        String[] letters = new String[10];

        // 輸入 10 個字元
        for (int i = 0; i < letters.length; i++) {
            System.out.printf("第 %d 個字元：", i + 1);
            letters[i] = input.readLine();
        }

        // 反轉陣列
        for (int i = 0; i < letters.length / 2; i++) {
            String temp = letters[i];
            letters[i] = letters[letters.length - i - 1];
            letters[letters.length - i - 1] = temp;
        }

        // 輸出結果
        System.out.println();
        System.out.print("反轉陣列：");
        for (String letter : letters) {
            System.out.print(" " + letter);
        }
        System.out.println();
    }
}
