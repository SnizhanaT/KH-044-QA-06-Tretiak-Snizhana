public class Geese extends DomesticAnimals {

    public void GeeseDescription() {
        System.out.println("Два веселих гусі");
    }
    public Geese(String name, String color) {
        super(name, color);
    }

    @Override
    public void voice(){
        System.out.println("Кря!");
    }
}