package chapter4;
/**
 * 
 * @ClassName: StaiticTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author: Bodycoder
 * @date: 2017年2月14日 下午4:56:14
 */

public class StaiticTest {
	public static void main(String[] args)
	{
		Employee1[] staff=new Employee1[3];
		staff[0]=new Employee1("li",7000);
		staff[1]=new Employee1("cheng",8000);
		staff[2]=new Employee1("li",9000);
		
		for(Employee1 e:staff)
		{
			e.setId();
			System.out.println("name="+e.getName()+" ,id="+e.getId()+" ,salary="+e.getSalary());
		}
	    int n=Employee1.getNextId();
		System.out.println("Next available ID:"+n);
	}
}

class Employee1
{
	private static int nextId=1;
	private String name;
	private double salary;
	private int id;
	
	public Employee1(String n,double s)
	{
		name=n;
		salary=s;
		id=0;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId()
	{
		id=nextId;
		nextId++;
	}
	
	public static int getNextId()
	{
		return nextId;
	}
	
	public static void main(String[] args)
	{
		Employee1 e=new Employee1("test Employee1",5000);
		System.out.println(e.getName()+" "+e.getSalary());
	}
}
