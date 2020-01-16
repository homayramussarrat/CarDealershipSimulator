public class Car extends Vehicle implements Comparable<Car>
{

    //Homayra Mussarrat
    //500-834-556

    //A SUBCLASS OF VEHICLE

    public Model model;
    private int maxRange;
    private double safetyRating;
    private boolean AWD; //ALWheelDrive
    private double price;

    public static enum Model //creates enum of type Model
    {
        SEDAN, SUV, SPORTS, MINIVAN;
    }

    //CONSTRUCTOR

    public Car() //creates car constructor with no parameters
    {
        super();
        this.model = null;
        this.maxRange =0;
        this.safetyRating =0;
        this.AWD = false;
        this.price = 0;
    }


    public Car(String mfr, String color, Power power, Model model, int maxRange, double safetyRating, boolean AWD, double price) //creates constructor that takes in parameter
    {
        super(mfr, color, power);
        this.model = model;
        this.maxRange =maxRange;
        this.safetyRating =safetyRating;
        this.AWD = AWD;
        this.price = price;
    }

    //SETTERS

    public void setModel(Model model) //sets model to parameter  model
    {
        this.model = model;
    }

    public void setMaxRange(int maxRange) //sets max range to parameter maxrange
    {
        this.maxRange = maxRange;
    }

    public void setSafetyRating(double safetyRating) //sets safetyrating to parameter safetyrating
    {
        this.safetyRating = safetyRating;
    }

    public void setAWD(boolean AWD) //sets AWD to either true (has AWD) or false( (does not have AWD)
    {
        this.AWD = AWD;
    }

    public void setPrice(double price) //sets price to price parameter
    {
        this.price = price;
    }

    //GETTERS

    public Model getModel() //returns the model of the car
    {
        return model;
    }

    public int getMaxRange() //returns the maxrange
    {
        return maxRange;
    }

    public double getSafetyRating() //returns safety rating
    {
        return safetyRating;
    }

    public String getAWD() //if AWD is true, returns "AWD" else "2WD"
    {
        if(AWD)
        {
            return "AWD";
        }

        return "2WD";


    }

    public double getPrice() //returns price
    {
        return price;
    }

    public String display() //displays car features from vehicle + new instance variables
    {
        return super.display() + " " + getModel() + " " + super.getPower() + " " + getSafetyRating() + " " + " " +getMaxRange() + " " + getAWD() + " " + getPrice();
    }

    public boolean equals(Object other) //checks to see if our car object is equal to another car object in terms of model and AWD along with equals function from superclass
    {
        Car othercar = (Car) other;

        return super.equals(other) && this.getModel().equals(othercar.getModel()) && this.getAWD().equals(othercar.getAWD());
    }

    public int compareTo(Car other) //compares price of car types. Rank from lowest to highest
    {
        if(this.getPrice() < other.getPrice())
            return -1;
        if(this.getPrice() > other.getPrice())
            return 1;
        return 0;
    }





}
