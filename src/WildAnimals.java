public abstract class WildAnimals {
    private String name;
    private String colour;
    private int age;
    private int weight;


    public WildAnimals(String name, String colour, int age, int weight) {
        this.name = name;
        this.colour = colour;
        this.age = age;
        this.weight = weight;
    }



    abstract void able();

    @Override
    public String toString() {
        return "WildAnimals{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
