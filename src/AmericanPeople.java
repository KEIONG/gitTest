public class AmericanPeople extends People{
    @Override
    public void speakHello() {
        System.out.println("hello,I am American!");

    }

    @Override
    public void averageHeight() {
        System.out.println("avarge heigh of American:" + this.height);
    }

    @Override
    public void averageWeight() {
        System.out.println("average weight of American:" + this.weight);
    }



    public void amercianBoxing(){
        System.out.println("I can boxing.");

    }
}
