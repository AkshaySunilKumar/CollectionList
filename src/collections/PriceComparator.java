package collections;

import java.util.Comparator;

class PriceComparator implements Comparator<Items> {

	@Override
	public int compare(Items I1, Items I2) {
		return (int) (I2.getprice() - I1.getprice());
	}

}
