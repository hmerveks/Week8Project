package Mortgage;

public class Users {
    /*
              Create private following variables
              String username
              String WhichCondition
              String houseType
              int roomCount
              int downPayment
              int longTerm
              StatesTax statesTax;
          Create a constructor  using all the variables.
           */
    private String username;
    private String WhichCondition;
    private String houseType;
    private int roomCount;
    private int downPayment;
    private int longTerm;
    private StatesTax statesTax;


    public Users(String username, String whichCondition, String houseType, int roomCount, int downPayment, int longTerm, StatesTax statesTax) {
        this.username = username;
        WhichCondition = whichCondition;
        this.houseType = houseType;
        this.roomCount = roomCount;
        this.downPayment = downPayment;
        this.longTerm = longTerm;
        this.statesTax = statesTax;
    }

  /*
    Create the read-only method of the all variables
     */

    public String getUsername() {
        return username;
    }

    public String getWhichCondition() {
        return WhichCondition;
    }

    public String getHouseType() {
        return houseType;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public int getDownPayment() {
        return downPayment;
    }

    public int getLongTerm() {
        return longTerm;
    }

    public StatesTax getStatesTax() {
        return statesTax;
    }
}

