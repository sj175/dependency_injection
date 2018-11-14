package uk.co.argos;

public class PersonRepository {
    //this is just an example. In real life this would actually access a database
    public PersonRepository() {
        System.out.println("I'm connecting to a database");
    }

    public Person getPerson(int id) {
        System.out.println("accessing database...");
        return new Person(id, "Foundation - I. Asimov");
    }
}
