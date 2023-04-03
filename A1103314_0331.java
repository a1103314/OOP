import java.util.*;

public class A1103314_0331{
    public static void main(String[] args) {
        animal.showinfo();

        animal[] animals=new animal[6];
        animals[0]=new animal("雪寶",1.1,52,100);
        animals[1]=new animal("驢子",1.5,99,200);
        animals[2]=new human("阿克",1.9,80,150,"男");
        animals[3]=new human("漢斯",1.8,78,130,"男");
        animals[4]=new human("安那", 1.7,48,120,"女");
        animals[5]=new snow("愛沙",1.7,50,120,"女","Yes");

        for(int i = 0;i < animals.length;i++){
            animals[i].show();
        }

        for(int i = 0;i < animals.length;i++){
            animals[i].show();
            Scanner type = new Scanner(System.in);
            System.out.print("請輸入"+(animals[i].name)+"的時間:");
            int time=type.nextInt();
            System.out.print("請輸入加速度(若是無請輸入0):");
            double sp = type.nextDouble();
            if(sp != 0){
                animals[i].distance(time, sp);
            }else{
                animals[i].distance(time);
            }
        }
    }
}