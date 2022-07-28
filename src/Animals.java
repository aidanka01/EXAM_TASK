import java.util.Arrays;

public class Animals {
    private Fish [] fish;
    private Bear [] bears;
    private Bird [] birds;

     public Animals(Fish[] fish, Bear[] bears, Bird[] birds) {
        this.fish = fish;
        this.bears = bears;
        this.birds = birds;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "fish=" + Arrays.toString(fish) +
                ", bears=" + Arrays.toString(bears) +
                ", birds=" + Arrays.toString(birds) +
                '}';
    }
}
