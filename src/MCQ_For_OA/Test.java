package MCQ_For_OA;

class Test {
int a = 10;
static int b = 20;
public
static void main (String[] args)
{
Test t1 = new Test();
t1.a = 100;
t1.b = 200;
Test t2 = new Test();
System.out.println("t1.a =" + t1.a + " t1.b =" + t1.b);
System.out.println("t2.a =" + t2.a + " t2.b =" + t2.b);
}
} 


