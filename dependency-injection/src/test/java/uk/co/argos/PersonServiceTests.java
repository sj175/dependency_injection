package uk.co.argos;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class PersonServiceTests {
    @Test
    public void testGetFavouriteFromId() {
        PersonService personService = new PersonService();
        String result = personService.getFavouriteFromId(42);
        assertEquals("user with id: 42 has favourite book: Foundation - I. Asimov", result);
    }

    //but what if I want to test the error handling in getFavouriteFromId?
    //What if I want to see what happens when a negative id is returned?
    //How can I control what the person repository returns?
}
