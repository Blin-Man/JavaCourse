package day1;

public class Activity2 {
	public static void main(String[] args) 
	{
		String head = "  _______";
		String head2 = "  / \t  \\";
		String head3 = " /  \t   \\";
		String bottom = " \\  \t   /";
		String bottom2 = "  \\_______/";
		String mid ="|  \t    |";
		
		
		System.out.println(" " + head);
		System.out.println(head2);
		System.out.println(head3);
		System.out.println(bottom);
		System.out.println(bottom2);
		//
		System.out.println();
		//
		System.out.println(" " + head);
		System.out.println(head2);
		System.out.println(head3);
		for(int i=0;i<3;i++) {
			System.out.println(mid);
		}
		System.out.println(bottom);
		System.out.println(bottom2);
		//
		System.out.println(" " + head);
		System.out.println(head2);
		System.out.println(head3);
		System.out.println(" +---------+");
		//
		System.out.println(" " + head);
		System.out.println(head2);
		System.out.println(head3);
		
	}
}

