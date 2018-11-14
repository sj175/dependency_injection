package uk.co.argos;

public class PersonService {
    private PersonRepository personRepository;

    public PersonService() {
        this.personRepository = new PersonRepository();
    }

    public String getFavouriteFromId(int id) {
        return "user with id: " + id + " has favourite book: " + personRepository.getPerson(id).getFavouriteBook();
    }

    public static void main(String[] args) {
        PersonService s = new PersonService();
        System.out.println(s.getFavouriteFromId(42));
    }
}
