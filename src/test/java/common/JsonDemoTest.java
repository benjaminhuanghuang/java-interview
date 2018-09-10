package common;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class JsonDemoTest {
    @Test
    public void shouldDeserializeObject() throws Exception {
        String person_json = "{\"id\":1, \"firstName\": \"Ben\",\n" +
                "    \"lastName\": \"Huang\",\n" +
                "    \"email\": \"ben@gmail.com\" }";

        Person expectedPerson = new Person(1, "Ben", "Huang", "ben@gmail.com");

        Person actualPerson = JsonDemo.deserialize(person_json);

        assertEquals(actualPerson, expectedPerson);
    }

}