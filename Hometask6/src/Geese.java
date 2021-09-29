public class Geese extends DomesticAnimals {

    public Geese(String name, String color) {
        super(name, color);
    }

    public void describeGeese() {
        System.out.println("Два веселих гусі");
    }

    @Override
    public void voice(){
        System.out.println("Кря!");
    }
}