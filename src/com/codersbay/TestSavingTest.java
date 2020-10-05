package com.codersbay;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestSavingTest {

    @Test
    public void testEmptyList() {
        Saving savingList = new Saving();
        assertTrue(savingList.persons.isEmpty());
    }

    @Test
    public void testAddingPerson() {
        Saving savingPerson = new Saving();
        savingPerson.addPerson("Marco", "Kuvi", "23.05.2000", "MALE", 4870, "Voecklamarkt", "Lehrstrasse", 12);
        assertFalse(savingPerson.persons.isEmpty());
        assertEquals(1, savingPerson.persons.size());
        savingPerson.addPerson("John", "Wick", "04.04.1998", "MALE", 7889, "New York", "Broadway", 6);
        assertEquals(2, savingPerson.persons.size());
        assertEquals("Marco", savingPerson.persons.get(0).firstname);
    }

    @Test
    public void testRemovingPerson() {
        Saving removingPerson = new Saving();
        removingPerson.addPerson("John", "Wick", "04.04.1998", "MALE", 7889, "New York", "Broadway", 6);
        assertEquals(1, removingPerson.persons.size());
        removingPerson.removePerson(0);
        assertTrue(removingPerson.persons.isEmpty());
    }
}
