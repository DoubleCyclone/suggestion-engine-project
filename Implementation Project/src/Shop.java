public class Shop extends Category {

	private String[] locations;

	public Shop(String name, String[] tags, String[] locations) {
		super(name, tags);
		this.locations = locations;
	}

	public String[] getLocations() {
		return locations;
	}

	@Override
	public void printItem() {
		System.out.println("-------------------------------------------");
		System.out.println("Name : " + name);
		System.out.print("Items Sold : ");
		for (int i = 0; i < tags.length; i++) {
			System.out.print("|" + tags[i] + "| ");
		}
		System.out.println();
		System.out.print("Locations : ");
		for (int i = 0; i < locations.length; i++) {
			System.out.print("|" + locations[i] + "| ");
		}
		System.out.println();
		System.out.println("-------------------------------------------");
	}

}
