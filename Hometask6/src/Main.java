public class Main {
    public static void main(String[] args) {
        Animals animal = new Animals();
        System.out.println("Тварини");


        Geese geese = new Geese("Гуси", "різнокольорові");
        geese.DomesticDescription();
        geese.GeeseDescription();

        Geese goose1 = new Geese("Один", "сірий");
        goose1.getDomesticAnimalsDescription();

        Geese goose2 = new Geese("Другий", "білий");
        goose2.getDomesticAnimalsDescription();
        geese.GeeseDescription();

        geese.voice(); geese.voice();

        Lion lion = new Lion();
        lion.count = 20000;
        System.out.println("Дім лева "+lion.getEnvironment());
        System.out.println("В дикій природі левів "+lion.count);
        lion.voice();
        lion.fearPeople();
    }
}
