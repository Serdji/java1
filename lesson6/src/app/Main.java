package app;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat( "Вастка" );
        Dog dog = new Dog( "Барбос" );

        Cat cat2 = new Cat( "Прыгун", 700 );
        Dog dog2 = new Dog( "Гоньщик", 5 );

        cat.run( 300 );
        cat.jump( 1.4 );
        cat.swim( 5 );

        dog.run( 300 );
        dog.jump( 2 );
        dog.swim( 5 );

        cat2.jump( 3.5 );
        dog2.run( 650 );

    }
}
