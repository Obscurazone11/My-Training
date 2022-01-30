package abstraction;

public class VideoSearch extends Google{
	public int search()
	{
		System.out.println("Search Video");
		return 2;
	}
	public static void main(String[] args)
	{
		VideoSearch obj=new VideoSearch();
		obj.display();
	 int temp=obj.search();
	 System.out.println(temp+" Results found");
	}
}
