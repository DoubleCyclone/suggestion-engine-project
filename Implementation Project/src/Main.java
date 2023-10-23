import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	static boolean userPickedVeganOrNot = false;

	static String operations = "0-)Get user info\n" + "1-)Select a preference\n" + "Enter q to Quit";

	static ArrayList<Book> books = new ArrayList<Book>();
	static ArrayList<Game> games = new ArrayList<Game>();
	static ArrayList<Restaurant> restaurants = new ArrayList<Restaurant>();
	static ArrayList<Shop> shops = new ArrayList<Shop>();

	static User user = new User();

	public static void main(String[] args) {
		// @formatter:off
		// ADDING BOOKS TO DATABASE
		books.add(new Book("Don Quixote", "Miguel de Cervantes", new String[] { "Novel" }));
		books.add(new Book("A Tale of Two Cities", "Charles Dickens", new String[] { "Historical Novel" }));
		books.add(new Book("The Lord of the Rings", "J.R.R.Tolkien", new String[] { "Adventure", "Fantasy" }));
		books.add(new Book("The Little Prince", "Antoine de Saint-Exupéry", new String[] { "Fable", "Fantasy" }));
		books.add(new Book("The Hobbit", "J.R.R.Tolkien", new String[] { "High Fantasy", "Juvenile Fantasy" }));
		books.add(new Book("Harry Potter and the Philosopher's Stone", "J.K.Rowling", new String[] { "Fantasy" }));
		books.add(new Book("The Lion, the Witch and the Wardrobe", "C.S.Lewis",new String[] { "Christian Literature", "Juvenile Fantasy" }));
		books.add(new Book("She: A History of Adventure", "H.Rider Haggard",new String[] { "Adventure", "Fantasy", "Gothic" }));
		books.add(new Book("The Adventures of Pinocchio", "Carlo Collodi", new String[] { "Adventure","Fiction","Literature" }));
		books.add(new Book("The Da Vinci Code", "Dan Brown", new String[] { "Detective Fiction","Mystery","Thriller" }));
		books.add(new Book("Harry Potter and the Chamber of Secrets", "J.K.Rowling", new String[] { "Fantasy" }));
		books.add(new Book("Harry Potter and the Prisoner of Azkaban", "J.K.Rowling", new String[] { "Fantasy" }));
		books.add(new Book("Harry Potter and the Goblet of Fire", "J.K.Rowling", new String[] { "Fantasy" }));
		books.add(new Book("Harry Potter and the Order of the Phoenix", "J.K.Rowling", new String[] { "Fantasy" }));
		books.add(new Book("Harry Potter and the Half-Blood Prince", "J.K.Rowling", new String[] { "Fantasy" }));
		books.add(new Book("Harry Potter and the Deathly Hallows", "J.K.Rowling", new String[] { "Fantasy" }));
		books.add(new Book("The Alchemist", "Paulo Coelho", new String[] { "Adventure","Quest" }));
		books.add(new Book("The Catcher in the Rye", "J.D. Salinger", new String[] { "Realistic Fiction" }));
		books.add(new Book("The Bridges of Madison County", "Robert James Waller", new String[] { "Fiction","Romance" }));
		books.add(new Book("Ben-Hur: A Tale of the Christ", "Lew Wallace", new String[] { "Christian Literature","Historical Novel" }));
		books.add(new Book("One Hundred Years of Solitude", "Gabriel García Márquez", new String[] { "Magic Realism" }));
		books.add(new Book("Lolita", "Vladimir Nabokov", new String[] { "Novel" }));
		books.add(new Book("Heidi", "Johanna Spyri", new String[] { "Juvenile Literature" }));
		books.add(new Book("Anne of Green Gables", "Lucy Maud Montgomery", new String[] { "Novel" }));
		books.add(new Book("Black Beauty", "Anna Sewell", new String[] { "Juvenile Literature" }));
		books.add(new Book("The Name of the Rose", "Umberto Eco", new String[] { "Historical Mystery","Novel" }));
		books.add(new Book("The Eagle Has Landed", "Jack Higgins", new String[] { "Thriller","War" }));
		books.add(new Book("Watership Down", "Richard Adams", new String[] { "Fantasy" }));
		books.add(new Book("Charlotte's Web", "E.B.White", new String[] { "Juvenile Literature" }));
		books.add(new Book("The Ginger Man", "J.P.Donleavy", new String[] { "Novel" }));
		
		// ADDING GAMES TO DATABASE
		games.add(new Game("Street Fighter V", "Capcom", 12, new String[] { "Action", "Fighting" },new String[] { "PC", "Playstation 4" }));
		games.add(new Game("Darkest Dungeon", "Red Hook Studios", 16, new String[] {  "RPG","Turn-Based Combat" },new String[] { "Nintendo Switch" ,"PC", "Playstation 4" }));
		games.add(new Game("Warframe", "Digital Extremes", 18, new String[] { "Action", "Looter Shooter" },new String[] { "Nintendo Switch" ,"PC", "Playstation 4","XBOX One" }));
		games.add(new Game("Dota 2", "Valve", 17, new String[] { "MOBA", "Strategy" },new String[] { "PC" }));
		games.add(new Game("Battlerite", "Stunlock Studios", 0 /*couldnt find info*/, new String[] { "MOBA", "Competitive" },new String[] { "PC", "XBOX One" }));
		games.add(new Game("Rocket League", "Psyonix LLC", 3, new String[] { "Soccer", "Competitive" },new String[] { "Nintendo Switch" ,"PC", "Playstation 4","XBOX One"  }));
		games.add(new Game("Grand Theft Auto V", "Rockstar Games", 18, new String[] { "Action", "Open World" },new String[] { "PC", "Playstation 4","XBOX One" }));
		games.add(new Game("For The King", "IronOak Games", 12, new String[] { "RPG","Turn-Based Combat" },new String[] { "Nintendo Switch" ,"PC", "Playstation 4","XBOX One" }));
		games.add(new Game("Dead Cells", "Motion Twin", 16, new String[] { "Roguelike", "Souls-like" },new String[] { "Nintendo Switch" ,"PC", "Playstation 4","XBOX One" }));
		games.add(new Game("Slay the Spire", "Mega Crit Games", 7, new String[] { "Roguelike", "Deckbuilder" },new String[] { "Nintendo Switch" ,"PC", "Playstation 4","XBOX One" }));
		games.add(new Game("Terraria", "Re-Logic", 12, new String[] { "Sandbox", "Survival" },new String[] { "Nintendo Switch" ,"PC", "Playstation 4","XBOX One" }));
		games.add(new Game("Counter-Strike: Global Offensive", "Valve", 18, new String[] { "Competitive", "Shooter" },new String[] { "PC" }));
		games.add(new Game("One Step From Eden", "Thomas Moon Kang", 0 /*no info*/, new String[] { "Action", "Deckbuilder" },new String[] { "Nintendo Switch" ,"PC", "Playstation 4" }));
		games.add(new Game("Ultra Street Fighter IV", "Capcom", 12, new String[] { "Arcade", "Fighting" },new String[] { "PC", "Playstation 4" }));
		games.add(new Game("The Witcher 3: Wild Hunt", "CD Projekt Red", 18, new String[] { "Open World", "RPG" },new String[] { "Nintendo Switch" ,"PC", "Playstation 4","XBOX One" }));
		games.add(new Game("Dicey Dungeons", "Terry Cavanagh", 3, new String[] { "Deckbuilder", "Roguelike" },new String[] { "PC", "Nintendo Switch" }));
		games.add(new Game("Streets of Rogue", "Matt Dabrowski", 16, new String[] { "Roguelike", "RPG" },new String[] { "Nintendo Switch" ,"PC", "Playstation 4","XBOX One"  }));
		games.add(new Game("Destiny 2", "Bungie", 16, new String[] { "Looter Shooter", "Open World" },new String[] { "PC", "Playstation 4","XBOX One" }));
		games.add(new Game("Stardew Valley", "ConcernedApe", 12, new String[] { "Farming Simulator", "RPG" },new String[] { "Nintendo Switch" ,"PC", "Playstation 4","XBOX One"}));
		games.add(new Game("Dark Souls III", "FromSoftware, Inc.", 16, new String[] { "RPG", "Souls-like" },new String[] { "PC", "Playstation 4","XBOX One" }));
		games.add(new Game("Devil May Cry 5", "Capcom", 18, new String[] { "Action", "Hack and Slash" },new String[] { "PC", "Playstation 4","XBOX One" }));
		games.add(new Game("Portal", "Valve", 12, new String[] { "Platformer", "Puzzle" },new String[] { "PC" }));
		games.add(new Game("Red Dead Redemption 2", "Rockstar Games", 18, new String[] { "Adventure", "Open World" },new String[] { "PC", "Playstation 4","XBOX One" }));
		games.add(new Game("Mortal Kombat 11", "NetherRealm Studios", 18, new String[] { "Fighting", "Gore" },new String[] { "Nintendo Switch" ,"PC", "Playstation 4","XBOX One" }));
		games.add(new Game("Bloodstained: Ritual of the Night", "ArtPlay", 12, new String[] { "RPG", "Metroidvania" },new String[] { "Nintendo Switch" ,"PC", "Playstation 4","XBOX One" }));
		games.add(new Game("Hollow Knight", "Team Cherry", 7, new String[] { "Metroidvania", "Souls-like" },new String[] { "Nintendo Switch" ,"PC", "Playstation 4","XBOX One" }));
		games.add(new Game("Warriors Orochi 4 Ultimate", "KOEI TECMO GAMES CO., LTD.", 12, new String[] { "Action", "Hack and Slash" },new String[] { "Nintendo Switch" ,"PC", "Playstation 4","XBOX One" }));
		games.add(new Game("Megaman Legacy Colleciton", "Capcom", 7, new String[] { "Action", "Platformer" },new String[] { "Nintendo Switch" ,"PC", "Playstation 4","XBOX One" }));
		games.add(new Game("Fallout: New Vegas", "Obsidian Entertainment", 18, new String[] { "RPG", "Open World" },new String[] { "PC"}));
		games.add(new Game("Enter the Gungeon", "Dodge Roll", 7, new String[] { "Action", "Roguelike" },new String[] { "Nintendo Switch" ,"PC", "Playstation 4","XBOX One" }));
		

		// ADDING RESTAURANTS TO DATABASE //I really don't know any good source to do a research about these so im going to make them up
		restaurants.add(new Restaurant("18+ has no vegan 1", 18, false, new String[] { "Chicken", "Fish" },new String[] { "Place A", "Place B" }));
		restaurants.add(new Restaurant("18+ has no vegan 2", 18, false, new String[] { "Chicken", "Soup" },new String[] { "Place A", "Place B" }));
		restaurants.add(new Restaurant("0+ has no vegan 1", 0, false, new String[] { "Sandwich", "Burger" },new String[] { "Place B", "Place C" }));
		restaurants.add(new Restaurant("0+ has no vegan 2", 0, false, new String[] { "Fish", "Sandwich" },new String[] { "Place A", "Place C" }));
		restaurants.add(new Restaurant("0+ has no vegan 3", 0, false, new String[] { "Soup", "Chicken" },new String[] { "Place B", "Place C" }));
		restaurants.add(new Restaurant("18+ has vegan 1", 18, true, new String[] { "Salad", "Pasta" },new String[] { "Place A", "Place C" }));
		restaurants.add(new Restaurant("18+ has vegan 2", 18, true, new String[] { "Salad", "Soup" },new String[] { "Place B", "Place C" }));
		restaurants.add(new Restaurant("0+ has vegan 1", 0, true, new String[] { "Sandwich", "Burger" },new String[] { "Place A", "Place B" }));
		restaurants.add(new Restaurant("0+ has vegan 2", 0, true, new String[] { "Pasta", "Soup" },new String[] { "Place A", "Place C" }));
		restaurants.add(new Restaurant("0+ has vegan 3", 0, true, new String[] { "Salad", "Sandwich" },new String[] { "Place B", "Place C" }));

		// ADDING SHOPS TO DATABASE
		shops.add(new Shop("Electronics", new String[] { "Electronics" }, new String[] { "Place A", "Place B" }));
		shops.add(new Shop("Electronics 2", new String[] { "Games", "Electronics" }, new String[] { "Place A", "Place C" }));
		shops.add(new Shop("Furniture", new String[] { "Furniture" }, new String[] { "Place A", "Place B" }));
		shops.add(new Shop("Furniture 2", new String[] { "Furniture", "Souvenir" }, new String[] { "Place B", "Place C" }));
		shops.add(new Shop("Books", new String[] { "Books" }, new String[] { "Place A", "Place B" }));
		shops.add(new Shop("Games", new String[] { "Games" }, new String[] { "Place A", "Place B","Place C" }));
		shops.add(new Shop("Souvenir", new String[] { "Souvenir" }, new String[] { "Place C" }));
		shops.add(new Shop("Clothes", new String[] { "Clothes" }, new String[] { "Place A", "Place B","Place C" }));
		shops.add(new Shop("Clothes 2", new String[] { "Clothes" }, new String[] { "Place B", "Place C" }));
		shops.add(new Shop("Antique", new String[] { "Antique", "Souvenir" }, new String[] { "Place A" }));
		
		// @formatter:on

		Database database = new Database(books, games, restaurants, shops);

		String selectedOperation = "";

		while (true) { // flowchart 2 - operations menu
			System.out.println("-------------------------------------------");
			System.out.println(operations);
			System.out.println("-------------------------------------------");

			System.out.print("Select an operation : ");
			selectedOperation = scanner.nextLine();

			if (user.getPreference() == null) { // NO PREFERENCE YET
				switch (selectedOperation) {
				case "0": {
					System.out.println("-------------------------------------------");
					user.printInfo();
					System.out.println("-------------------------------------------");
					break;
				}
				case "1": {
					preferenceChange(user, database);
					break;
				}
				case "q": {
					return;
				}
				default: {
					System.out.println("Invalid operation...");
					break;
				}
				}
			} else if (user.getPreference().equals("Book")) { // PREFERENCE = BOOK
				switch (selectedOperation) {
				case "0": {
					System.out.println("-------------------------------------------");
					user.printInfo();
					System.out.println("-------------------------------------------");
					break;
				}
				case "1": {
					preferenceChange(user, database);
					break;
				}
				case "2": {
					database.printTags(database.getBookTags(), user);
					userAddTag(database, user);
					break;
				}
				case "3": {
					userRemoveTag(user);
					break;
				}
				case "4": {
					perfectMatchCheck(user);
					break;
				}
				case "5": {
					ArrayList<String> authorList = new ArrayList<String>();
					createList(authorList, null, null);
					break;
				}
				case "6": {
					showSuggestions();
					break;
				}
				case "7": {
					continue;
				}
				case "q": {
					return;
				}
				default: {
					System.out.println("Invalid operation...");
					break;
				}

				}
			} else if (user.getPreference().equals("Game")) { // PREFERENCE = GAME
				switch (selectedOperation) {
				case "0": {
					System.out.println("-------------------------------------------");
					user.printInfo();
					System.out.println("-------------------------------------------");
					break;
				}
				case "1": {
					preferenceChange(user, database);
					break;
				}
				case "2": {
					database.printTags(database.getGameTags(), user);
					userAddTag(database, user);
					break;
				}
				case "3": {
					userRemoveTag(user);
					break;
				}
				case "4": {
					perfectMatchCheck(user);
					break;
				}
				case "5": {
					ArrayList<String> developerList = new ArrayList<String>();
					createList(null, developerList, null);
					break;
				}
				case "6": {
					showSuggestions();
					break;
				}
				case "7": {
					continue;
				}
				case "q": {
					return;
				}
				default: {
					System.out.println("Invalid operation...");
					break;
				}
				}
			} else if (user.getPreference().equals("Restaurant")) { // PREFERENCE = RESTAURANT
				switch (selectedOperation) {
				case "0": {
					System.out.println("-------------------------------------------");
					user.printInfo();
					System.out.println("-------------------------------------------");
					break;
				}
				case "1": {
					preferenceChange(user, database);
					break;
				}
				case "2": {
					database.printTags(database.getRestaurantTags(), user);
					userAddTag(database, user);
					break;
				}
				case "3": {
					userRemoveTag(user);
					break;
				}
				case "4": {
					perfectMatchCheck(user);
					break;
				}
				case "5": {
					ArrayList<String> locationList = new ArrayList<String>();
					createList(null, null, locationList);
					break;
				}
				case "6": {
					showSuggestions();
					break;
				}
				case "7": {
					continue;
				}
				case "q": {
					return;
				}
				default: {
					System.out.println("Invalid operation...");
					break;
				}
				}
			} else if (user.getPreference().equals("Shop")) { // PREFERENCE = SHOP
				switch (selectedOperation) {
				case "0": {
					System.out.println("-------------------------------------------");
					user.printInfo();
					System.out.println("-------------------------------------------");
					break;
				}
				case "1": {
					preferenceChange(user, database);
					break;
				}
				case "2": {
					database.printTags(database.getShopTags(), user);
					userAddTag(database, user);
					break;
				}
				case "3": {
					userRemoveTag(user);
					break;
				}
				case "4": {
					perfectMatchCheck(user);
					break;
				}
				case "5": {
					ArrayList<String> locationList = new ArrayList<String>();
					createList(null, null, locationList);
					break;
				}
				case "6": {
					showSuggestions();
					break;
				}
				case "7": {
					continue;
				}
				case "q": {
					return;
				}
				default: {
					System.out.println("Invalid operation...");
					break;
				}
				}
			} else {
				return;
			}
		}
	}

	public static void userAddTag(Database database, User user) { // flowchart 4 - Tag adder 1
		// Adding Tags to Whitelist
		// This will be filtered by the ones available in each category though

		boolean addMore = true;
		while (addMore) {
			System.out.print("Enter the index of the tag you want to wishlist (Enter -1 to quit) : ");
			int index = scanner.nextInt();
			scanner.nextLine();
			if (index == -1) {
				addMore = false;
			} else {
				if (user.getPreference().equals("Game")) {
					if (index <= database.getGameTags().size() && index >= -1 && index != 0) {
						user.addTag(database.getGameTags().get(index - 1));
					} else {
						System.out.println("Invalid input...");
					}
				} else if (user.getPreference().equals("Book")) {
					if (index <= database.getBookTags().size() && index >= -1 && index != 0) {
						user.addTag(database.getBookTags().get(index - 1));
					} else {
						System.out.println("Invalid input...");
					}
				} else if (user.getPreference().equals("Restaurant")) {
					if (index <= database.getRestaurantTags().size() && index >= -1 && index != 0) {
						user.addTag(database.getRestaurantTags().get(index - 1));
					} else {
						System.out.println("Invalid input...");
					}
				} else if (user.getPreference().equals("Shop")) {
					if (index <= database.getShopTags().size() && index >= -1 && index != 0) {
						user.addTag(database.getShopTags().get(index - 1));
					} else {
						System.out.println("Invalid input...");
					}
				}
			}
		}
	}

	public static void preferenceChange(User user, Database database) { // flowchart 3 - preference changer
		// chooseCategory(database, user);
		String bookOperations = "0-)Get user info\n" + "1-)Change preference\n" + "2-)Add tags\n" + "3-)Remove tags\n"
				+ "4-)Look for perfect tag matches\n" + "5-)Look for perfect author matches\n"
				+ "6-)Look for other suggestions\n" + "7-)Show the operations again\n" + "Enter q to Quit";
		String gameOperations = "0-)Get user info\n" + "1-)Change preference\n" + "2-)Add tags\n" + "3-)Remove tags\n"
				+ "4-)Look for perfect tag matches\n" + "5-)Look for perfect developer matches\n"
				+ "6-)Look for other suggestions\n" + "7-)Show the operations again\n" + "Enter q to Quit";
		String shopOperations = "0-)Get user info\n" + "1-)Change preference\n" + "2-)Add tags\n" + "3-)Remove tags\n"
				+ "4-)Look for perfect tag matches\n" + "5-)Look for perfect location matches\n"
				+ "6-)Look for other suggestions\n" + "7-)Show the operations again\n" + "Enter q to Quit";
		boolean choiceCheck = false;
		while (!choiceCheck) {
			System.out.println("1.|Books| 2.|Games| 3.|Restaurants| 4.|Shops|");
			System.out.print("Enter the index of the item you are looking for : ");
			int index0 = scanner.nextInt();
			scanner.nextLine();
			if (index0 == 1) {
				user.setPreference("Book");
				choiceCheck = true;
				operations = bookOperations;
			} else if (index0 == 2) {
				user.setPreference("Game");
				choiceCheck = true;
				operations = gameOperations;
				while (true) {
					database.printPlatforms();
					System.out.print("Enter the index of the platform you are using : ");
					int index = scanner.nextInt();
					scanner.nextLine();
					if (index <= Database.getGamePlatforms().size()) {
						user.setPlatformPreference(Database.getGamePlatforms().get(index - 1));
						break;
					} else {
						System.out.println("Invalid input");
					}
				}
			} else if (index0 == 3) {
				user.setPreference("Restaurant");
				choiceCheck = true;
				operations = shopOperations;
				while (true) {
					System.out.print("Are you a vegan ? (y/n) : ");
					String isVegan = scanner.nextLine();
					if (isVegan.equals("y")) {
						user.setVegan(true);
						userPickedVeganOrNot = true;
						break;
					} else if (isVegan.equals("n")) {
						user.setVegan(false);
						userPickedVeganOrNot = true;
						break;
					} else {
						System.out.println("Invalid input...");
					}
				}
			} else if (index0 == 4) {
				user.setPreference("Shop");
				choiceCheck = true;
				operations = shopOperations;
			} else {
				System.out.println("Invalid input...");
			}
		}

		user.getTags().clear();
	}

	public static void userRemoveTag(User user) { // flowchart 5 - Tag remover

		class Local {
			void removeTag(User user, int index) {
				System.out.print("Do you want to remove " + user.getTags().get(index) + " ? (y/n) : ");
				String choice = scanner.nextLine();
				if (choice.equals("y")) {
					String tempTag = user.getTags().get(index);
					user.getTags().remove(index);
					System.out.println(tempTag + " has been removed...");
				} else if (choice.equals("n")) {
					System.out.println("No tags have been removed...");
				} else {
					System.out.println("Invalid input...");
				}
			}
		}
		Local local = new Local();

		if (user.getTags().size() <= 0) {
			System.out.println("There are no tags to remove...");
		} else if (user.getTags().size() == 1) {
			user.printTags();
			local.removeTag(user, 0);
		} else {
			int index = 0;
			while (index != -1) {
				if (user.getTags().size() <= 0) {
					System.out.println("There are no tags to remove...");
					break;
				} else {
					user.printTags();
					System.out.print("Enter the number of the tag you want to remove or -1 to quit : ");
					index = scanner.nextInt();
					scanner.nextLine();
					if (index == -1) {
						break;
					} else {
						if (index <= user.getTags().size() && index > 0) {
							local.removeTag(user, index - 1);
						} else {
							System.out.println("Invalid number...");
						}
					}
				}
			}
		}

	}

	public static void perfectMatchCheck(User user) { // flowchart 6 - Perfect Match Shower

		boolean match = true;
		if (user.getPreference().equals("Book")) {
			for (int i = 0; i < books.size(); i++) {
				if (user.getTags().size() == books.get(i).getTags().length) {
					for (int j = 0; j < books.get(i).getTags().length; j++) {
						match = user.getTags().get(j).equals(books.get(i).getTags()[j]);
						if (!match) {
							break;
						}
					}
					if (match) {
						books.get(i).printItem();
					}
					match = true;
				}
			}
		} else if (user.getPreference().equals("Game")) {
			for (int i = 0; i < games.size(); i++) {
				if (user.getTags().size() == games.get(i).getTags().length) {
					for (int j = 0; j < games.get(i).getTags().length; j++) { 
						match = user.getTags().get(j).equals(games.get(i).getTags()[j]);
						if (!match) {
							break;
						}
					}
					if (match && user.getAge() >= games.get(i).getAgeLimit()) {
						boolean platformMatch = false;
						for (int j = 0; j < games.get(i).getPlatforms().length; j++) {
							if (user.getPlatformPreference().equals(games.get(i).getPlatforms()[j])) {
								platformMatch = true;
								break;
							}
						}
						if (platformMatch) {
							games.get(i).printItem();
						}
						platformMatch = false;
					}
					match = true;
				}
			}
		} else if (user.getPreference().equals("Restaurant")) {
			for (int i = 0; i < restaurants.size(); i++) {
				if (user.getTags().size() == restaurants.get(i).getTags().length) {
					for (int j = 0; j < restaurants.get(i).getTags().length; j++) {
						match = user.getTags().get(j).equals(restaurants.get(i).getTags()[j]);
						if (!match) {
							break;
						}
					}
					if (match && user.getAge() >= restaurants.get(i).getAgeLimit() && user.isVegan() == false) {
						restaurants.get(i).printItem();
					} else if (match && user.getAge() >= restaurants.get(i).getAgeLimit() && user.isVegan() == true) {
						if (restaurants.get(i).isHasVeganOption()) {
							restaurants.get(i).printItem();
						}
					}
					match = true;
				}
			}
		} else if (user.getPreference().equals("Shop")) {
			for (int i = 0; i < shops.size(); i++) {
				if (user.getTags().size() == shops.get(i).getTags().length) {
					for (int j = 0; j < shops.get(i).getTags().length; j++) {
						match = user.getTags().get(j).equals(shops.get(i).getTags()[j]);
						if (!match) {
							break;
						}
					}
					if (match) {
						shops.get(i).printItem();
					}
					match = true;
				}
			}
		}else {
			return;
		}

	}

	public static void createList(ArrayList<String> authorList, ArrayList<String> developerList,
			ArrayList<String> locationList) {
		boolean match = false;
		if (user.getPreference().equals("Book")) {
			for (int k = 0; k < books.size(); k++) {
				if (authorList.size() == 0) {
					authorList.add(books.get(0).getAuthor());
				} else {
					for (int i = 1; i < books.size(); i++) {
						for (int j = 0; j < authorList.size(); j++) {
							if (books.get(i).getAuthor().equals(authorList.get(j))) {
								match = true;
								break;
							}
						}
						if (!match) {
							authorList.add(books.get(i).getAuthor());
						}
						match = false;
					}
				}
			}
			for (int i = 0; i < authorList.size() - 1; i++) {
				for (int j = 1; j < authorList.size(); j++) {
					if (i < j) {
						if (authorList.get(i).compareToIgnoreCase(authorList.get(j)) > 0) {
							String temp = authorList.get(i);
							authorList.set(i, authorList.get(j));
							authorList.set(j, temp);
						}
					}
				}
			}
			System.out.print("Authors : ");
			for (int i = 0; i < authorList.size(); i++) {
				System.out.print((i + 1) + ".|" + authorList.get(i) + "| ");
			}
			showMatches(authorList);
		} else if (user.getPreference().equals("Game")) {
			for (int k = 0; k < games.size(); k++) {
				if (developerList.size() == 0) {
					developerList.add(games.get(0).getDeveloper());
				} else {
					for (int i = 1; i < games.size(); i++) {
						for (int j = 0; j < developerList.size(); j++) {
							if (games.get(i).getDeveloper().equals(developerList.get(j))) {
								match = true;
								break;
							}
						}
						if (!match) {
							developerList.add(games.get(i).getDeveloper());
						}
						match = false;
					}
				}
			}
			for (int i = 0; i < developerList.size() - 1; i++) {
				for (int j = 1; j < developerList.size(); j++) {
					if (i < j) {
						if (developerList.get(i).compareToIgnoreCase(developerList.get(j)) > 0) {
							String temp = developerList.get(i);
							developerList.set(i, developerList.get(j));
							developerList.set(j, temp);
						}
					}
				}
			}
			showMatches(developerList);
		} else if (user.getPreference().equals("Restaurant")) {
			int locationIndex = 0;
			for (int i = 0; i < restaurants.get(0).getLocations().length; i++) {
				locationList.add(restaurants.get(0).getLocations()[i]);
			}

			for (int k = 0; k < restaurants.size(); k++) {
				for (int j = 0; j < restaurants.get(k).getLocations().length; j++) {
					for (int j2 = 0; j2 < locationList.size(); j2++) {
						if (restaurants.get(k).getLocations()[j].equals(locationList.get(j2))) {
							match = true;
							break;
						}
						locationIndex = j;
					}
					if (!match) {
						locationList.add(restaurants.get(k).getLocations()[locationIndex]);
					}
					match = false;
				}
			}
			for (int i = 0; i < locationList.size() - 1; i++) {
				for (int j = 1; j < locationList.size(); j++) {
					if (i < j) {
						if (locationList.get(i).compareToIgnoreCase(locationList.get(j)) > 0) {
							String temp = locationList.get(i);
							locationList.set(i, locationList.get(j));
							locationList.set(j, temp);
						}
					}
				}
			}
			System.out.print("Locations : ");
			for (int i = 0; i < locationList.size(); i++) {
				System.out.print((i + 1) + ".|" + locationList.get(i) + "| ");
			}
			showMatches(locationList);
		} else if (user.getPreference().equals("Shop")) {
			int locationIndex = 0;
			for (int i = 0; i < shops.get(0).getLocations().length; i++) {
				locationList.add(shops.get(0).getLocations()[i]);
			}

			for (int k = 0; k < shops.size(); k++) {
				for (int j = 0; j < shops.get(k).getLocations().length; j++) {
					for (int j2 = 0; j2 < locationList.size(); j2++) {
						if (shops.get(k).getLocations()[j].equals(locationList.get(j2))) {
							match = true;
							break;
						}
						locationIndex = j;
					}
					if (!match) {
						locationList.add(shops.get(k).getLocations()[locationIndex]);
					}
					match = false;
				}
			}
			for (int i = 0; i < locationList.size() - 1; i++) {
				for (int j = 1; j < locationList.size(); j++) {
					if (i < j) {
						if (locationList.get(i).compareToIgnoreCase(locationList.get(j)) > 0) {
							String temp = locationList.get(i);
							locationList.set(i, locationList.get(j));
							locationList.set(j, temp);
						}
					}
				}
			}
			System.out.print("Locations : ");
			for (int i = 0; i < locationList.size(); i++) {
				System.out.print((i + 1) + ".|" + locationList.get(i) + "| ");
			}
			showMatches(locationList);
		}
	}

	public static void showMatches(ArrayList<String> list) {
		if (user.getPreference().equals("Book")) {
			System.out.print("\nEnter the index of the author you want to see books from :");
			int index = scanner.nextInt();
			scanner.nextLine();
			int count = 0;
			for (int i = 0; i < books.size(); i++) {
				if (books.get(i).getAuthor().equals(list.get(index - 1))) {
					count++;
					books.get(i).printItem();
				}
			}
			if (count == 0) {
				System.out.println("Match Not Found...");
			}
		} else if (user.getPreference().equals("Game")) {
			while (true) {
				System.out.print("Developers : ");
				for (int i = 0; i < list.size(); i++) {
					System.out.print((i + 1) + ".|" + list.get(i) + "| ");
				}
				System.out.print("\nEnter the index of the developer you want to see games from or -1 to quit: ");
				int index = scanner.nextInt();
				scanner.nextLine();
				if (index == -1) {
					break;
				} else {
					for (int i = 0; i < games.size(); i++) {
						if (games.get(i).getDeveloper().equals(list.get(index - 1))
								&& user.getAge() >= games.get(i).getAgeLimit()) {
							boolean platformMatch = false;
							for (int j = 0; j < games.get(i).getPlatforms().length; j++) {
								if (user.getPlatformPreference().equals(games.get(i).getPlatforms()[j])) {
									platformMatch = true;
									break;
								}
							}
							if (platformMatch) {
								games.get(i).printItem();
							}
							platformMatch = false;
						}
					}
				}
			}
		} else if (user.getPreference().equals("Restaurant")) {
			System.out.print("\nEnter the index of the location you want to search for : ");
			int index = scanner.nextInt();
			scanner.nextLine();
			for (int i = 0; i < restaurants.size(); i++) {
				for (int j = 0; j < restaurants.get(i).getLocations().length; j++) {
					if (restaurants.get(i).getLocations()[j].equals(list.get(index - 1))
							&& user.getAge() >= restaurants.get(i).getAgeLimit() && user.isVegan() == false) {
						restaurants.get(i).printItem();
					} else if (restaurants.get(i).getLocations()[j].equals(list.get(index - 1))
							&& user.getAge() >= restaurants.get(i).getAgeLimit() && user.isVegan() == true) {
						if (restaurants.get(i).isHasVeganOption()) {
							restaurants.get(i).printItem();
						}
					}
				}
			}
		} else if (user.getPreference().equals("Shop")) {
			System.out.print("\nEnter the index of the location you want to search for : ");
			int index = scanner.nextInt();
			scanner.nextLine();
			for (int i = 0; i < shops.size(); i++) {
				for (int j = 0; j < shops.get(i).getLocations().length; j++) {
					if (shops.get(i).getLocations()[j].equals(list.get(index - 1))) {
						shops.get(i).printItem();
					}
				}
			}
		}
	}

	public static void showSuggestions() {
		if (user.getTags().size() == 0) {
			System.out.println("You have no tags whitelisted...");
			return;
		}
		if (user.getPreference().equals("Book")) {
			ArrayList<Book> matches = new ArrayList<Book>();
			boolean duplicate = false;

			for (int i = 0; i < user.getTags().size(); i++) {
				for (int j = 0; j < books.size(); j++) {
					for (int k = 0; k < books.get(j).getTags().length; k++) {
						if (user.getTags().get(i).equals(books.get(j).getTags()[k])) {
							for (int u = 0; u < matches.size(); u++) {
								if (matches.get(u) == books.get(j)) {
									duplicate = true;
								}
							}
							if (!duplicate) {
								matches.add(books.get(j));
							}
							duplicate = false;
						}
					}
				}
			}
			for (int i = 0; i < matches.size(); i++) {
				matches.get(i).printItem();
			}
		} else if (user.getPreference().equals("Game")) {
			ArrayList<Game> matches = new ArrayList<Game>();
			boolean duplicate = false;
			for (int i = 0; i < user.getTags().size(); i++) {
				for (int j = 0; j < games.size(); j++) {
					for (int k = 0; k < games.get(j).getTags().length; k++) {
						if (user.getTags().get(i).equals(games.get(j).getTags()[k])
								&& user.getAge() >= games.get(j).getAgeLimit()) {
							for (int u = 0; u < matches.size(); u++) {
								if (matches.get(u) == games.get(j)) {
									duplicate = true;
								}
							}
							if (!duplicate) {
								matches.add(games.get(j));
							}
							duplicate = false;
						}
					}
				}
			}
			for (int i = 0; i < matches.size(); i++) {
				boolean platformMatch = false;
				for (int j = 0; j < matches.get(i).getPlatforms().length; j++) {
					if (user.getPlatformPreference().equals(matches.get(i).getPlatforms()[j])) {
						platformMatch = true;
						break;
					}
				}
				if (platformMatch) {
					matches.get(i).printItem();
				}
				platformMatch = false;
			}
		} else if (user.getPreference().equals("Restaurant")) {
			ArrayList<Restaurant> matches = new ArrayList<Restaurant>();
			boolean duplicate = false;
			for (int i = 0; i < user.getTags().size(); i++) {
				for (int j = 0; j < restaurants.size(); j++) {
					for (int k = 0; k < restaurants.get(j).getTags().length; k++) {
						if (user.getTags().get(i).equals(restaurants.get(j).getTags()[k])
								&& user.getAge() >= restaurants.get(j).getAgeLimit()) {
							for (int u = 0; u < matches.size(); u++) {
								if (matches.get(u) == restaurants.get(j)) {
									duplicate = true;
								}
							}
							if (!duplicate && user.getAge() >= restaurants.get(j).getAgeLimit()
									&& user.isVegan() == false) {
								matches.add(restaurants.get(j));
							} else if (!duplicate && user.getAge() >= restaurants.get(j).getAgeLimit()
									&& user.isVegan() == true) {
								if (restaurants.get(j).isHasVeganOption() == true)
									matches.add(restaurants.get(j));
							}
							duplicate = false;
						}
					}
				}
			}
			for (int i = 0; i < matches.size(); i++) {
				matches.get(i).printItem();
			}
		} else if (user.getPreference().equals("Shop")) {
			ArrayList<Shop> matches = new ArrayList<Shop>();
			boolean duplicate = false;
			for (int i = 0; i < user.getTags().size(); i++) {
				for (int j = 0; j < shops.size(); j++) {
					for (int k = 0; k < shops.get(j).getTags().length; k++) {
						if (user.getTags().get(i).equals(shops.get(j).getTags()[k])) {
							for (int u = 0; u < matches.size(); u++) {
								if (matches.get(u) == shops.get(j)) {
									duplicate = true;
								}
							}
							if (!duplicate) {
								matches.add(shops.get(j));
							}
							duplicate = false;
						}
					}
				}
			}
			for (int i = 0; i < matches.size(); i++) {
				matches.get(i).printItem();
			}
		}
	}
}
