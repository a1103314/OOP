import java.util.Scanner;

public class A1103314_0224_2 {
    public static void main(String[] argv) {
        double cel, fah;

        System.out.print("請輸入攝氏溫度：");
        Scanner tem = new Scanner(System.in);
        cel = tem.nextDouble();
        fah = cel * 9 / 5 + 32;
        System.out.print("攝氏溫度" + cel + "為華氏溫度的" + fah);

        tem.close();
    }
}
