package com.baeldung;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;

class ShallowCopyTest {
    @Test
    void testShallowCopy() {
        Address address = new Address("Glasgow");
        Person person1 = new Person("John", address);
        Person person2 = person1.shallowCopy();

        // Modifying the city of person2's address
        person2.address.city = "London";

        // Modifying person2's name
        person2.name = "Scott";

        // Both person1 and person2 share the same address object
        assertEquals("London", person1.address.city);
        assertEquals("London", person2.address.city);

        // person1's name should remain the same
        assertEquals("John", person1.name);

        // person2's name should be changed
        assertEquals("Scott", person2.name);
    }
}
