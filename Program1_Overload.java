package overload_class_pro1;

class overloading
{
	float s1,s2,s3;
	void area(float s1)
	{
		s2=s1*s1;
		System.out.println("area of square is"+s2);
	}
	void area(float s1,float s2)
	{
		s3=s1*s2;
		System.out.println("area of rectangle is"+s3);
		
	}
}
public class Program1_Overload {

	public static void main(String[] args) {
		/*Write two methods with the same name but diferent number of parameters of same type
		and call the methods from main method*/
   overloading over=new overloading();
   over.area(2);
   over.area(3,6);
	}

}
