package day13;

class book {
	@Override
	public String toString() {
		return "book [id=" + id + ", name=" + name + ", price=" + price + ", author=" + author + "]";
	}

	private int id;
	private String name;
	private double price;
	private String author;

	book() {

	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public book(int id, String name, double price, String author) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.author = author;
	}


	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
}



