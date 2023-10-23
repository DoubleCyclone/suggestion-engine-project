public class Game extends Category {

	private String developer;
	private int ageLimit;
	private String[] platforms;

	public Game(String name, String developer, int ageLimit, String[] tags, String[] platforms) {
		super(name, tags);
		this.developer = developer;
		this.ageLimit = ageLimit;
		this.platforms = platforms;
	}

	public String getDeveloper() {
		return developer;
	}

	public int getAgeLimit() {
		return ageLimit;
	}

	public String[] getPlatforms() {
		return platforms;
	}

	@Override
	public void printItem() {
		System.out.println("-------------------------------------------");
		System.out.println("Name : " + name + "\nDeveloper : " + developer + "\nAge Limit : " + ageLimit);
		System.out.print("Genres : ");
		for (int i = 0; i < tags.length; i++) {
			System.out.print("|" + tags[i] + "| ");
		}
		System.out.println();
		System.out.print("Platforms : ");
		for (int i = 0; i < platforms.length; i++) {
			System.out.print("|" + platforms[i] + "| ");
		}
		System.out.println();
		System.out.println("-------------------------------------------");
	}

}
