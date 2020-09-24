package app;

public class Cat extends Animal {

    private final String ANIMAL = "Кот";
    private final int MAX_DISTANCE = 200;
    private double maxHeight;

    public Cat( String name ) {
        super( name );
        this.maxHeight = 2;
    }

    public Cat(String name,  double maxHeight ) {
        super( name );
        this.maxHeight = maxHeight;
    }

    public void run(int distance) {
        this.run( distance, ANIMAL, MAX_DISTANCE );
    };

    public void jump( double height) {
        super.jump( height, ANIMAL, maxHeight );
    };


    protected void swim(int distanceSwim) {
        System.out.println( "Коты не любят воду, по этопу не поплывет " + distanceSwim + "м" );
        System.out.println();
    }
}
