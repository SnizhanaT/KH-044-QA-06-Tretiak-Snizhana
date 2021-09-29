public class DomesticAnimals extends Animals {
    private String name;
    private String color;

    public DomesticAnimals(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void describeDomestic() {
        System.out.println("Жили у бабусі");
    }

    public void getDomesticAnimalsDescription() {
        System.out.println(this.getName() + " " + this.getColor());
    }
}
