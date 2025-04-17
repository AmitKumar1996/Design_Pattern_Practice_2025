
package abstracT.Example_4;

//✅ Abstract class with two abstract methods
public abstract class Parent {
 public abstract void methodOne();
 public abstract void methodTwo();
}

//✅ Valid class - implements all abstract methods
class child extends Parent {
 public void methodOne() {
     System.out.println("child: methodOne");
 }

 public void methodTwo() {
     System.out.println("child: methodTwo");
 }
}

//❌ Invalid class - does not implement methodOne()
//This will cause a compilation error
//class ChildChild extends Parent {
// public void methodTwo() {
//     System.out.println("ChildChild: methodTwo");
// }
//}

