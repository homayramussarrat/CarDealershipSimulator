public class ElectricCar extends Car
{
    //Homayra Mussarrat
    //500-834-556

    //A SUBCLASS OF CAR.JAVA

    private int rechargeTime;
    private String batteryType;

    //CONSTRUCTOR

    public ElectricCar() //empty constructor
    {
        super();
        rechargeTime =0;
        batteryType= "";
    }

    public ElectricCar(String mfr, String color, Power power, Model model, int maxRange, double safetyRating, boolean AWD, double price, int rechargeTime) //constructor that takes in parameters
    {
        super(mfr, color, power, model, maxRange, safetyRating, AWD, price);
        this.rechargeTime = rechargeTime;

    }

    //SETTERS

    public void setRechargeTime(int rechargeTime) //sets recharge time to parameter
    {
        this.rechargeTime = rechargeTime;
    }

    public void setBatteryType(String batteryType) //sets battery type to parameter
    {
        this.batteryType = batteryType;
    }

    //GETTERS

    public int getRechargeTime() //returns recharge time
    {
        return rechargeTime;
    }

    public String getBatteryType() //returns battery type
    {
        return batteryType;
    }

    public String display() //displays the electric car features using display from superclass along with recharge time
    {
        //return super.display() + " " + getBatteryType() + " " + getRechargeTime();
        return super.display() + " "  + getRechargeTime();
    }
}



