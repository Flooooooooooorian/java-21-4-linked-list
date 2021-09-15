package de.neuefische.java214linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalListTest {

    @Test
    public void testToStringEmptyList() {
        //GIVEN
        AnimalList animalList = new AnimalList();
        //WHEN
        String actual = animalList.toString();
        //THEN
        assertEquals("", actual);
    }

    @Test
    public void testAddFirstItem() {
        //GIVEN
        AnimalList animalList = new AnimalList();
        Animal animal = new Animal();
        animal.setName("Hund");
        //WHEN
        animalList.add(animal);
        //THEN
        assertEquals("Hund", animalList.toString());
    }

    @Test
    public void testAddItem() {
        //GIVEN
        AnimalList animalList = new AnimalList();
        Animal animal1 = new Animal();
        animal1.setName("Hund");
        Animal animal2 = new Animal();
        animal2.setName("Katze");
        animalList.add(animal1);
        //WHEN
        animalList.add(animal2);
        //THEN
        assertEquals("Hund -> Katze", animalList.toString());
    }

    @Test
    public void testRemoveFirstElement() {
        //GIVEN
        AnimalList animalList = new AnimalList();
        Animal animal1 = new Animal();
        animal1.setName("Hund");
        Animal animal2 = new Animal();
        animal2.setName("Katze");
        animalList.add(animal1);
        animalList.add(animal2);
        //WHEN
        animalList.remove(animal1);
        //THEN
        assertEquals("Katze", animalList.toString());
    }

    @Test
    public void testRemoveLastElement() {
        //GIVEN
        AnimalList animalList = new AnimalList();
        Animal animal1 = new Animal();
        animal1.setName("Hund");
        Animal animal2 = new Animal();
        animal2.setName("Katze");
        animalList.add(animal1);
        animalList.add(animal2);
        //WHEN
        animalList.remove(animal2);
        //THEN
        assertEquals("Hund", animalList.toString());
    }

    @Test
    public void testRemoveMiddleElement() {
        //GIVEN
        AnimalList animalList = new AnimalList();
        Animal animal1 = new Animal();
        animal1.setName("Hund");
        Animal animal2 = new Animal();
        animal2.setName("Katze");
        Animal animal3 = new Animal();
        animal3.setName("Tiger");
        animalList.add(animal1);
        animalList.add(animal2);
        animalList.add(animal3);
        //WHEN
        animalList.remove(animal2);
        //THEN
        assertEquals("Hund -> Tiger", animalList.toString());
    }

    @Test
    public void testRemoveNotExistingElement() {
        //GIVEN
        AnimalList animalList = new AnimalList();
        Animal animal1 = new Animal();
        animal1.setName("Hund");

        //WHEN
        animalList.remove(animal1);
        //THEN
        assertEquals("", animalList.toString());
    }

    @Test
    public void testRemoveMultipleElement() {
        //GIVEN
        AnimalList animalList = new AnimalList();
        Animal animal1 = new Animal();
        animal1.setName("Hund");
        Animal animal2 = new Animal();
        animal2.setName("Hund");

        animalList.add(animal1);
        animalList.add(animal2);

        //WHEN
        animalList.remove(animal1);
        //THEN
        assertEquals("", animalList.toString());
    }

}