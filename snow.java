class snow extends human{
    String ability;

    public snow(String x, double y, int z, int r, String sex, String abi){
        super(x,y,z,r,sex);
        this.ability=abi;
    }

    void show(){
        System.out.println("項目姓名:"+this.name+" 身高(公尺):"+this.height+" 體重(公斤):"+this.weight+" 性別:"+this.sexual+" 冰凍技能:"+this.ability+" 速度(公尺/分鐘):"+this.speed);
    }

    double distance(int x, double y){
        double sum=x*y*this.speed*2;
        System.out.println("距離為:"+sum);
        return sum;
    }

    double distance(int x){
        int sum2 = x*this.speed*2;
        System.out.println("距離為:"+sum2);
        return sum2;
    }
}