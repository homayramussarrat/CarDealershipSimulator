public class Vehicle {
    //Homayra Mussarrat
    //500-834-556


    //A BASIC GENERAL VEHICLE CLASS. ITI S THE SUPERCLASS FOR CAR.JAVA

    private String mfr;
    private String color;
    public Power power;
    private int numWheels;
    public int VIN; //vehicle identification number

    public static enum Power //creates an enum for different types of Power
    {
        GAS_ENGINE, DIESEL_ENGINE, ELECTRIC_MOTOR;
    }

    //CONSTRUCTORS

    public Vehicle()  //creates Vehicle constructor
    {
        this.mfr = "";
        this.color = "";
        this.power = null;
        this.numWheels = 0;
        this.VIN = 100 + (int) (Math.random() * 400); //generates random numbers from 100 to 499
    }

    public Vehicle(String mfr, String color) //creates Vehicle constructor that takes in manufacturer and color as parameters
    {
        this.mfr = mfr;
        this.color = color;
        this.power = null;
        this.numWheels = 0;
        this.VIN = 100 + (int) (Math.random() * 400); //generates random numbers from 100 to 499
    }

    public Vehicle(String mfr, String color, Power power) //takes manufacturer, color, and power as parameter
    {
        this.mfr = mfr;
        this.color = color;
        this.power = power;
        this.VIN = 100 + (int) (Math.random() * 400); //generates random numbers from 100 to 499
    }

    //SETTERS

    public void setMfr(String mfr) //sets manufacturer to parameter
    {
        this.mfr = mfr;
    }

    public void setColor(String color) //sets color to parameter
    {
        this.color = color;
    }

    public void setPower(Power power) //sets power to parameter
    {
        this.power = power;
    }

    public void setNumWheels(int numWheels) //sets numwheels to parameter
    {
        this.numWheels = numWheels;
    }


    //GETTERS

    public int getVIN()
    {
        return VIN; //returns VIN number
    }



    public String getMfr() //returns manufacturer name
    {
        return mfr;
    }

    public String getColor() //returns color
    {
        return color;
    }

    public Power getPower() //returns power
    {
        return power;
    }

    public int getNumWheels() //returns num of wheels
    {
        return numWheels;
    }



    public boolean equals(Object other) //checks to see if our current vehicle object is equal to other vehicle object in terms of manufacturer, power, and num of wheels
    {
        Vehicle othervehicle = (Vehicle) other;

        return (this.getMfr().equals(othervehicle.getMfr()) && this.getPower() == (othervehicle.getPower()) && this.getNumWheels()== othervehicle.getNumWheels());
    }

    public String display() //displays VIN, manufacturer and color of car
    {
        return "VIN: " + getVIN() + " " + getMfr() + " " + getColor();
    }

}
