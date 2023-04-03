import java.util.*;

public class animal{
    String name;
    double height;
    int weight;
    int speed;

    public animal(String x, double y, int z, int r){
        this.name= x;
        this.height= y;
        this.weight=z;
        this.speed=r;
    }

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

    public static void showinfo(){
        System.out.println("歡迎進入冰雪奇緣系統");
    }
}