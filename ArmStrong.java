package firlstjavaprogrampackage;

public class ArmStrong {
	public static void main(String[] args) {
		// Write a program to find Armstrong number or not
		int orgnum1=1634,orgnum;
		float res=0,rem=0;
		orgnum=orgnum1;
	
		while(orgnum!=0)
		{
		rem=(orgnum%10);	
		res+=(rem*rem*rem);
		orgnum/=10;
		}
		System.out.println("res"+ res + " "+ orgnum+" n value"+orgnum1);
     if(orgnum1==res)
    	System.out.println("arms strong");
     else
    	 System.out.println("not arms strong");
     	 
	}
}
