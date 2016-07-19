
public class SAMPLE1 {


	 	 
	public static void main(String[] args) {
		if(args.length==0)
		{
			System.out.println("please enter the integer");
		}
		else{
			int a=Integer.parseInt(args[0]);
		
			if(a>0)
			{
				System.out.println(""+a+" is positive number");
				
			}
		else if(a==0)
	{
System.out.println(""+a+" is neither positive nor negative number");
}
		else{
			System.out.println(""+a+" is negative number");
		}
}
}}