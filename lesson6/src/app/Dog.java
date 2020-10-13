package app;

public class Dog extends Animal {

    private final String ANIMAL = "Собака";
    private final double MAX_HEIGHT = 0.5;
    private final int MAX_DISTANCE_SWIM = 10;

    private int maxDistance;

    public Dog( String name ) {
        super( name );
        this.maxDistance = 500;
    }

    public Dog( String name, int maxDistance) {
        super( name );
        this.maxDistance = maxDistance;
    }

    protected void run(int distance) {
        super.run( distance, ANIMAL, maxDistance );
    };

    protected void jump(double height) {
        super.jump( height, ANIMAL, MAX_HEIGHT );
    };

    protected void swim(int distanceSwim) {
        super.swim( distanceSwim, ANIMAL, MAX_DISTANCE_SWIM );
    }
}
