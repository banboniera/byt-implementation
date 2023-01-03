package models.Test.models.Test;

import models.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static models.Car.Status.IN_WORK;
import static models.Part.Status.ONSTOCK;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PartTest {
    private Part gear ;
    private Person luc ;
    private Person person1 ;
    private Car bmw ;
    private Mechanic mechanical ;
    private List<Mechanic> workers;
    private Order order1 ;
    @BeforeEach
    public void setUp() {
        luc = new Person("RAJOELINA", "Jean Luc", "+487324589", new Date(1998, 06, 20), 4.5, "Pwd1234");

        person1 = new Person();
        bmw = new Car(person1, "BWM", "X6", "4587W", 240, IN_WORK);
        mechanical = new Mechanic(luc, 12000, 5, 8);
        workers = Arrays.asList(mechanical);
        order1 = new Order(bmw, new Date(2022, 06, 20), IN_WORK , workers, 4500, true);

        gear = new Part( order1, 4500, "ae11", 4500, ONSTOCK) ;
    }
    @AfterEach
    public void tearDown() {
        bmw.databaseCarNumber.clear();
    }
    @Test
    void getStatus() {
        assertEquals(ONSTOCK,gear.getStatus(), "TODO");
    }
}