import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;

public class CarDealership
{
    //Homayra Mussarrat
    //500-834-556


   public ArrayList<Car> cars; //creates empty array list of type Car called "cars"

    public SalesTeam person = new SalesTeam();
    public AccountingSystem list = new AccountingSystem();
    public int RyanCount;
    public int DavidCount;
    public int AlexCount;
    public int JordanCount;
    public int VeronicaCount;
    public int KiaraCount;


   private boolean electricFilter;
   private boolean priceFilter;
   private boolean AWDFilter;

   private double priceMin;
   private double priceMax;

   public Car temporary;


   public CarDealership() //Constructor that creates empty array list and sets all filters to false initially
   {
       cars = new ArrayList<Car>();
       electricFilter = false;
       priceFilter = false;
       AWDFilter = false;

       RyanCount =0;
       DavidCount =0;
       AlexCount =0;
       JordanCount=0;
       VeronicaCount=0;
       KiaraCount=0;
   }

   public void addCars(ArrayList<Car> newCars) //adds your arraylist newCars into cars
   {
       cars.addAll(newCars);
   }



   public void mostsales() //returns the name of sales person with most sales
   {
       int [] salescount = new int[]{RyanCount, DavidCount, AlexCount, JordanCount, VeronicaCount, KiaraCount};
       int max =0;
       int maxindex=0;

       for(int i=0; i <= 5; i++)
       {
           if(salescount[i] >max)
           {
               salescount[i] = max;
               maxindex = i;
           }
       }

       if(maxindex == 0)
       {
           System.out.println("Ryan " + RyanCount);
       }
       else if (maxindex ==1)
       {
           System.out.println("David " + DavidCount);
       }
       else if(maxindex ==2)
       {
           System.out.println("Alex " +AlexCount);
       }
       else if(maxindex==3)
       {
           System.out.println("Jordan " +JordanCount);
       }
       else if(maxindex==4)
       {
           System.out.println("Veronica " +VeronicaCount);
       }
       else
       {
           System.out.println("Kiara " + KiaraCount);
       }



   }



   public String buyCar(int VIN) //takes in index as parameter and buys car of that index
   {
       for(int i =0; i < cars.size(); i++)
       {
           if(cars.get(i).getVIN() == VIN)
           {
               temporary = cars.get(i); //stores the index of the car in temporary variable
               cars.remove(i); //removes the car from the arraylist because it has been bought
           }
       }

       int month = (int) (Math.random()*13);
       int day = (int) (Math.random()*31);
       GregorianCalendar date = new GregorianCalendar(2019, month, day);
       String salesperson = person.randomSalesPerson();

       //keeps track of which sales person had the most sales

       if(salesperson.equals("David"))
       {
           DavidCount++;
       }
       else if(salesperson.equals("Alex"))
       {
           AlexCount++;
       }
       else if(salesperson.equals("Ryan"))
       {
           RyanCount++;
       }
       else if(salesperson.equals("Kiara"))
       {
           KiaraCount++;
       }
       else if(salesperson.equals("Jordan"))
       {
           JordanCount++;
       }
       else
       {
           VeronicaCount++;
       }
       System.out.println(month + "," + day + ", 2019 " + salesperson + " BUY " + temporary.display());

       return  list.add(date,temporary, salesperson, "BUY", temporary.getPrice());



       //WHEN I CALL BUY (INSERT VIN #) IN CAR DEALERSHIP SIMULATOR, IT DOES NOT PRINT ANYTHING


   }

   //DOES NOT WORK
   public void returnCar(int transaction)
   {
       cars.add(temporary); //adds the temporary variable (car bought) back into arraylist cars

   }



    public void displayInventory() //displays inventory based on filters using a for loop
    {
        for(int i =0; i < cars.size(); i++)
        {
            if(priceFilter == true && !(priceMin <= cars.get(i).getPrice() && cars.get(i).getPrice() <= priceMax))
            {
                continue;
            }

            if(electricFilter == true && !(cars.get(i).getPower() == Vehicle.Power.ELECTRIC_MOTOR))
            {
                continue;
            }

            if(AWDFilter == true && !(cars.get(i).getAWD().equals("AWD")))
            {
                continue;
            }


            System.out.println(i + ") " + cars.get(i).display());
        }
    }

    public void filterByElectric() //sets electric filter to true
    {
        electricFilter = true;
    }

    public void filterByAWD() //sets AWD to true
    {
        AWDFilter = true;
    }

    private class AWDComparator implements Comparator<Car> //creates an AWD comparator that can sort by AWD
    {
        public int compare(Car a, Car b)
        {
            if(a.getAWD().compareTo(b.getAWD()) < 0)
                return -1;
            else if (a.getAWD().compareTo(b.getAWD()) > 0)
                return 1;
            else
                return 0; 

        }
    }

    public void filterByPrice(double min, double max) //Filters by lowest price to highest price declared by user
    {
        priceFilter = true;
        priceMin = min;
        priceMax = max;
    }

    public void FiltersClear() //sets all filters to false
    {
        electricFilter = false;
        AWDFilter = false;
        priceFilter = false;
    }

    public void sortByPrice() //sorts by price lowest to highest (uses compareTo from Car.java)
    {
        Collections.sort(cars);
    }

    private class safetyRatingComparator implements Comparator<Car> //creates comparator to compare safety ratings
    {
        public int compare(Car a, Car b)
        {
            if(a.getSafetyRating() < b.getSafetyRating())
                return -1;
            else if(a.getSafetyRating() > b.getSafetyRating())
                return 1;
            else
                return 0;
        }
    }

    public void sortBySafetyRating() //ranks safety rating from lowest rating to highest rating
    {
        Collections.sort(cars, new safetyRatingComparator());
    }

    private class maxRangeComparator implements Comparator<Car> //creates comparator to compare maxrange
    {
        public int compare(Car a, Car b)
        {
            if(a.getMaxRange() < b.getMaxRange())
                return -1;
            else if(a.getMaxRange() > b.getMaxRange())
                return 1;
            else
                return 0;
        }
    }

    public void sortByMaxRange() //ranks maxrange from lowest to highest
    {
        Collections.sort(cars, new maxRangeComparator());
    }




}
