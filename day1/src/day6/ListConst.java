package day6;

class ListConst {
	int listnum;
	String listname;
	ListConst(String name, int num){
	listname = name;
	listnum = num;
	}
	void displaylist() {
		System.out.printf("\n"+ listname +" "+ listnum);
	}

}
