package c_collection;
import java.util.HashSet;

public class bHashSetEx 
{
	public static void main(String[] args)
	{
		HashSet<String> set = new HashSet<String>();	// set : 정해진 index가 없음. 순서 x , 중복된건 삭제.
		set.add("rabbit");
		set.add("zebra");
		set.add("fox");
		set.add("zebra");
		set.add("elephant");
		set.add("elephant");	
		
		System.out.println( set );	// 데이터 중복 되면 안되는 프로그램에서 사용 : ex) 로또
	}
}
