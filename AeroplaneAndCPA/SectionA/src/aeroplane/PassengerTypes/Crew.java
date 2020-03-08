package aeroplane.PassengerTypes;

import aeroplane.Passenger;

public class Crew extends Passenger {

  public Crew(String firstName, String surname){
    super(firstName, surname);
    TYPE = "Crew";
  }

  @Override
  public boolean isAdult() {
    return true;
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
