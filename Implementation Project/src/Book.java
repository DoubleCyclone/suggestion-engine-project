public class Book extends Category {

	private String author;

	public Book(String name, String author, String[] tags) {
		super(name, tags);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public void printItem() {
		System.out.println("-------------------------------------------");
		System.out.println("Name : " + name + "\nAuthor : " + author);
		System.out.print("Genres : ");
		for (int i = 0; i < tags.length; i++) {
			System.out.print("|" + tags[i] + "| ");
		}
		System.out.println();
		System.out.println("-------------------------------------------");
	}
}
