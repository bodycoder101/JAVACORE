package chapter5;
import java.util.*;

/**
 * 
 * @ClassName: EnumTest
 * @Description: 测试枚举类型
 * @author: Bodycoder
 * @date: 2017年2月18日 下午9:29:58
 */

public class EnumTest {
	
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		System.out.print("ENter a size: (SMALL,MEDIA,LARGE,EXTRA_LARGE)");
		String input=in.next().toUpperCase();
		Size size=Enum.valueOf(Size.class, input);
		
		System.out.println("size="+size);//调用系统默认的toString()函数
		System.out.println("abbreviation="+size.getAbbreviation());
		if(size==Size.EXTRA_LARGE)
			System.out.println("Good job--you paid attention to the _.");
	}
	

}

enum Size{
	
	SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");

	private String abbreviation;
	private Size(String abbreviation) {this.abbreviation=abbreviation;}
	public String getAbbreviation() {return abbreviation;}
}











