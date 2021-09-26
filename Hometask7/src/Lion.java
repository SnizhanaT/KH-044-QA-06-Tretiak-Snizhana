public class Lion extends WildAnimals implements IBreed {
    public Lion() {
    }

    public String getEnvironment() {
        return "Дика природа";
    }

    public void voice() {
        System.out.println("Рррр!");
    }

    @Override
    public String haveBreed(){
        return "Сімба";
    }

    @Override
    public int getBreedCount() {
        return 0;
    }

    public static void main(String[] args) {
        Lion lion = new Lion();
        System.out.println(lion.haveBreed()+" спадкоємець лева");
        System.out.println(lion.getBreedCount()+1);
        System.out.println("Його філософія - "+lion.getPhilosophy());
    }
}