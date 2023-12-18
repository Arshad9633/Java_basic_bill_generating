# Pizza Bill Generator

## Overview
This Java program calculates the total bill for a pizza order. It includes the ability to customize the pizza with extra cheese and toppings, and also accounts for take-away charges.

## Classes

### `Main`
- The entry point of the application.
- Creates an instance of `DeluxPizza` and invokes methods to calculate and print the bill.

### `DeluxPizza`
- Inherits from `Pizza` class.
- Constructor takes a `Boolean` parameter to specify if the pizza is vegetarian.
- Automatically adds extra cheese and toppings to the pizza.

### `Pizza`
- Base class for creating a pizza.
- Contains attributes for price, cheese, toppings, and take-away options.
- Methods to add extra cheese, extra toppings, and handle take-away.

## Usage

1. **Create a Pizza Instance**: 
   - Instantiate a `DeluxPizza` object, specifying if it is a vegetarian pizza.
   - Example: `DeluxPizza dp = new DeluxPizza(false);`

2. **Customize and Calculate Bill**: 
   - Call `takeAway()` if the pizza is for take-away.
   - Call `getBill()` to print the detailed bill including base price, extra additions, and total price.

3. **Bill Breakdown**: 
   - The bill includes individual charges for extra cheese, extra toppings, and take-away, along with the base price of the pizza.

## Example
```java
public class Main {
    public static void main(String[] args) {
        DeluxPizza dp = new DeluxPizza(false); // Non-vegetarian Pizza
        dp.takeAway();
        dp.getBill(); // Prints the detailed bill
    }
}
