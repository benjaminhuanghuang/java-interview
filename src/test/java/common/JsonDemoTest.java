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


    @Test
    public void shouldDeserializeArray() throws Exception {
        String person_array_json = "[{\"id\":1, \"firstName\": \"Ben\",\n" +
                "    \"lastName\": \"Huang\",\n" +
                "    \"email\": \"ben@gmail.com\" }]";

        Person[] expectedPersonArray = new Person[] {new Person(1, "Ben", "Huang", "ben@gmail.com")};

        Person[] actualPersonArray = JsonDemo.deserializeArray(person_array_json);

        assertArrayEquals(actualPersonArray, expectedPersonArray);
    }

}