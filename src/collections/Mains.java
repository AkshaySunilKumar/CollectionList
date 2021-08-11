package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mains {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		List<Items> Materials = new ArrayList<Items>();

		var s1 = new Items(119, "Shirt-s", 1232, "Levis");
		var s2 = new Items(134, "tshirt-l", 999, "Taylor");
		var s3 = new Items(156, "churidar", 4200, "PanAmerica");
		var s4 = new Items(150, "Shirt-xxl", 3299, "RE");
		var s5 = new Items(222, "Pants", 2999, "L-P");
		var s6 = new Items(034, "Pyjama", 1899, "Trident");
		var s7 = new Items(101, "Salwaar", 1400, "Otto");
		var s8 = new Items(468, "Dhothi", 450, "MCR");
		var s9 = new Items(567, "Lungi", 299, "Kitex");
		var s10 = new Items(326, "Saree", 8000, "Banaras");

		Materials.add(s1);
		Materials.add(s2);
		Materials.add(s3);
		Materials.add(s4);
		Materials.add(s5);
		Materials.add(s6);
		Materials.add(s7);
		Materials.add(s8);
		Materials.add(s9);
		Materials.add(s10);

		var Item = List.of(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);

		var result = new ArrayList<Items>();

		System.out.println(" Items by brands that starts with 'T' ::");
		System.out.println();

		for (Items collection : Item) {

			if (collection.getBrand().startsWith("T")) {

				result.add(collection);
			}
		}

		System.out.println(result);
		System.out.println();
		System.out.println("List of Items by Highest price ::");
		System.out.println();

		Collections.sort(Materials, new PriceComparator());

		System.out.println(Materials);

	}
}
