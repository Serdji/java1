package app;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Person> persons = new ArrayList<>();

    public static void main(String[] args) {
        initPerson();
        filterAge();
    }

    public static void initPerson() {
        persons.add( new Person( "Иванов Иван Иваныч", "Инженер", "qwe@bk.ru", 895452313, 50000, 45 ) );
        persons.add( new Person( "Петров Анатолий Павлович", "Менеджер", "qwsd@bkr.ru", 895434, 60000, 25 ) );
        persons.add( new Person( "Сергеев Слава Генадьевич", "Программист", "fgh@ma.ru", 895512234, 150000, 30 ) );
        persons.add( new Person( "Ихихохихи Хихик Магметов", "Босс", ",boss@bker.ru", 777777777, 5000000, 50 ) );
        persons.add( new Person( "Харитонов Павел Павлович", "Продовец", "pash@bk.ru", 895454455, 80000, 35 ) );
        persons.add( new Person( "Ильин Сергей Валерьевич", "Бухгалтер", "yui@mail.ru", 895789313, 120000, 41 ) );
        persons.add( new Person( "Мурзиков Алексей Неколайевич", "Кадровик", "erter@go.ru", 895984313, 450000, 39 ) );
    }

    public static void filterAge(){
        for (Person person : persons) {
            if ( person.age >= 40 ) person.info();
        }
    }

}
