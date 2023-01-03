package models.Test.models.Test;

import models.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.Permission;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    private Person luc;

    @BeforeEach
    public void setUp() {
        luc = new Person("RAJOELINA", "Jean Luc", "+487324589", new Date(1998, 06, 20), 4.5, "Pwd1234");
    }

    @Test
    void getSaldo() {

        assertEquals(4.5, luc.getSaldo(), "TODO");
    }

    @Test
    void verify() {
        assertEquals(true, luc.verify("+487324589"), "TODO");
    }

    @Test
    void addRemovePermission() {
        Permission permission1 = new RuntimePermission("Read");
        luc.addPermission(permission1);
        assertEquals(true, luc.hasPermission(permission1), "TODO");
        luc.removePermission(permission1);
        assertEquals(false, luc.hasPermission(permission1), "TODO");
    }


    @Test
    void checkPassword() {
        assertEquals(false, luc.checkPassword("abcd1234"), "TODO");
        assertEquals(true, luc.checkPassword("Pwd1234"), "TODO");
    }
}