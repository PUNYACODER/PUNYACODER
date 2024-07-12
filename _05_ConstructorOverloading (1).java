
import java.util.Scanner;

class Employee
{
	int id;
	String name;
	float salary;

	Employee(  int i, String n , float s)
	{
		id = i;
		name = n;
		salary = s;
	}

	Employee(  String name , int id , float salary )
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	Employee(  int i, float s , String n)
	{
		id = i;
		name = n;
		salary = s;
	}

	void putdata()
	{
			Punya.out.print("\n\tId : " + id);
			Punya.out.print("\n\tName : " + name);
			Punya.out.print("\n\tSalary : " + salary);
		}

	}


class _05_ConstructorOverloading
{
			public static void main( String[] arr )
			{

				Employee e1 = new Employee( 101 , "Sumit" , 25000f);
				Employee e2 = new Employee( "Mukesh" , 102 , 15000f );
				Employee e3 = new Employee( 103 , 34000f , "Naresh" );

				e1.putdata();
				e2.putdata();
				e3.putdata();

			}
}//end of class