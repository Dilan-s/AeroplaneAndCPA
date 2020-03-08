package aeroplane.PassengerTypes.NonCrewTypes;

import aeroplane.PassengerTypes.NonCrew;

public class EconomyClass extends NonCrew {

  public EconomyClass(String firstName, String surname, int age){
    super(firstName, surname, age);
    TYPE = "EconomyClass";
  }
  @Override
  public String toString() {
    return super.toString();
  }

}
