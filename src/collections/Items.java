package collections;

public class Items {
	int itemId;
	String ShortDescription;
	int price;
	String Brand;

	public Items(int itemId, String ShortDescription, int price, String Brand) {
		super();
		this.itemId = itemId;
		this.ShortDescription = ShortDescription;
		this.price = price;
		this.Brand = Brand;
	}

	public int getitemId() {

		return itemId;
	}

	public void setitemId(int itemId) {

		this.itemId = itemId;
	}

	public String getShortDescription() {

		return ShortDescription;
	}

	public void setName(String ShortDescription) {

		this.ShortDescription = ShortDescription;
	}

	public int getprice() {

		return price;
	}

	public void setprice(int price) {

		this.price = price;
	}

	public String getBrand() {

		return Brand;
	}

	public void setBrand(String Brand) {

		this.Brand = Brand;
	}

	@Override
	public String toString() {

		return " Items [Itemid=" + itemId + ", ShortDescription=" + ShortDescription + ", price=" + price + ", Brand="
				+ Brand + "]";
	}
}
