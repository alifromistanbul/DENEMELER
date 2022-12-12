package homework_26_11_2022;

public class HouseItems {

    public String name;
    public String color;
    public int amount;

    public HouseItems(String name, String color, int amount) {
        this.name = name;
        this.color = color;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "HouseItems{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", amount=" + amount +
                '}';
    }
}
/*
Task-1
The class HouseItems holds a few attributes and has a method called toString.
The attributes are name and color -both are strings and amount which is an int. toString returns a string showing all the Atts in a format.
for example:
HouseItems a = new HouseItems();
a.name = "table";
a.color = "brown";
a.amount = 1;
System.out.println(a.toString());
name: table color: brown amount: 1
Create the required attributes and method inside the HouseItems class
 */
