package inherit_classes;
// single level inheritance

class A
{
  int inst_a,inst_b;
  public A(int a,int b) {
	  inst_a=a;
	  inst_b=b;
  }
	void addition(int a,int b)
	{
			System.out.println("addition is "+(inst_a+inst_b));
	}
	
	void subtraction(int a, int b)
	{
	  System.out.println("subtraction is "+(inst_a-inst_b));
			
	}
	void method()
	{
	System.out.println("Method OF Class A");
	}
	
}
class B extends A
{
	int inst_c;
	public B(int a,int b,int c)
	{
	super(a,b);
	inst_c=c;
	}
	void multi(int a,int b)
	{
		inst_c=(a*b);
		System.out.println("multiplication is "+inst_c);

	}
	void div(int a,int b)
	{
		inst_c=a/b;
		System.out.println("division is "+inst_c);
	}
	void method()
	{
	System.out.println("Method OF Class B");
	}
}
class C extends B
{
	int inst_c;
	public C(int a,int b,int c)
	{
	super(a,b,c);
	inst_c=c;
	}
	void pow(int x)
	{
		inst_c=x;
		System.out.println("power is "+(inst_c*inst_c));
	}
   void rem(int a,int b)
   {
	   float c=0;
	   c=a%b;
	   System.out.println("remainder is "+c);
	}

	void method()
	{
	System.out.println("Method OF Class C");
	}
}

public class Inheritance_example extends C {

	public Inheritance_example(int a, int b, int c) {
		super(a, b, c);
		
	}

	public static void main(String[] args) {
		/* A, B and C are classes
		A is a super class. B is a sub class of A. C is a sub class of B.
		Create three methods in each class, 2 methods are specific to each class and third
		method (override method) should be in all three Classes A, B and C*/
		C obj_c=new C(100,200,300);
		A obj_a=new A(10,30);
		B obj_b=new B(10,20,30);
		System.out.println("Value of instance varaibles");
		System.out.println("value of a of class a "+obj_a.inst_a);
		System.out.println("value of b of class b"+obj_a.inst_b);
		System.out.println("value of a of class a"+obj_b.inst_a);
		System.out.println("value of b of class b"+obj_b.inst_b);
		System.out.println("value of c of class b"+obj_b.inst_c);
		System.out.println("value of a of class c"+obj_c.inst_a);
		System.out.println("value of b of class c"+obj_c.inst_b);
		System.out.println("value of c of class c"+obj_c.inst_c);       
        obj_c.method();	
        obj_c.addition(10,20);
        obj_c.subtraction(200,100);
        obj_c.multi(4,6);
        obj_c.div(40,2);
        obj_c.rem(31,3);
        obj_c.pow(5);
        obj_a.method();
        obj_b.method();
	}
}