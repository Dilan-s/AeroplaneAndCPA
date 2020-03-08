package aeroplane;

import java.util.NoSuchElementException;
import java.util.Objects;

public class Seat {

  private int row;
  private char seatLetter;
  public final int MAX_ROWS = 50;
  public final char MAX_SEAT_LETTER = 'F';

  public int getMAX_ROWS() {
    return MAX_ROWS;
  }

  public char getMAX_SEAT_LETTER() {
    return MAX_SEAT_LETTER;
  }

  // TODO: Section A, Tasks 1 and 3
  Seat(int row, char seatLetter) {
    this.row = row;
    this.seatLetter = Character.toUpperCase(seatLetter);
  }

  public boolean isEmergencyExit() {
    return row == 1 || row == 10 || row == 30;
  }

  public boolean hasNext() {
    return !(row == MAX_ROWS && seatLetter == MAX_SEAT_LETTER);
  }

  public Seat next() throws NoSuchElementException{
    if (this.hasNext()) {
      int nextSeatLetter = (seatLetter - 'A' + 1) % (MAX_SEAT_LETTER - 'A' + 1);
      int nextSeatRow;
      if (seatLetter == MAX_SEAT_LETTER) {
        nextSeatRow = row + 1;
      } else {
        nextSeatRow = row;
      }
      return (new Seat(nextSeatRow, (char) (nextSeatLetter + 'A')));
    } else {
      throw new NoSuchElementException("No next seat");
    }
  }

  @Override
  public String toString() {
    StringBuilder res = new StringBuilder();
    res.append(row);
    res.append(seatLetter);
    return res.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Seat)) {
      return false;
    }
    Seat seat = (Seat) o;
    return row == seat.row && seatLetter == seat.seatLetter;
  }

  @Override
  public int hashCode() {
    return Objects.hash(row, seatLetter, MAX_ROWS, MAX_SEAT_LETTER);
  }
}
