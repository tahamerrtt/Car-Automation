Car Automation is a modular Java project designed to manage cars, customers, and rental operations.
The architecture follows a clean layered structure: Model → DAO → Service → Main, making the project easy to maintain and extend.
It demonstrates OOP principles, service-based logic, and a simple in-memory data storage system.

Project Architecture
src/
└── com.taha.carrental
    ├── model/        # Car, Customer, Rental
    ├── dao/          # CarDao, CustomerDao, RentalDao (in-memory storage)
    ├── service/      # CarService, CustomerService, RentalService
    └── app/          # Main CLI application

Features:
Add new cars
List all cars
Add new customers
List all customers
Rent a car
Return a car
Auto-increment ID system
Fully modular, easy to expand
Perfect base for future SQL/JDBC integration

Future Improvements
The project is designed to be expandable. Planned enhancements:
MySQL & JDBC database integration
DatabaseConnection utility class
Persistent storage (instead of List)
Admin/Garage management
GUI (JavaFX)
REST API version (Spring Boot)




Contributions are welcome!
