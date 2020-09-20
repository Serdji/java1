package app;

public class Person {

    protected String fio;
    protected String profession;
    protected String email;
    protected int telephone;
    protected int salary;
    protected int age;


    public Person(String fio, String profession, String email, int telephone, int salary, int age) {
        this.fio = fio;
        this.profession = profession;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    protected void info() {
        System.out.println( this );
    }

    @Override
    public String toString() {
        return "\nФИО ='" + fio +
                ", \nПрофесия = " + profession +
                ", \nemail = " + email +
                ", \nТелефон = " + telephone +
                ", \nДолжность = " + salary +
                ", \nВозраст = " + age;
    }
}
