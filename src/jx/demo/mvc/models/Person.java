package jx.demo.mvc.models;

public class Person {
  private long id;
  private String firstName;
  private String lastName;
  private String street;
  private int postalCode;
  private String city;

  public long getId() {
    return id;
  }

  public Person setId(long id) {
    this.id = id;
    return this;
  }

  public String getFirstName() {
    return firstName;
  }

  public Person setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public String getLastName() {
    return lastName;
  }

  public Person setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public String getStreet() {
    return street;
  }

  public Person setStreet(String street) {
    this.street = street;
    return this;
  }

  public int getPostalCode() {
    return postalCode;
  }

  public Person setPostalCode(int postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  public String getCity() {
    return city;
  }

  public Person setCity(String city) {
    this.city = city;
    return this;
  }

  @Override public String toString() {
    return firstName + " " + lastName;
  }
}
