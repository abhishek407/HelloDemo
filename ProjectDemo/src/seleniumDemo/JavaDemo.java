package seleniumDemo;

import java.text.DecimalFormat;

public class JavaDemo 
{
	private JavaDemo() 
	
	{
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) 
	{	
		
		  String final_price = "35"; 
		  double inp = Double.parseDouble(final_price);
		  final_price = String.format("%.2f",inp); 
		  System.out.println(final_price);
		  
		  String final_price_1 = "35.00"; 
		  double inp_1 =Double.parseDouble(final_price_1); 
		  DecimalFormat format = new DecimalFormat("0.##"); 
		  final_price_1= format.format(inp_1);
		  System.out.println(final_price_1);
		 
		
		
		double inp_ran = Math.random();
		String input = String.valueOf(inp_ran).replaceAll("0\\.", "");
		String out = input.substring(0, 10); 
		System.out.println(out);
		
		
		
		/*
		 * System.out.println(inp_do); int a = (int) (inp_do/1000000000);
		 * System.out.println(a);
		 */
		
		
		
	}
	
	
	public void add() 
	{
		sum();
		diff();
		
	}
	
	public static void sum() 
	{
		System.out.println("sum");
	}
	
	public  void diff() 
	{
		System.out.println("diff");
	}
}
