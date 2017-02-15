package chapter4;
import java.util.*;

/*
* @ClassName: EmployeeTest
* @Description: test for chapter 4
* @author: Bodycoder
* @date: 11 Feb 2017 16:25:39
*
*/
public class EmployeeTest {

	public static void main(String[] args)
	{
		Employee[] staff=new Employee[3];
		staff[0]=new Employee("li",7000,1992,1,1);
		staff[1]=new Employee("cheng",8000,1992,2,1);
		staff[2]=new Employee("li",9000,1992,3,1);
		
	for(Employee e:staff)
		e.raiseSalary(5);
	

	for(Employee e:staff)
		System.out.println("name="+e.getName()+", salary="+e.getSarlary()+", hireDay="+e.getHireDay());
	}
}


class Employee
{

	private String name;
	private double salary;
	private Date hireDay;
	
	public Employee(String n,double s,int year,int month, int day)
	{
		name=n;
		salary=s;
		GregorianCalendar calendar=new GregorianCalendar(year,month-1,day);
		hireDay=calendar.getTime();	
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSarlary()
	{
		return salary;
	}
	
	public Date getHireDay()
	{
		return hireDay;
	}
	
	public void raiseSalary(double byPercent)
	{
		double raise=salary*byPercent/100;
		salary+=raise;
	}
		
}
