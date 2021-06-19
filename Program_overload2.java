package overload_class_pro1;
/*Write two methods with the same name but different number of parameters of different
data type and call the methods from main method*/

class overloading1
{
	int s1,s2; double s3;
	int area(int s1)
	{
		s2=s1*s1;
		return s2;
		}
	 double area(double s1,double s2)
	{
		s3=s1*s2;
		return s3;
	}
}
public class Program_overload2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloading1 over=new overloading1();
		
		System.out.println("area of square is"+over.area(35));
		System.out.println("area of square is"+over.area(3.65,5.32));
		
	}

}
