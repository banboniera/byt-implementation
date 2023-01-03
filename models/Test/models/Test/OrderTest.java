package models.Test.models.Test;

import models.Car;
import models.Mechanic;
import models.Order;
import models.Person;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static models.Car.Status.IN_WORK;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderTest {

    private Order order1;
    private Car bmw;

    @BeforeEach
    public void setUp() {


        Person luc = new Person("RAJOELINA", "Jean Luc", "+487324589", new Date(1998, 06, 20), 4.5, "Pwd1234");

        Person person1 = new Person();
        Car bmw = new Car(person1, "BWM", "X6", "4587W", 240, IN_WORK);
        Mechanic mechanical = new Mechanic(luc, 12000, 5, 8);
        List<Mechanic> workers = Arrays.asList(mechanical);
        order1 = new Order(bmw, new Date(2022, 06, 20), IN_WORK , workers, 4500, true);
    }
    @AfterEach
    public void tearDown() {
        bmw.databaseCarNumber.clear();
    }
    @Test
    void getPrice() {
        assertEquals(0, order1.getPrice(1200,500),"TODO");

    }
}