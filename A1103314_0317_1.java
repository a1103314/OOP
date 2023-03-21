import java.util.Scanner;

public class A1103314_0317_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("請輸入n：");
        int n = sc.nextInt();
        
        System.out.print("請輸入m：");
        int m = sc.nextInt();

        int[][] Array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Array[i][j] = (i + 1) * (j + 1);
            }
        }
        
        System.out.println("二維陣列內容：");
        for (int[] row : Array) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
        
        sc.close();
    }

}
