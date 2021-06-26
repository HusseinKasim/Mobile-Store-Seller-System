import java.util.ArrayList;

public class Store {
	
double yourBalance;
	
	static ArrayList<Item> store_list = new ArrayList<Item>();
	
	public void addToStore()
	{
	
	store_list.add(Item.note_8);
	store_list.add(Item.note_10);
	store_list.add(Item.Y7_prime_2019);
	store_list.add(Item.Y9_prime_2019);
	store_list.add(Item.iphone8);
	store_list.add(Item.iphonex);
	store_list.add(Item.black_case_apple);
	store_list.add(Item.black_case_samsung);
	store_list.add(Item.black_case_huawei);
	store_list.add(Item.type_c_charger);
	store_list.add(Item.lightning_charger);
	store_list.add(Item.usb_charger);
	}
	
}
