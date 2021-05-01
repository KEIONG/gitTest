public class ChinaPeople extends People{
    @Override
    public void speakHello() {
        System.out.println("hello,I am ChinaPeople.");
    }

    @Override
    public void averageHeight() {
        System.out.println("avarge heigh of ChinaPeople:" + this.height);
    }

    @Override
    public void averageWeight() {
        System.out.println("average weight of ChinaPeople:" + this.weight);


    }

    public void chinaGongfu(){
        System.out.println("I can gongfu.");
    }

}
