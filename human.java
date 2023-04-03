class human extends animal{
    String sexual;

    public human(String x, double y, int z, int r, String sex){
        super(x,y,z,r);
        this.sexual=sex;
    }

    void show(){
        System.out.println("項目姓名:"+this.name+" 身高(公尺):"+this.height+" 體重(公斤):"+this.weight+" 性別:"+this.sexual+" 速度(公尺/分鐘):"+this.speed);
    }
}