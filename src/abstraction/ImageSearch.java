package abstraction;

public class ImageSearch extends Google {
	public int search()
	{
		System.out.println("Search Image");
		return 1;
	}
	public static void main(String[] args)
	{
		ImageSearch obj=new ImageSearch();
		obj.display();
		int temp=obj.search();
		System.out.println(temp+" Results found");
	}
	}
