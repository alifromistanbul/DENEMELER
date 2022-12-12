package home_work;

public class TicketPrice {
    public static void main(String[] args) {

        String cityOne = "Chicago";
        String cityTwo = "Virginia";
        double basePrice = 152.40;
        double milesBetweenCities = 739.8;
        double rate = 3;

        double ticketPrice = basePrice + milesBetweenCities/rate;


        System.out.println("The ticket price from Chicago to Virginia is $" + ticketPrice );

    }



}


/*
### Given two cities, `miles between the cities`, and a `base ticket price`, and `rate` calculate the ticket price.

#### Formula for price: `base price + miles between cities / rate`

#### Display the details in the following format:

```
	The ticket price from Chicago to Virginia is $dollarAmount
```
Ex:
```
	city 1 -> Chicago
	city 2 -> Virginia
	base ticket price -> 110.50
	miles between cities -> 739.8
  rate: 10

  Output:
    The ticket price from Chicago to Virginia is $184.48
```

Main topics: variables, primitive datatypes, operators

```


 */