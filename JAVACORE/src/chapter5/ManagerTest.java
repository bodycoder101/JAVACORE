package chapter5;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

/**
 * 
 * @ClassName: ManagerTest
 * @Description: 测试继承的特性
 * @author: Bodycoder
 * @date: 2017年2月17日 下午3:45:27
 */

public class ManagerTest {
	
    public static void main(String[] args)
    {
    	//construct a manager object
    	Manager boss=new Manager("Car",8000,1987,12,15);
    	boss.setBonus(5000);
    	System.out.println("boss name="+boss.getName()+", boss salary="+boss.getSalary());
    	
    	Employee[] staff=new Employee[3];
		staff[0]=boss;
		
		staff[1]=new Employee("cheng",8000,1992,2,1);
		staff[2]=new Employee("li",9000,1992,3,1);
		
		for(Employee e:staff)
			System.out.println("name="+e.getName()+", salary="+e.getSarlary());
		
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
	
	//2.18 new add
	public boolean equals(Object otherObject)
	{
		if(this==otherObject) return true;
		
		if(otherObject==null) return false;
		
		if(getClass()!=otherObject.getClass()) return false;
		
		// we know that the otherObject is a non-null Employee
		Employee other=(Employee) otherObject;
		return Objects.equals(name,other.name)&&salary==other.salary&&Objects.equals(hireDay,other.hireDay);
	}
	
	public int hashCode()
	{
		return 7*Objects.hashCode(name)+11*new Double(salary).hashCode()+13*Objects.hashCode(hireDay);
	}
	
	public String toString()
	{
		
	return getClass().getName()+"[name="+name+",salary="+salary+",hireDay="+hireDay+"]";
	
	}
		
}

class Manager extends Employee
{
	private double bonus;
	
	public Manager(String n, double s, int year, int month, int day)
	{
		super(n, s, year, month, day);
		bonus=0;
		
	}
	
	
	public double getSalary()
	{
		
		
		return super.getSarlary()+bonus;
	}
	
	public void setBonus(double b)
	{
		bonus=b;
	}
	
	//2.18 new add
	public boolean equals(Object otherObject)
	{
		if(!super.equals(otherObject)) return false;
		Manager other=(Manager) otherObject;
		
		return bonus==other.bonus;
	}

	public int hashCode()
	{
		return super.hashCode()+17*new Double(bonus).hashCode();
	}
	
	public String toString()
	{
		return super.toString()+"[bonus="+bonus+"]";
	}
	
}


















