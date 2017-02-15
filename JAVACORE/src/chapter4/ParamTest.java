package chapter4;
/**
 * 
 * @ClassName: ParamTest
 * @Description: 测试 值调用和引用调用
 * @author: Bodycoder
 * @date: 2017年2月15日 下午5:21:27
 */
public class ParamTest {
	public static void main(String[] args)
	{
		/*
		 * test 1: Method can not modify numeric parameters
		 */
		System.out.println("testing tripleValue:");
		double percent=10;
		System.out.println("Before: percent="+percent);
		tripleValue(percent);
		System.out.println("After: percent="+percent);
		
		/*
		 * test 2: Method can change the state of object parameters
		 */
		
		System.out.println("\nTesting tripleSalary:");
		Employee2 harry=new Employee2("harry",50000);
		System.out.println("Before: salary="+harry.getSalary());
		tripleSalary(harry);
		System.out.println("After: salary="+harry.getSalary());
		
		/*
		 * test 3: methods can not attach new objects to object parameters
		 */
		
		System.out.println("\ntesting the swap:");
		Employee2 a=new Employee2("k1",70000);
		Employee2 b=new Employee2("k2",70000);
		System.out.println("Before: a="+a.getName());
		System.out.println("Before: b="+b.getName());
		swap(a,b);
		System.out.println("After: a="+a.getName());
		System.out.println("After: b="+b.getName());
	}
	
	public static void tripleValue(double x)
	{
		x=3*x;
		System.out.println("End of the method:x="+x);
	}
	
	public static void tripleSalary(Employee2 x)
	{
		x.raiseSalary(200);
		System.out.println("End of the method:salary="+x.getSalary());
		
	}
	
	public static void swap(Employee2 x,Employee2 y)
	{
		Employee2 temp=x;
		x=y;
		y=temp;
		System.out.println("End of method: x="+x.getName());
		System.out.println("End of method: y="+y.getName());
	}
}

/**
 * 
 * @ClassName: Employee2
 * @Description: 雇员类的构造
 * @author: Bodycoder
 * @date: 2017年2月15日 下午5:55:20
 */

class Employee2
{

	private String name;
	private double salary;
	
	public Employee2(String n, double s)
	{
		name=n;
		salary=s;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void raiseSalary(double byPercent)
	{
		double raise=salary*byPercent/100;
		salary+=raise;
	}
}





























