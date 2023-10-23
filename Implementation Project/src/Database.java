import java.util.ArrayList;

public class Database {

	private ArrayList<Book> books;
	private ArrayList<Game> games;
	private ArrayList<Restaurant> restaurants;
	private ArrayList<Shop> shops;
	private ArrayList<String> bookTags = new ArrayList<String>();
	private ArrayList<String> gameTags = new ArrayList<String>();
	private static ArrayList<String> gamePlatforms = new ArrayList<String>();
	private ArrayList<String> restaurantTags = new ArrayList<String>();
	private ArrayList<String> shopTags = new ArrayList<String>();

	public Database(ArrayList<Book> books, ArrayList<Game> games, ArrayList<Restaurant> restaurants,
			ArrayList<Shop> shops) {
		this.books = books;
		this.games = games;
		this.restaurants = restaurants;
		this.shops = shops;
		createTagsLists();
		sortTags(bookTags);
		sortTags(gameTags);
		sortTags(gamePlatforms);
		sortTags(restaurantTags);
		sortTags(shopTags);

	}

	public ArrayList<String> getBookTags() {
		return bookTags;
	}

	public ArrayList<String> getGameTags() {
		return gameTags;
	}

	public ArrayList<String> getRestaurantTags() {
		return restaurantTags;
	}

	public ArrayList<String> getShopTags() {
		return shopTags;
	}

	public static ArrayList<String> getGamePlatforms() {
		return gamePlatforms;
	}

	public void printPlatforms() {
		System.out.print("Platforms : ");
		for (int i = 0; i < gamePlatforms.size(); i++) {
			System.out.print((i + 1) + ".|" + gamePlatforms.get(i) + "| ");
		}
		System.out.println();
	}

	public void printTags(ArrayList<String> category, User user) {
		if (user.getPreference().equals("Book")) {
			System.out.print("Book Tags : ");
		} else if (user.getPreference().equals("Game")) {
			System.out.print("Game Tags : ");
		} else if (user.getPreference().equals("Restaurant")) {
			System.out.print("Restaurant Tags : ");
		} else if (user.getPreference().equals("Shop")) {
			System.out.print("Shop Tags : ");
		}
		for (int i = 0; i < category.size(); i++) {
			System.out.print((i+1) + ".|" + category.get(i) + "| ");
		}
		System.out.println();
	}

	private void createTagsLists() {
		boolean match = false;
		for (int i = 0; i < books.size(); i++) {
			for (int j = 0; j < books.get(i).getTags().length; j++) {
				for (int k = 0; k < bookTags.size(); k++) {
					if (books.get(i).getTags()[j].equals(bookTags.get(k))) {
						match = true;
						break;
					}
				}
				if (!match) {
					bookTags.add(books.get(i).getTags()[j]);
				}
				match = false;
			}
		}
		for (int i = 0; i < games.size(); i++) {
			for (int j = 0; j < games.get(i).getTags().length; j++) {
				for (int k = 0; k < gameTags.size(); k++) {
					if (games.get(i).getTags()[j].equals(gameTags.get(k))) {
						match = true;
						break;
					}
				}
				if (!match) {
					gameTags.add(games.get(i).getTags()[j]);
				}
				match = false;
			}

		}
		for (int i = 0; i < games.size(); i++) {
			for (int j = 0; j < games.get(i).getPlatforms().length; j++) {
				for (int k = 0; k < gamePlatforms.size(); k++) {
					if (games.get(i).getPlatforms()[j].equals(gamePlatforms.get(k))) {
						match = true;
						break;
					}
				}
				if (!match) {
					gamePlatforms.add(games.get(i).getPlatforms()[j]);
				}
				match = false;
			}

		}
		for (int i = 0; i < restaurants.size(); i++) {
			for (int j = 0; j < restaurants.get(i).getTags().length; j++) {
				for (int k = 0; k < restaurantTags.size(); k++) {
					if (restaurants.get(i).getTags()[j].equals(restaurantTags.get(k))) {
						match = true;
						break;
					}
				}
				if (!match) {
					restaurantTags.add(restaurants.get(i).getTags()[j]);
				}
				match = false;
			}
		}
		for (int i = 0; i < shops.size(); i++) {
			for (int j = 0; j < shops.get(i).getTags().length; j++) {
				for (int k = 0; k < shopTags.size(); k++) {
					if (shops.get(i).getTags()[j].equals(shopTags.get(k))) {
						match = true;
						break;
					}
				}
				if (!match) {
					shopTags.add(shops.get(i).getTags()[j]);
				}
				match = false;
			}
		}

	}

	private void sortTags(ArrayList<String> itemTags) {
		if (itemTags.size() > 1) {
			for (int i = 0; i < itemTags.size() - 1; i++) {
				for (int j = 1; j < itemTags.size(); j++) {
					if (i < j) {
						if (itemTags.get(i).equals(itemTags.get(j))) {
							continue;
						}
						if (itemTags.get(i).compareTo(itemTags.get(j)) > 0) {
							String temp = itemTags.get(i);
							itemTags.set(i, itemTags.get(j));
							itemTags.set(j, temp);
						}
					}
				}
			}
		}
	}

}
