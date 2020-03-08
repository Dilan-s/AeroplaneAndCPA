package aeroplane.PassengerTypes;

import aeroplane.Passenger;

public abstract class NonCrew extends Passenger {

  protected int age;

  public NonCrew(String firstName, String surname, int age) {
    super(firstName, surname);
    this.age = age;
  }

  @Override
  public boolean isAdult() {
    return age >= 18;
  }

  @Override
  public String toString() {
    StringBuilder res = new StringBuilder();
    res.append(super.toString());
    res.append('-');
    res.append(age);
    return res.toString();
  }
}
