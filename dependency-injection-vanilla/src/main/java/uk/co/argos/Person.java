package uk.co.argos;

public class Person {
    // this is just an example of data which might be in your database
    private int id;
    private String favouriteBook;
    public Person(int id, String favouriteBook) {
        this.id = id;
        this.favouriteBook = favouriteBook;
    }

    public int getId() {
        return this.id;
    }

    public String getFavouriteBook() {
        return this.favouriteBook;
    }
}
