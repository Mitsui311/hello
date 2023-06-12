import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int targetNumber = 30; // プログラマが設定した数
        int guessLimit = 5; // ユーザが数を入力できる回数
        int guessCount = 0; // 入力回数のカウント

        System.out.println("数当てゲームを始めます！");

        Scanner scanner = new Scanner(System.in);

        while (guessCount < guessLimit) {
            System.out.print("予想した数を入力してください（2桁の正の整数）: ");
            int userGuess = scanner.nextInt();
            guessCount++;

            if (userGuess == targetNumber) {
                System.out.println("当たり！");
                break;
            } else {
                if (userGuess > targetNumber) {
                    System.out.println("設定された数より大きいです。");
                } else {
                    System.out.println("設定された数より小さいです。");
                }

                if (Math.abs(userGuess - targetNumber) >= 20) {
                    System.out.println("20以上の差があります。");
                }
            }

            if (guessCount == guessLimit) {
                System.out.println("ゲームオーバー！正解は " + targetNumber + " でした。");
            }
        }

        scanner.close();
    }
}
