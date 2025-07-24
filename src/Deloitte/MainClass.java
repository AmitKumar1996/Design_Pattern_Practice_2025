package Deloitte;



public class MainClass {
 public static void main(String[] args) {
Parent parentObj = new Parent();
Child childObj = new Child();
Parent anotherParentObj = new Child();

//        parentObj.display();  // Output?  Display from Parent
//        childObj.display();   // Output?   "Display from Child
//        anotherParentObj.display();  // Output?  "Display from Child
//        parentObj.childSpecificMethod(); // Output?  // error
//        anotherParentObj.childSpecificMethod(); // Output?  Child specific method
 
}

}



class Parent {
void display() {
System.out.println("Display from Parent");
    }
}

class Child extends Parent {
void display() {
// System.out.println("Display from Child");
	System.out.println("Display from Child");
    }

void childSpecificMethod() {
System.out.println("Child specific method");
    }
}
