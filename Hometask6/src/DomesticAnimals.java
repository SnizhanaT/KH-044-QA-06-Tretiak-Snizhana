public class DomesticAnimals extends Animals {

    public void DomesticDescription() {
        System.out.println("Жили у бабусі");
    }
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private String color;
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void getDomesticAnimalsDescription() {
        System.out.println(getName()+" "+getColor());
    }
    public DomesticAnimals(String name, String color){
        this.name = name;
        this.color = color;
    }

}
