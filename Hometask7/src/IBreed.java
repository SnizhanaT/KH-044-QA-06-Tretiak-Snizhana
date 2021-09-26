public interface IBreed {
    String haveBreed();
    int getBreedCount();

    default String getPhilosophy() {
        return "Акуна матата!";
    }

}
