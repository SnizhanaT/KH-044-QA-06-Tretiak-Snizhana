public interface IFly {
    int MAXIMUM_HEIGHT  = 9000;

    void fly();

    void swim();
    default String eat(){
        return "листя";
    }
    static int getSpeed(){
        return 40;
    }
}