package day2;

public class Day1_Method_act2 {
	public static void main(String[] args) 
	{
		String mid ="|  \t    |";
		String bottom = " \\  \t   /";
		String bottom2 = "  \\_______/";
		
		/*
		headmaker() does this:
		System.out.println(" " + head);
		System.out.println(head2);
		System.out.println(head3);
		*/
		headmaker();
		//
		System.out.println();
		//
		headmaker();
		for(int i=0;i<3;i++) {
			System.out.println(mid);
		}
		System.out.println(bottom);
		System.out.println(bottom2);
		//
		headmaker();
		System.out.println(" +---------+");
		//
		headmaker();
		
	}
	//This method generates the top part
	public static void headmaker() {
		String head = "  _______";
		String head2 = "  / \t  \\";
		String head3 = " /  \t   \\";
		
		
		System.out.println(" " + head);
		System.out.println(head2);
		System.out.println(head3);
		
	}
}
