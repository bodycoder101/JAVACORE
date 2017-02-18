package chapter5;
/**
 * 
 * @ClassName: EqualsTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author: Bodycoder
 * @date: 2017年2月18日 下午4:43:17
 */

public class EqualsTest {
	
	public static void main(String[] argus)
	{
	
		Employee ali1=new Employee("adama",75000,1987,12,15);
		Employee ali2=ali1;
		Employee ali3=new Employee("adama",75000,1987,12,15);
		Employee bob=new Employee("bob",50000,1989,10,1);
		
		System.out.println("ali1==ali2:"+(ali1==ali2));
		System.out.println("ali1==ali3:"+(ali1==ali3));
		System.out.println("ali1.equals(ali3):"+ali1.equals(ali3));
		System.out.println("ali1.equals(bob):"+ali1.equals(bob));
		
		System.out.println("bob.toString():"+bob);
		
		Manager car1=new Manager("car1",80000,1987,12,25);
		Manager boss=new Manager("car1",80000,1987,12,25);
		boss.setBonus(5000);
		System.out.println("boss.toString():"+boss);
		System.out.println("car1.equals(boss):"+car1.equals(boss));
		System.out.println("ali1.hashCode():"+ali1.hashCode());
		System.out.println("ali3.hashCode():"+ali3.hashCode());
		System.out.println("bob.hashCode():"+bob.hashCode());
		System.out.println("car1.hashCode():"+car1.hashCode());
	}

}
