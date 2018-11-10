import java.util.*;

class stu implements Comparable<stu>
{
	private int age;
	private String name;
	stu(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	public int getAge()
	{
		return this.age;
	}
	public String getname() {
		return this.name;
	}
	public int compareTo(stu a2) {
		if(this.getAge()>a2.getAge())
			return 1;
		else if(this.getAge()==a2.getAge())
		{
			if(this.getname().compareTo(a2.getname())>0)
			{
				return 1;
			}
			else if(this.getname().equals(a2.getname()))
				return 0;
			else
				return -1;
		}
		else
			return -1;
	}
	
}
public class sortbyagename
{
	public static void main(String x[])
	{
		Scanner scan = new Scanner(System.in);
		List<stu> l1= new LinkedList<stu>();
		for(int i=0;i<5;i++)
		{
			int age=scan.nextInt();
			String name=scan.next();
			l1.add(new stu(age,name));
		}
		l1.sort(null);
		for(stu i:l1)
			System.out.println(i.getAge()+" "+i.getname());
	}
}