import java.util.HashSet;

public class Retainq{

	public static void main(String a[]){
		HashSet<Integer> hs = new HashSet<>();
		for(int i = 0; i < 5; i++)
		{
			hs.add(i * 10);
		}
		System.out.println("Set1");
		System.out.println(hs);
		HashSet<Integer> hs2 = new HashSet<>();
		for(int i = 3; i < 6; i++)
		{
			hs2.add(i * 10);
		}		
		System.out.println("Set2");
		System.out.println(hs2);

		hs.retainAll(hs2);
		System.out.println("values");
		System.out.println(hs);
	}
}