import java.util.*;

public class A1103314_0421_2{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("請輸入日期(格式必須為 YYYY/MM/DD或是MM/DD/YYYY):");
        String email=input.nextLine().trim();
        String[] dateParts = email.split("/");
        int year = 0, month = 0, day = 0;

        if (dateParts.length == 3) {
            year = Integer.parseInt(dateParts[0]);
            month = Integer.parseInt(dateParts[1]);
            day = Integer.parseInt(dateParts[2]);
        } else if (dateParts.length == 2) {
            year = Integer.parseInt(dateParts[2]);
            month = Integer.parseInt(dateParts[0]);
            day = Integer.parseInt(dateParts[1]);
        } else {
            System.out.println("日期格式不正確！");
            return;
        }

        System.out.println("年：" + year);
        System.out.println("月：" + month);
        System.out.println("日：" + day);
    }
}