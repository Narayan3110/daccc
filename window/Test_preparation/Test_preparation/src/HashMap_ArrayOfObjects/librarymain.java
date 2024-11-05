package HashMap_ArrayOfObjects;

class librarymain{
	String title;
	String author;
	int availableCopies;
	public librarymain(String title, String author, int availableCopies) 
	{
		this.title = title;
		this.author = author;
		this.availableCopies = availableCopies;
	}
	void display()
	{
		System.out.println(title+" "+author+" "+availableCopies);
	}
}


