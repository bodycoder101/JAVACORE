package chapter6;
import java.util.*;

/**
 * 
 * @ClassName: EmployeeSortTest
 * @Description: ���ԱȽϽӿڣ�comparable interface��
 * @author: Bodycoder
 * @date: 2017��2��19�� ����7:51:50
 */
public class EmployeeSortTest {
	
	public static void main(String[] args)
	{
		Employee[] staff=new Employee[3];
		staff[0]=new Employee("li",100000,1992,1,1);
		staff[1]=new Employee("cheng",8000,1992,2,1);
		staff[2]=new Employee("li",9000,1992,3,1);
		
		
		Arrays.sort(staff);
		for(Employee e:staff)
			System.out.println("name="+e.getName()+" ,salary="+e.getSarlary());
	}

}

class Employee implements Comparable<Employee>
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
	
	//���������ӿڴ��룬��java se���Ѿ�ʵ�֣�����ֱ�ӵ���
	public interface Comparable
	{
		int compareTo(Object other);
	}
	
	//ʵ�ֽӿڵĴ���
	public int compareTo(Employee other)
	{
		return Double.compare(salary, other.salary);
				
	}
		
}
