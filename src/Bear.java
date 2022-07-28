public class Bear extends WildAnimals  implements Walkable{
    public Bear(String name, String colour, int age, int weight) {
        super(name, colour, age, weight);
    }

    @Override
    void able() {
        System.out.println("Bear can walk in the forest");
    }

    @Override
    public void walk() {
        System.out.println("Bear is walkable");
    }

    @Override
    public String toString() {
        return "Bear{} " + super.toString();
    }


}
