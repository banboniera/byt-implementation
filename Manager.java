import java.util.ArrayList;
import java.util.List;

import models.Mechanic;
import models.Person;

public class Manager {
    private List<Person> persons;
    private List<Mechanic> mechanics;

    Manager() {
        this.persons = new ArrayList<>();
        this.mechanics = new ArrayList<>();
    }

    public void sendMessage(Person p) {
        if (persons.contains(p)) {
            System.out.println(String.format("Message was sent to %s", p));
            return;
        }
        System.out.println(String.format("There is no such person: %s", p));
    }

    public void registerNewPerson(Person p) {
        this.persons.add(p);
        System.out.println(String.format("Person: %s was succesfully registred", p));
    }
}
