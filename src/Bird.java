public class Bird extends WildAnimals implements Flyable{
    public Bird(String name, String colour, int age, int weight) {
        super(name, colour, age, weight);
    }

    @Override
    void able() {
        System.out.println("Bird can fly in the sky");
    }

 @Override
 public void fly() {
     System.out.println("Bird is flyable");
 }
    @Override
    public String toString() {
        return "Bird{} " + super.toString();
    }
}

