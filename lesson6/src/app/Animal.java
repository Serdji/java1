package app;

public abstract class Animal {


    String name;

    public Animal( String name ) {
        this.name = name;
    }

    protected void run( int distance, String animal, int maxDistance ) {
        String answer = distance <= maxDistance ? "Да" : "Нет";
        System.out.println( "Животное: " + animal + "\nИмя: " + name + "\nПробежит дистанцию в: " + distance + "м" + "\nОтвет: " +  answer );
        System.out.println();
    };

    protected void jump( double height, String animal, double maxHeight ) {
        String answer = height <= maxHeight ? "Да" : "Нет";
        System.out.println( "Животное: " + animal + "\nИмя: " + name + "\nПерепрытнет высоту в: " + height  + "м" + "\nОтвет: " +  answer );
        System.out.println();
    };

    protected void swim( int distanceSwim, String animal, int maxDistanceSwim ) {
        String answer = distanceSwim <= maxDistanceSwim ? "Да" : "Нет";
        System.out.println( "Животное: " + animal + "\nИмя: " + name + "\nПроплывет дистанцию в: " + distanceSwim  + "м" + "\nОтвет: " +  answer );
        System.out.println();
    };

}
