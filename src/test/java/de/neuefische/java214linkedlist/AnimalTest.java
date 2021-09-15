package de.neuefische.java214linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {


    @Test
    public void AnimalToStringTest() {
        //GIVEN
        Animal animal = new Animal();
        animal.setName("Katze");

        //WHEN
        String actual = animal.toString();

        //THEN
        assertEquals("Katze", actual);
    }

}