package de.neuefische.java214linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalListItemTest {


    @Test
    public void AnimalListItemToStringTest() {
        //GIVEN
        Animal animal = new Animal();
        animal.setName("Tiger");
        AnimalListItem animalListItem = new AnimalListItem(animal);

        //WHEN
        String actual = animalListItem.toString();

        //THEN
        assertEquals("Tiger", actual);
    }

}