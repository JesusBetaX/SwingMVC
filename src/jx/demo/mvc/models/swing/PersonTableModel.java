package jx.demo.mvc.models.swing;

import jx.demo.mvc.models.Person;

public class PersonTableModel extends BaseTableModel<Person> {
  
  public PersonTableModel() {
    super("First Name", "Last Name", "Street", "Postal Code", "City");
  }

  @Override
  public Object getValueAt(int rowIndex, int columnIndex) {
    Person person = getItem(rowIndex);
    switch(columnIndex){
      case 0: return person.getFirstName();
      case 1: return person.getLastName();
      case 2: return person.getStreet();
      case 3: return person.getPostalCode();
      case 4: return person.getCity();
      default: return null;
    }
  }
}
