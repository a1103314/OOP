import java.util.*;

public class A1103314_0421_1{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("請輸入電子郵件信箱:");
        String email=input.nextLine();

        if(!email.matches("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$")){
            System.out.println("輸入錯誤");
        }
    }
}