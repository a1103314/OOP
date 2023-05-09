import java.util.*;

public class A1103314_0505 {
    public static void main(String[] args) throws Exception{
        int lotto[]={2,5,14,19,21,30};
        Scanner sc=new Scanner(System.in);
        int[] mine=new int[6];

        for(int i=0;i<lotto.length;i++){
            System.out.print("請輸入您的第"+(i+1)+"位樂透號碼:");
            int num =sc.nextInt();
            if(num<1||num>49){
                throw new IllegalAccessException("輸入錯誤");
            }
            mine[i]=num;
        }
        int count=0;
        for(int j=0;j<6;j++){
            if(Arrays.binarySearch(lotto, mine[j])>=0){
                count++;
            }
        }
        if(count==6){
            System.out.println("中大獎拉~");
        }else{
            System.out.println("殘念QQ");
        }
    }
}
