package Mortgage;

public class HousePrices extends Users{
 


   /*
            This class is extending the Users class
             1 private int variable price
     */


    private  int price;
    private int totalPrice;

    public HousePrices(String username, String whichCondition, String houseType, int roomCount, int downPayment, int longTerm, StatesTax statesTax) {
        super(username, whichCondition, houseType, roomCount, downPayment, longTerm, statesTax);
    }


    /*
        Create a method name is roomCountToPrice
        no parameter
        no return type
        if the roomCount in the Users class equal to 0
            add 10000 to price
        if the roomCount in the Users class equal to 1
            add 20000 to price
        if the roomCount in the Users class equal to 2
            add 30000 to price
        if the roomCount in the Users class equal to 3
            add 40000 to price
        if the roomCount in the Users class equal to 4
            add 50000 to price
        if the roomCount in the Users class equal to 5
            add 60000 to price
     */
    public void roomCountToPrice(){

        if(getRoomCount()==0)
            this.price+=10000;
        if(getRoomCount()==1)
            this.price+=20000;
        if(getRoomCount()==2)
            this.price+=30000;
        if(getRoomCount()==3)
            this.price+=40000;
        if(getRoomCount()==4)
            this.price+=50000;
        if(getRoomCount()==5)
            this.price+=60000;
    }

    /*
        Create a method name is ConditionToPrice
        no parameter
        no return type
            if WhichCondition variable in the Users class equal to new
                add 50000 to price
            if WhichCondition variable in the Users class equal to like new
                add 40000 to price
            if WhichCondition variable in the Users class equal to old
                add 30000 to price
            if WhichCondition variable in the Users class equal to Renew Required
                add 15000 to price
     */

    public void ConditionToPrice(){
        if(getWhichCondition().equalsIgnoreCase("new"))

            this.price+=50000;
        if(getWhichCondition().equalsIgnoreCase("like new"))

            this.price+=40000;
        if(getWhichCondition().equalsIgnoreCase("old"))

            this.price+=30000;
        if(getWhichCondition().equalsIgnoreCase("Renew Required"))

            this.price+=15000;
    }


    /*
        Create a method name is houseTypeToPrice
        no parameter
        no return type
            if HouseType is equal to Apartment
                add 20000 to price
            if HouseType is equal to condo
                add 30000 to price
            if HouseType is equal to house
                add 40000 to price
     */

    public void houseTypeToPrice(){

        if(getHouseType().equalsIgnoreCase("Apartment"))
            this.price+=20000;
        if(getHouseType().equalsIgnoreCase("condo"))
            this.price+=30000;
        if(getHouseType().equalsIgnoreCase("house"))
            this.price+=40000;

    }


    /*
            Create a method name is getPriceTotal
            return type is int
            Return the total price(housetype, condition and roomcount prices)
            Also you need to calculate the tax and add  to the price
            For the tax percentage use the StatesTax enum
     */

    public int getPriceTotal() {
        roomCountToPrice();
        ConditionToPrice();
        houseTypeToPrice();
        //System.out.println(this.price);

        //double percentage=(double)getStatesTax().getTax()/100;
        // System.out.println(percentage);



        totalPrice=this.price+this.price*getStatesTax().getTax()/100;

        return totalPrice;

    }



    /*
        Create a method name is getPriceEachMonth
            Return the monthly payment amount.
            reduce the downpayment and calculate the each month's payment
     */

    public int getPriceEachMonth(){
        //System.out.println("total price"+getPriceTotal());
        //System.out.println("getDownPayment"+getDownPayment());
        //System.out.println("LongTerm"+getLongTerm());
        int a=(totalPrice-getDownPayment())/getLongTerm();
        // System.out.println(a);

        return a;


    }


}
