package uk.co.argos;

import java.util.Optional;

public class PersonService {
    private Repository personRepository;

    public PersonService(Repository personRepository) {
        //now we take the repository as an argument to the constructor
        this.personRepository = personRepository;
    }

    public String getFavouriteFromId(int id) {
        Optional<Person> maybePerson = Optional.ofNullable(personRepository.getPerson(id));
        return "user with id: " + id + " has favourite book: " + maybePerson.orElse(new Person(0, "")).getFavouriteBook();
    }

    public static void main(String[] args) {
        //we have to instantiate the repository and pass it in to the constructor of the service
        PersonService s = new PersonService(new PersonRepository());
        System.out.println(s.getFavouriteFromId(42));
    }
}
