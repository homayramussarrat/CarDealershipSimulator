import java.util.ArrayList;
import java.util.Scanner;

public class CarDealershipSimulator
{
  //Homayra Mussarrat
  //500-834-556


  public static void main(String[] args)
  {
	  // Creates a CarDealership object

    CarDealership mycars = new CarDealership();


	  	  
	  // An empty array list of type Car

    ArrayList<Car> carstest = new ArrayList<Car>();

    //adds to the array List
    carstest.add(new Car("Toyota", "blue", Vehicle.Power.GAS_ENGINE, Car.Model.SEDAN, 500, 9.5, false, 25000 ));
    carstest.add(new Car("Honda", "red", Vehicle.Power.GAS_ENGINE, Car.Model.SPORTS, 450, 9.2, false, 30000 ));
    carstest.add(new Car("Kia", "white", Vehicle.Power.GAS_ENGINE, Car.Model.MINIVAN, 550, 9.7, false, 20000 ));
    carstest.add(new Car("BMW", "black", Vehicle.Power.GAS_ENGINE, Car.Model.SEDAN, 600, 9.6, true, 55000 ));
    carstest.add(new ElectricCar("Tesla", "red", Vehicle.Power.ELECTRIC_MOTOR, Car.Model.SEDAN, 425, 9.1, true, 85000, 30 ));
    carstest.add(new Car("Chevy", "red", Vehicle.Power.GAS_ENGINE, Car.Model.MINIVAN, 475, 9.25, false, 40000 ));
    carstest.add(new ElectricCar("ChevyVolt", "green", Vehicle.Power.ELECTRIC_MOTOR, Car.Model.SEDAN, 375, 8.9, true, 37000, 45 ));
    carstest.add(new Car("Bently", "black", Vehicle.Power.GAS_ENGINE, Car.Model.SEDAN, 575, 9.8, false, 150000 ));
    carstest.add(new ElectricCar("NissanLeaf", "green", Vehicle.Power.ELECTRIC_MOTOR, Car.Model.SEDAN, 325, 8.8, true, 32000, 55 ));


    SalesTeam team = new SalesTeam();
    AccountingSystem trans = new AccountingSystem();


    //NEED TO DO FILE IO EXCEPTIONS HERE (TRY, CATCH ETC...)


    Scanner in = new Scanner(System.in); //scanner to take in user input

    while(in.hasNext()) //continues while user enters input
    {
      String input = in.next(); //takes in input


      if(input.equals("ADD")) //if input is ADD then add arraylist to mycars (Cardealership arraylist)
      {
        mycars.addCars(carstest);
      }


      else if(input.equals("L")) //L lists the inventory based on filters. Initially filtes are all false
      {
        mycars.displayInventory();
      }
      else if (input.equals("Q")) //quits the program
      {
        break;

      }
      else if(input.equals("BUY")) //buys car based on vin number
      {

        int num = in.nextInt();

        {

          mycars.buyCar(num);
        }


      }

      else if (input.equals("RET")) //returns the last bought car
      {
        //mycars.returnCar();
      }

      else if(input.equals("SPR")) //sorts by price lowest to highest and then displays inventory
      {
        mycars.sortByPrice();
        mycars.displayInventory();
      }
      else if(input.equals("SSR")) //sorts by safety rating lowest to highest and then displays inventory
      {
        mycars.sortBySafetyRating();
        mycars.displayInventory();
      }
      else if(input.equals("SMR")) //sorts by max range lowest to highest and then displays inventory
      {
        mycars.sortByMaxRange();
        mycars.displayInventory();
      }

      else if(input.equals("FPR")) //filters by price between  min price to max price (inclusive)
      {
        int price1 = in.nextInt();
        int price2 = in.nextInt();

        mycars.filterByPrice(price1, price2);

      }
      else if(input.equals("FEL")) //filters by cars that are electric motor
      {
        mycars.filterByElectric();
      }
      else if(input.equals("FAW")) //filtes by cars that are AWD
      {
        mycars.filterByAWD();

      }
      else if(input.equals("FCL")) //clears all filters by setting them to false
      {
      mycars.FiltersClear();
      }
      else if(input.equals(null)) //if input is null
      {

      System.out.println("please enter an input");
      }
      else if (input.equals("SALES"))
      {
        //NEED HELP

        //SUPPOSED TO PRINT ALL TRANSACTIONS FOR THE YEAR 2019
      }
      else if(input.equals("SALESTEAM"))
      {


          System.out.println(team.names);


        //SUPPOSED TO PRINT NAME OF ALL SALES PERSONS

      }

      else if(input.equals("SALESTOPSP"))
      {

        mycars.mostsales();

        //SUPPOSED TO PRINT THE SALES PERSON WHO SOLD THE MOST NUMBER OF CARS
      }

      else if(input.equals("SALESm"))
      {
        CarDealership mylist = new CarDealership();
        System.out.println(mylist.list);
        //SUPPOSED TO PRINT ALL TRANSACTIONS FOR THE MONTH "m"

      }
      else if (input.equals("SALESSTATS"))
      {

        //PRINTS TOTAL SALES $ FOR THE YEAR, THE AVERAGE SALES PER MONTH, TOTAL NO OF CARS SOLD, HIGHEST SALES MONTH, TOTAL CAR RETURNS


      }
      else
      {
      System.out.println("Wrong input."); //"wrong input" if input is not listed in the if statements
      }




    }





	 
  }
}