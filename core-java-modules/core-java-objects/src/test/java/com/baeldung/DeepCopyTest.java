package com.baeldung;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DeepCopyTest {
    @Test
    void testDeepCopy() {
        Address address = new Address("Glasgow");
        Person person1 = new Person("John", address);
        Person person2 = person1.deepCopy();

        // Modifying the city of person2's address
        person2.address.city = "London";

        // person1 and person2 do not share the same address object
        assertEquals("Glasgow", person1.address.city);
        assertEquals("London", person2.address.city);

        // person1's name should remain the same
        assertEquals("John", person1.name);

        // person2's name should also remain the same (not modified in the example)
        assertEquals("John", person2.name);
    }
}
