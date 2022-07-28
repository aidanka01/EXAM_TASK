import java.util.Arrays;

public class Fish extends WildAnimals implements Swimmable {



    public Fish(String name, String colour, int age, int weight) {
        super(name, colour, age, weight);

    }
    @Override
    void able() {
        System.out.println("Fish can swim in the ocean");
    }

    @Override
    public void swim() {
        System.out.println("Fish is swimmable");
    }

    @Override
    public String toString() {
        return "Fish{} " + super.toString();
    }


}
