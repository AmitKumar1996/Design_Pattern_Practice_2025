package ShallowCopyVsDeepCopy;


class DeepAddress implements Cloneable {
    String city;

    DeepAddress(String city) {
        this.city = city;
    }

    protected Object clone() throws CloneNotSupportedException {
        return new DeepAddress(this.city); // Manual deep copy
    }
}

class DeepPerson implements Cloneable {
    String name;
    DeepAddress address;

    DeepPerson(String name, DeepAddress address) {
        this.name = name;
        this.address = address;
    }

    protected Object clone() throws CloneNotSupportedException {
        DeepPerson cloned = (DeepPerson) super.clone();
        cloned.address = (DeepAddress) address.clone(); // Deep copy
        return cloned;
    }
}

public class DeepCopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepAddress addr = new DeepAddress("Delhi");
        DeepPerson p1 = new DeepPerson("John", addr);
        DeepPerson p2 = (DeepPerson) p1.clone();

        p2.address.city = "Mumbai";

        System.out.println(p1.address.city); // Output: Delhi (original unchanged)
    }
}
