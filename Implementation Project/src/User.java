import java.util.ArrayList;
import java.util.Scanner;

public class User {

	private String name;
	private int age;
	private String preference;
	private ArrayList<String> tags; // All of them
	private String platformPreference;
	private boolean isVegan; // Restaurant Only

	public User() { // flowchart 1 - user creator
		System.out.println("Welcome to Choice Helper....Please Create a User...");
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your name : ");
		this.name = scanner.nextLine();

		boolean ageCheck = false;
		while (!ageCheck) {
			System.out.print("Enter your age : ");
			int tempAge = scanner.nextInt();
			scanner.nextLine();
			if (tempAge < 10) {
				System.out.println("Users with age under 10 are not allowed...");
			} else if (tempAge > 70) {
				System.out.println("Please don't try to troll the application...");
			} else {
				this.age = tempAge;
				ageCheck = true;
				;
			}
		}
		this.platformPreference = null;
		this.preference = null;
		this.tags = new ArrayList<String>();
		this.isVegan = false;

	}

	public int getAge() {
		return age;
	}

	public String getPreference() {
		return preference;
	}

	public void setPreference(String preference) {
		this.preference = preference;
	}

	public ArrayList<String> getTags() {
		return tags;
	}

	public boolean isVegan() {
		return isVegan;
	}

	public void setVegan(boolean isVegan) {
		this.isVegan = isVegan;
	}

	public String getPlatformPreference() {
		return platformPreference;
	}

	public void setPlatformPreference(String platformPreference) {
		this.platformPreference = platformPreference;
	}

	public void addTag(String tag) { // flowchart 4 - Tag adder 2
		boolean match = false;
		while (!match) {
			for (int i = 0; i < tags.size(); i++) {
				if (tag.equals(tags.get(i))) {
					System.out.println("You already whitelisted that tag...");
					match = true;
				}
			}

			if (match == false) {
				if (tags.size() == 0) {
					tags.add(tag);
				} else {
					int place = 0;
					for (int i = 0; i < tags.size(); i++) {
						if (tags.get(i).compareToIgnoreCase(tag) < 0) {
							place++;
						}
					}
					tags.add(place, tag);
				}
			}
			break;

		}
	}

	public void printTags() {
		System.out.print("Tags : ");
		for (int i = 0; i < tags.size(); i++) {
			System.out.print((i + 1) + ".|" + tags.get(i) + "| ");
		}
		System.out.println();
	}

	public void printInfo() {
		System.out.println("Name : " + name + "\nAge : " + age + "\nPreference : " + preference);
		printTags();
	}

}
