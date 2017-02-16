package chapter4;
import java.util.*;
import static java.lang.System.*;//import the static class and method;
/**
 * 
 * @ClassName: ConstructorTest
 * @Description: 测试各种类型的构造器
 * @author: Bodycoder
 * @date: 2017年2月16日 下午1:57:43
 */

public class ConstructorTest {
	
	public static void main(String[] args)
	{
		Employee3[] staff=new Employee3[3];
		
		staff[0]=new Employee3("Zero",40000);
		staff[1]=new Employee3(60000);
		staff[2]=new Employee3();
		
		for(Employee3 e:staff)
			out.println("name="+e.getName()+" ,id="+e.getId()+" ,salary="+e.getSalary());
	}
	
}
class Employee3
{
	
	private static int nextId;
	private int id;
	private String name="";//the initial value for name;
	private double salary;
	
	//static initialization block
	
	static 
	{
		Random generator =new Random();//set nextId to a random number between 0 and 9999;
		nextId=generator.nextInt(10000);
	}
	
	//object initialization block
	{
		id=nextId;
		nextId++;
	}
	
	//three overloaded constructors
	
	public Employee3(String n,double s)
	{
		name=n;
		salary=s;
	}
	
	public Employee3(double s)
	{
		this("Zero2",s);//call constructor Emloyee3(String n,double s)
	}
	
	public Employee3()
	{
		//blank,system gives the initial value;
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
}





















