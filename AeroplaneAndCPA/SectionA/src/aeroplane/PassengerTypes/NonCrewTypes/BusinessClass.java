package aeroplane.PassengerTypes.NonCrewTypes;

import aeroplane.Luxury;
import aeroplane.PassengerTypes.NonCrew;

public class BusinessClass extends NonCrew {

  private Luxury luxuryItem;

  public BusinessClass(String firstName, String surname, int age, Luxury luxuryItem){
    super(firstName, surname, age);
    this.luxuryItem = luxuryItem;
    TYPE = "BusinessClass";
  }

  @Override
  public String toString() {
    StringBuilder res = new StringBuilder();
    res.append(super.toString());
    res.append('-');
    res.append(luxuryItem);
    return res.toString();
  }
}
