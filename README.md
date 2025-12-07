## Car-Automation

A modular Java car rental application. Manage cars, customers, and rental operations via the command line. Built with a layered architecture (Model → DAO → Service → App) and in-memory data structures.

### Table of Contents
- Features
- Project Structure
- Setup and Run (Windows/PowerShell)
- Application Menu
- Architecture and Flow
- Development Notes and Future Work

---

## Features
- Add / list cars
- Add / list customers
- Rent a car (calculate price by start-end dates)
- Return a car
- Auto-increment ID system

---

## Application Menu

When the application runs, the following menu appears:

```
--------- MENU ----------
1) Add Car
2) List Cars
3) Add Customer
4) List Customer
5) Rent a Car
6) Return a Car
7) Exit
Select number from menu:
```

Quick example flow:
- Use 1 to add a car (brand, model, year, price per day).
- Use 3 to add a customer (name, surname, phone).
- Use 5 to rent a car (enter carId and customerId; dates as YYYY-MM-DD). Price is `days * pricePerDay`.
- Use 6 to return the car.


## Project Structure

```
Car-Automation/
├── README.md
└── src/
    ├── module-info.java            # Java module declaration (module: Project_car_rental)
    └── com/taha/carrental/
        ├── app/
        │   └── Main.java           # CLI application (menu)
        ├── model/
        │   ├── Car.java            # Car entity model
        │   ├── Customer.java       # Customer entity model
        │   └── Rental.java         # Rental entity model
        ├── dao/
        │   ├── CarDao.java         # Car data (List-based)
        │   ├── CustomerDao.java    # Customer data (List-based)
        │   └── RentalDao.java      # Rental data (List-based)
        └── service/
            ├── CarService.java     # Car business rules
            ├── CustomerService.java# Customer business rules
            └── RentalService.java  # Rental business rules (date/price calculation)
```

Notes:
- If the `out` directory is missing, it will be created automatically.
- If you use an IDE (VS Code/IntelliJ), you can rely on the IDE’s Java build configuration.

