package chapter6;

import java.util.Date;
import java.util.GregorianCalendar;

public class CloneTest {
	
	public static void main(String[] args)
	{
		try
		{
			Employee1 original=new Employee1("chengli",50000);
			original.setHireDay(2000,1,1);
			Employee1 copy=original.clone();
			copy.raiseSalary(10);
			copy.setHireDay(2001,12,31);
			System.out.println("original="+original);
			System.out.println("copy="+copy);
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}

}


class Employee1 implements Cloneable
{

	private String name;
	private double salary;
	private Date hireDay;
	
	public Employee1(String n,double s)
	{
		name=n;
		salary=s;
		hireDay=new Date();	
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
	
	// 实现克隆接口,声明为public
	public Employee1 clone() throws CloneNotSupportedException
	{
		Employee1 cloned=(Employee1) super.clone();
		cloned.hireDay=(Date) hireDay.clone();
		return cloned;
	}
	
	public void setHireDay(int year,int month,int day)
	{
		
	Date newHireDay=new GregorianCalendar(year,month-1,day).getTime();
	hireDay.setTime(newHireDay.getTime());
		
	}
	
	public String toString()
	{
		return "Employee [name="+name+" ,salary="+salary+" ,hireDay="+hireDay+"]";
	}
	
}