package DeepCopyVsShallowCopy;

class Address {
    String city;
    Address(String city) {
        this.city = city;
    }
}

class Person implements Cloneable {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow copy
    }
}

public class ShallowCopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr = new Address("Delhi");
        Person p1 = new Person("John", addr);
        Person p2 = (Person) p1.clone();

        p2.address.city = "Mumbai";

        System.out.println(p1.address.city); // Mumbai – original changed
    }
}
