package abstraction;

public class SearchAll extends Google{

		public int search()
		{
			System.out.println("Search All");
			return 5;
		}
		public static void main(String[] args)
		{
			SearchAll obj=new SearchAll();
			obj.display();
			int temp=obj.search();
			 System.out.println(temp+" Results found");
		}
}
