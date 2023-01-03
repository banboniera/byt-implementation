package models.Test.models.Test;

import models.Car;
import models.Person;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static models.Car.Status.IN_WORK;


class CarTest {
    Person luc;
    Car bmw;

    @BeforeEach
    public void setUp() throws Exception {
        luc = new Person("RAJOELINA", "Jean Luc", "+487324589",new Date(1998, 06, 20), 4.5, "Pwd1234");
        bmw = new Car(luc, "BWM", "X6", "4587W", 240, IN_WORK) ;
    }
    @AfterEach
    public void tearDown() {
        bmw.databaseCarNumber.clear();
    }

    @Test
    public void getStatus() {

        Assert.assertEquals("TODO", IN_WORK, bmw.getStatus());
    }

    @Test
    public void testHousePowerNull() {
        Car audi = new Car(luc, "Audi", "Q7", "ABCD", -1, IN_WORK) ;
    }

    @Test
    public void testCarNumberAlreadyExist() {
        Car audi = new Car(luc, "Audi", "Q7", "4587W", 5000, IN_WORK) ;
    }
}