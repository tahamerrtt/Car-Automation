package com.taha.carrental.app;
import java.util.Scanner;
import com.taha.carrental.model.Car;
import com.taha.carrental.model.Customer;
import com.taha.carrental.model.Rental;
import com.taha.carrental.service.CarService;
import com.taha.carrental.service.CustomerService;
import com.taha.carrental.service.RentalService;

public class Main {

    static CarService carService = new CarService();
    static CustomerService customerService = new CustomerService();
    static RentalService rentalService = new RentalService();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("--------- MENU ----------");
            System.out.println("1) Add Car");
            System.out.println("2) List Cars");
            System.out.println("3) Add Customer");
            System.out.println("4) List Customer");
            System.out.println("5) Rent a Car");
            System.out.println("6) Return a Car");
            System.out.println("7) Exit");
            System.out.print("Select number from menu: ");

            int a = scanner.nextInt();

            if (a < 1 || a > 7) {
                System.out.println("Please select between 1 and 7!");
                continue;   // yeniden menüye döner
            }

            switch (a) {

                case 1:
                    scanner.nextLine(); // buffer temizleme
                    System.out.println("Write brand:");
                    String brand = scanner.nextLine();
                   

                    System.out.println("Write model:");
                    String model = scanner.nextLine();

                    System.out.println("Write year:");
                    int year = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Write price per day:");
                    double ppd = scanner.nextDouble();
                    scanner.nextLine();
                    
                    Car car = new Car(0, brand, model, year, ppd, true);
                    carService.addCar(car);
                    break;


                case 2:
                    carService.listCars();
                    break;
                    
                case 3:
                	scanner.nextLine();
                	System.out.println("Write name:");
                	String name = scanner.nextLine();
                	
                	System.out.println("Write surname:");
                	String surname = scanner.nextLine();
                			
                	System.out.println("Write phone number:");
                	String phonenumber = scanner.nextLine();
                	Customer customer =new Customer(0, name, surname, phonenumber);
                	customerService.addCustomer(customer);
                	break;
                
                case 4:
                	customerService.listCustomers();
                	break;
                case 5:
                	System.out.println("Enter car id");
                	int carid = scanner.nextInt();
                	scanner.nextLine();
                	
                    Car selectedCar = carService.getCarById(carid);
                    if (selectedCar == null) {
                    	System.out.println("Car not found!");
                    	break;
					}
                	
               
                	System.out.println("Enter customer id:");
                	int customerid = scanner.nextInt();
                	scanner.nextLine();
                	Customer selectedCustomer = customerService.getCustomerById(customerid);
                	if (selectedCustomer == null) {
                		System.out.println("Customer not found!");
                		break;
						
					}
                	
              
                    System.out.println("Enter Start Date (YYYY-MM-DD):");
                    String startDate = scanner.nextLine();
                    
                    System.out.println("Enter End Date (YYYY-MM-DD):");
                    String endDate = scanner.nextLine();
                    Rental newrental = rentalService.rentCar(selectedCar, selectedCustomer, startDate, endDate);
                   
                    if (newrental != null) {
                    	System.out.println("Rental succesfull!");
                    	System.out.println("Price: "+ newrental.getTotalprice());
                    	
					}
                    break;
                case 6:
                	System.out.println("Enter car id to return");
                	int returnid = scanner.nextInt();
                	Car returnCar = carService.getCarById(returnid);
                	if (returnCar == null) {
                		System.out.println("Car not found!");
                		break;
						
					}
                	rentalService.returncar(returnCar);
                	
                	break;

                
                                    		
                	
                    


                case 7:
                    System.out.println("Exiting...");
                    return;   
            }
        }
        
        
    }
}
