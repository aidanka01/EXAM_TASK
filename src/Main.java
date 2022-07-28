public class Main {
    public static void main(String[] args) {



        Fish fish1 = new Fish("Bento", "white-blue", 2, 7);
        Fish fish2 = new Fish("Shark", "blue", 5, 230);
        Bear bear1 = new Bear("Anti", "brown", 5, 200);
        Bear bear2 = new Bear("Misha", "black", 3, 100);
        Bird bird1 = new Bird("Parrot", "pink", 2, 3);
        Bird bird2 = new Bird("Berry", "blue", 1, 2);

        Bird [] birds = {bird1, bird2};
        Fish [] fish = {fish1, fish2};
        Bear [] bears = {bear1, bear2};
        Animals animals = new Animals(fish, bears, birds);
        System.out.println(animals);

        bird1.able();
        bird2.fly();
        bear1.able();
        bear2.walk();
        fish1.able();
        fish2.swim();


}
    }





