package abstracT;

abstract class Vehicle {
    abstract public int getNoOfWheels();

    public static void main(String[] args) {

        Vehicle bus = new Bus();
        Vehicle auto = new Auto();

        System.out.println("Bus has " + bus.getNoOfWheels() + " wheels.");
        System.out.println("Auto has " + auto.getNoOfWheels() + " wheels.");
    }
}
/*
 
 
🔍 Detailed Explanation:
✅ Vehicle bus = new Bus();
Vehicle is an abstract class — it cannot be instantiated directly.

Bus is a subclass of Vehicle that provides an implementation of the getNoOfWheels() method.

new Bus() creates an instance of the Bus class.

We’re assigning it to a reference variable of type Vehicle. This is allowed because Bus IS-A Vehicle.

✅ This is called upcasting:
You're storing a Bus object in a Vehicle type reference. It allows you to treat different kinds of vehicles uniformly.

✅ Vehicle auto = new Auto();
Same logic as above:

Auto is a subclass of Vehicle.

new Auto() creates an instance of the Auto class.

The reference variable auto is of type Vehicle, but it holds an Auto object.

🤯 Why Use This?
This allows for polymorphism — which means you can use the same interface (in this case, the abstract class Vehicle) to work with different types of objects (Bus, Auto, etc.).

For example:

Vehicle[] vehicles = { new Bus(), new Auto() };

for (Vehicle v : vehicles) {
    System.out.println(v.getNoOfWheels());
}
This will print:

7
3
Even though each v is of type Vehicle, it calls the correct getNoOfWheels() method based on the actual object (Bus or Auto).

📝 Summary:

Expression	Meaning
Vehicle bus = new Bus();	Store a Bus object in a Vehicle type (upcasting)
Vehicle auto = new Auto();	Store an Auto object in a Vehicle type (upcasting)
Benefit	Enables polymorphism — you can call methods declared in Vehicle and get subclass-specific behavior
 
 
 */