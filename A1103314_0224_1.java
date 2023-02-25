import java.util.*;

public class A1103314_0224_1{
    public static void main(String[] argv) {
        int num;

        System.out.print("請輸入任意整數：");
        Scanner n = new Scanner(System.in);
        num = n.nextInt();
        if(num % 2 == 0){
            System.out.print(num + "是偶數");
        }else{
            System.out.print(num + "是奇數");
        }
        
        n.close();
    }
}