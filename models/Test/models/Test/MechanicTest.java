package models.Test.models.Test;

import models.Car;
import models.Mechanic;
import models.Order;
import models.Person;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static models.Car.Status.IN_WORK;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MechanicTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    private Mechanic mechanical;
    private Order order1;
    private Person luc;
    private Car bmw;
    private Person person1;
    private Car person1Car;
    private List<Mechanic> workers;


    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));

        luc = new Person("RAJOELINA", "Jean Luc", "+487324589", new Date(1998, 06, 20), 4.5, "Pwd1234");
        bmw = new Car(luc, "BWM", "X6", "4587K", 240, IN_WORK);
        Person person1 = new Person("RAJOELINA", "Jean Luc", "+487324589", new Date(1998, 06, 20), 4.5, "Pwd1234");
        Car person1Car = new Car(luc, "Audi", "Q7", "ABCD7", 240, IN_WORK);
        mechanical = new Mechanic(luc, 12000, 5, 8);
        workers = Arrays.asList(mechanical);
        order1 = new Order(person1Car, new Date(2022, 12, 25), IN_WORK, workers, 4000, true);
    }
    @AfterEach
    public void tearDown() {
        bmw.databaseCarNumber.clear();
    }

    @Test
    void testToString() {
        assertEquals("worker RAJOELINA Jean Luc", mechanical.toString(),"TODO");

    }

    @Test
    void AddshowOrders() {
        mechanical.addOrder(order1);
        mechanical.showOrders();
        System.out.println();
        assertEquals("Orders for worker RAJOELINA Jean Luc\r\nOrder for car Audi number ABCD7",outputStreamCaptor.toString().trim());
    }


    @Test
    void getSaldo() {
        assertEquals(4.5, mechanical.getSaldo(), "TODO");
    }
}


