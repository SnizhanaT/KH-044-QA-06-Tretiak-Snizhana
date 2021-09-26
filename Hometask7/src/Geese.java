public class Geese extends DomesticAnimals implements IFly, IBreed{
    public Geese(String name, String color) {
        super(name, color);
    }

    public void describeGeese() {
        System.out.println("Два веселих гусі");
    }

    public void voice() {
        System.out.println("Кря!");
    }

    public void fly(){
        System.out.println("Наші гуси відлетіли");
    }
    public void swim(){
        System.out.println("Гуси можуть зупинятись на воді і плавати");
    }

    @Override
    public String haveBreed() {
        return "каченя Нільс";
    }

    @Override
    public int getBreedCount() {
        return 1;
    }

    public static void main(String[] args) {
        Geese geese = new Geese("Гуси", "сірі");
        geese.fly();
        System.out.println("На висоті "+MAXIMUM_HEIGHT+" метрів");
        System.out.println("Швидкість - "+IFly.getSpeed()+" км/год");
        geese.swim();
        System.out.println("Гуси їдять "+geese.eat());
        System.out.println("Гуси мають потомство - "+geese.getBreedCount()+" "+geese.haveBreed());
    }
}