
[![Java CI with Maven](https://github.com/nina-bornemann/Shop_Service_Project/actions/workflows/maven.yml/badge.svg)](https://github.com/nina-bornemann/Shop_Service_Project/actions/workflows/maven.yml)

## 💥 Description 

🛒  This project simulates a ShopService! 🛒

---
 
The shop offers for you take a look at the current product catalog 
and place orders, if the desired products are available. 

It leverages the repository pattern and the coordination 
between those using the Service pattern. 

### ✨ Bonus: 

- lets the user change the quantity of products for their order and calculates the total price of orders
- utilizes assertj -Matcher and parameterized tests
- Place orders via CLI-like map of product IDs
- Validate product availability before placing an order
- has helpful colors and formatting 💅🏽
- (EAN databank in csv format)
- (reduce inventor when order is placed)
- (has functions for new inventory in shop and for theft or loss due to accidents)
- (has a storage protocol that documents all shipments and activity)

---

### Repositories
ProductRepo 
- manages available products

OrderRepo / OrderMapRepo
- stores placed orders

Both repositories are currently in-memory (ArrayList / Map).

---

## Usage

### Build

To build the ShopService please use the following maven command.

> mvn -B clean verify

### Test

> mvn test
### Run

>mvn package
>
>java target/Shop_Service_Project-1.0-SNAPSHOT.jar

---

## Requirements
- Java 24+ (or the version your project uses)
- No external database needed (in-memory repositories used)
