package java01;
//set : 순서가 없는 데이터의 집합(중복허용 x)
import java.util.HashSet;
import java.util.Set;


public class e29_SetTest {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		Set<String> set1 = new HashSet<String>();
	
 		set.add("우유");
		set.add("딸기우유");
		set.add("초코우유");
		set.add("우유"); //중복허용x
		System.out.println(set);
		
		set1.add("우유");
		set1.add("커피");
		
		//합집합
		Set<String> union = new HashSet<String>();
		union.addAll(set1);
		System.out.println(union);
		
		union.addAll(set);
		System.out.println(union);
		
		//교집합
		Set<String> intersection = new HashSet<String>();
		intersection.retainAll(set1);
		System.out.println(intersection);
		set.retainAll(set1); //set과 set1의 교집합. 
		System.out.println(set.retainAll(set1));//리턴값 : boolean (교집합이 있는지 없는지)					
		System.out.println(set);//set에 교집합 데이터 넣음
		}
}
