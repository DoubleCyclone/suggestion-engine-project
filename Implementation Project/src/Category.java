public abstract class Category {

	protected String name;
	protected String[] tags;

	public Category(String name, String[] tags) {
		this.name = name;
		if (tags.length > 1) {
			for (int i = 0; i < tags.length - 1; i++) {
				for (int j = 1; j < tags.length; j++) {
					if (i < j) {
						if (tags[i].equals(tags[j])) {
							continue;
						}
						if (tags[i].compareToIgnoreCase(tags[j]) > 0) {
							String temp = tags[i];
							tags[i] = tags[j];
							tags[j] = temp;
						}
					}
				}
			}
		}
		this.tags = tags;
	}

	public String[] getTags() {
		return tags;
	}

	public abstract void printItem();

}
