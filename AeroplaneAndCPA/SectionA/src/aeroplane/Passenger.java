package aeroplane;

public abstract class Passenger implements PassengerInterface {

  protected String firstName;
  protected String surname;
  protected String TYPE;

  public Passenger(String firstName, String surname){
    this.firstName = firstName;
    this.surname = surname;
  }

  public String toString() {
    StringBuilder res = new StringBuilder();
    res.append(TYPE);
    res.append('-');
    res.append(firstName);
    res.append('-');
    res.append(surname);
    return res.toString();
  }
  // TODO: Section A, Task 2
}
