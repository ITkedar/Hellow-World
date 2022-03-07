import java.util.Scanner;

public class Book 
{
	int bid;
	String bname;
	float bprice;
	String aname;
	
	
	void displayBook()
	{
		System.out.println(bid);
		System.out.println(bname);
		System.out.println(bprice);
		System.out.println(aname);
		
	}
	
	
	void readbookdata()
	{
		Scanner sc = new Scanner(System.in);
		  bid  =sc.nextInt();
		  bprice= sc.nextFloat();
		  bname= sc.next();
		  aname=  sc.next();
	
	
	}
	
	float  findpriceDiscount()
	{
		float discount =0.0f;
		if(bprice>500)
		{
			discount  = bprice*0.02f;
			
		}else
		{
			discount  = 0.0f;
		}
		
		float dprice =  (bprice- discount);
		return dprice;
	}
	
	
		
}
