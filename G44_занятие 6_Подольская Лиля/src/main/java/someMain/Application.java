package someMain;

public class Application {
    public static void main(String[] args) {
        ArrayAnimals someAnimals = new ArrayAnimals();
        ShowCycle showCycle = new ShowCycle();
        showCycle.showCycle(someAnimals.animalCycle());
    }
}
