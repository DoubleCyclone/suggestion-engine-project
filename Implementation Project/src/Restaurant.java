public class Restaurant extends Category {

	private int ageLimit;
	private boolean hasVeganOption;
	private String[] locations;

	public Restaurant(String name, int ageLimit, boolean hasVeganOption, String[] tags, String[] locations) {
		super(name, tags);
		this.ageLimit = ageLimit;
		this.hasVeganOption = hasVeganOption;
		this.locations = locations;
	}

	public int getAgeLimit() {
		return ageLimit;
	}

	public boolean isHasVeganOption() {
		return hasVeganOption;
	}

	public String[] getLocations() {
		return locations;
	}

	@Override
	public void printItem() {
		System.out.println("-------------------------------------------");
		System.out.println("Name : " + name + "\nAge Limit : " + ageLimit + "\nVegan Friendly? : "
				+ ((hasVeganOption) ? "Yes" : "No"));
		System.out.print("Food Types : ");
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
