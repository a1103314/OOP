import java.util.*;

class animal{
    String name;
    double height;
    int weight;
    int speed;

    void show(){
        System.out.println("項目姓名:"+this.name+" 身高(公尺):"+this.height+" 體重(公斤):"+this.weight+" 速度(公尺/分鐘):"+this.speed);
        return;
    }

    double distance(int x, double y){
        double sum=x*y*this.speed;
        System.out.println("距離為:"+sum);
        return sum;
    }

    double distance(int x){
        int sum2 = x*this.speed;
        System.out.println("距離為:"+sum2);
        return sum2;
    }
}

public class A1103314_0324_1{
    public static void main(String[] args) {
        // animal a, b ,c, d;
        // a=new animal();
        // b=new animal();
        // c=new animal();
        // d=new animal();

        // a.name="雪寶";
        // a.height=1.1;
        // a.weight=52;
        // a.speed=100;
        // a.show();

        // b.name="驢子";
        // b.height=1.5;
        // b.weight=99;
        // b.speed=200;
        // b.show();

        // c.name="安那";
        // c.height=1.7;
        // c.weight=48;
        // c.speed=120;
        // c.show();

        // d.name="愛沙";
        // d.height=1.7;
        // d.weight=50;
        // d.speed=120;
        // d.show();

        animal[] animals=new animal[4];

        animals[0]=new animal();
        animals[0].name="雪寶";
        animals[0].height=1.1;
        animals[0].weight=52;
        animals[0].speed=100;

        animals[1]=new animal();
        animals[1].name="驢子";
        animals[1].height=1.5;
        animals[1].weight=99;
        animals[1].speed=200;

        animals[2]=new animal();
        animals[2].name="安那";
        animals[2].height=1.7;
        animals[2].weight=48;
        animals[2].speed=120;

        animals[3]=new animal();
        animals[3].name="愛沙";
        animals[3].height=1.7;
        animals[3].weight=50;
        animals[3].speed=120;

        for(int i = 0;i < 4;i++){
            animals[i].show();
        }

        for(int i = 0;i < 4;i++){
            animals[i].show();
            Scanner type = new Scanner(System.in);
            System.out.println("請輸入"+(animals[i].name)+"的時間:");
            int time=type.nextInt();
            System.out.println("請輸入加速度:(若是無請輸入0)");
            double sp = type.nextDouble();
            if(sp != 0){
                animals[i].distance(time, sp);
            }else{
                animals[i].distance(time);
            }
        }
    }
}