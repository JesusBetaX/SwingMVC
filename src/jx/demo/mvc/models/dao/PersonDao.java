package jx.demo.mvc.models.dao;

import java.util.ArrayList;
import jx.demo.mvc.models.Person;

public class PersonDao {

  private final ArrayList<Person> objects;
  private static PersonDao personDao = new PersonDao();

  private PersonDao() {
    objects = new ArrayList<Person>();
    objects.add(new Person()
            .setFirstName("Hans").setLastName("Muster").setStreet("some street")
            .setPostalCode(12345).setCity("some city"));
    objects.add(new Person()
            .setFirstName("Ruth").setLastName("Mueller").setStreet("some street")
            .setPostalCode(12345).setCity("some city"));
    objects.add(new Person()
            .setFirstName("Heinz").setLastName("Kurz").setStreet("some street")
            .setPostalCode(12345).setCity("some city"));
    objects.add(new Person()
            .setFirstName("Cornelia").setLastName("Meier").setStreet("some street")
            .setPostalCode(12345).setCity("some city"));
    objects.add(new Person()
            .setFirstName("Werner").setLastName("Meyer").setStreet("some street")
            .setPostalCode(12345).setCity("some city"));
    objects.add(new Person()
            .setFirstName("Lydia").setLastName("Kunz").setStreet("some street")
            .setPostalCode(12345).setCity("some city"));
    objects.add(new Person()
            .setFirstName("Anna").setLastName("Best").setStreet("some street")
            .setPostalCode(12345).setCity("some city"));
    objects.add(new Person()
            .setFirstName("Stefan").setLastName("Meier").setStreet("some street")
            .setPostalCode(12345).setCity("some city"));
    objects.add(new Person()
            .setFirstName("Martin").setLastName("Mueller").setStreet("some street")
            .setPostalCode(12345).setCity("some city"));
    
  }

  public static PersonDao getInstance() {
    return personDao;
  }

  public ArrayList<Person> findAll() {
    return objects;
  }

  public void save(Person obj) {
    if (!objects.contains(obj)) {
      objects.add(obj);
    }
  }

  public boolean delete(Person obj) {
    return objects.remove(obj);
  }
}
