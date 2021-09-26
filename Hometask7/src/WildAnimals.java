public abstract class WildAnimals extends Animals {
    public int count;

    public WildAnimals() {
    }

    public void setCount(int count) {
        this.count = count;
    }

    public abstract String getEnvironment();

    public boolean fearPeople() {
        return true;
    }
}