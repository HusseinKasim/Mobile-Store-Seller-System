import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Item {
	
	String name;
	int price;
	int type; //1 = phone, 2 = accessory 
	String company;
	
	
	
	public Item(String name,int price,int type,String company)
	{
		this.name = name;
		this.price = price;
		this.type = type;
		this.company = company;
	}
	
	
	
	
	
    //Items
	
	       //Phones
	       static  Item note_8 = new Item("Note 8", 550, 1, "Samsung");
	       static  Item note_10 = new Item("Note 10", 720, 1, "Samsung");
	       static  Item Y7_prime_2019 = new Item("Y7 Prime 2019", 119, 1, "Huawei");
	       static  Item Y9_prime_2019 = new Item("Y9 Prime 2019", 185, 1, "Huawei");
	       static  Item iphone8 = new Item("iPhone 8", 490, 1, "Apple");
	       static  Item iphonex = new Item("iPhone X", 550, 1, "Apple");
	       
	       
	       
	       
	       //Accessories
	       static  Item black_case_apple = new Item("Black Apple Case", 4, 2, "Apple");
		   static  Item black_case_huawei = new Item("Black Huawei Case", 4, 2, "Huawei");
		   static  Item black_case_samsung = new Item("Black Samsung Case", 4, 2, "Samsung");
		   static  Item type_c_charger = new Item("Type C Charger", 7, 2, "Samsung");
		   static  Item lightning_charger = new Item("Lightning Charger", 7, 2, "Apple");
		   static  Item usb_charger = new Item("USB Charger", 7, 2, "Huawei");
	       
	       
	       
	       
	       
	       
		   public static void buyNote8() {
							if(note_8.price <= GUI.balance && !Cart.cartList.contains(note_8))
							{	
						   Store.store_list.remove(Item.note_8);
						   GUI.finalPrice += Item.note_8.price;
						   GUI.finalPriceLabel.setText("Your total is " + GUI.finalPrice+ "JD");
						   Cart.addToCart(note_8);
						   GUI.phone1.setText("Added To Cart!");
							}
		   }
	       
		   
	       
			   public static void buyNote10() {
								if(note_10.price <= GUI.balance && !Cart.cartList.contains(note_10))
								{	
							   Store.store_list.remove(Item.note_10);
							   GUI.finalPrice += Item.note_10.price;
							   GUI.finalPriceLabel.setText("Your total is " + GUI.finalPrice+ "JD");
							   Cart.addToCart(note_10);
							   GUI.phone2.setText("Added To Cart!");
								}
			   }
	
			   
		       
			   public static void buyY7() {
								if(Y7_prime_2019.price <= GUI.balance && !Cart.cartList.contains(Y7_prime_2019))
								{	
							   Store.store_list.remove(Item.Y7_prime_2019);
							   GUI.finalPrice += Item.Y7_prime_2019.price;
							   GUI.finalPriceLabel.setText("Your total is " + GUI.finalPrice+ "JD");
							   Cart.addToCart(Y7_prime_2019);
							   GUI.phone3.setText("Added To Cart!");
								}
			   }
			   
			   public static void buyY9() {
								if(GUI.balance >= Item.Y9_prime_2019.price && !Cart.cartList.contains(Y9_prime_2019))
								{	
							   Store.store_list.remove(Item.Y9_prime_2019);
							   GUI.finalPrice += Item.Y9_prime_2019.price;
							   GUI.finalPriceLabel.setText("Your total is " + GUI.finalPrice+ "JD");
							   Cart.addToCart(Y9_prime_2019);
							   GUI.phone4.setText("Added To Cart!");
								 }
					
			   }
	       
			   
	       
			   public static void buyiPhone8() {
								if(iphone8.price <= GUI.balance &&!Cart.cartList.contains(iphone8))
								{	
							   Store.store_list.remove(Item.iphone8);
							   Cart.addToCart(iphone8);
							   GUI.finalPrice += Item.iphone8.price;
							   GUI.finalPriceLabel.setText("Your total is " + GUI.finalPrice+ "JD");
							   GUI.phone5.setText("Added To Cart!");
								 }
						
			   }
			   
			   public static void buyiPhoneX() {
								if(iphonex.price <= GUI.balance && !Cart.cartList.contains(iphonex))
								{	
							   Store.store_list.remove(Item.iphonex);
							   GUI.finalPrice += Item.iphonex.price;
							   GUI.finalPriceLabel.setText("Your total is " + GUI.finalPrice+ "JD");
							   Cart.addToCart(iphonex);
							   GUI.phone6.setText("Added To Cart!");
								 }
							}
	       
	       
			   public static void buyAppleCase() {

								if(GUI.balance >= Item.black_case_apple.price && !Cart.cartList.contains(black_case_apple))
								{	
							   Store.store_list.remove(Item.black_case_apple);
							   GUI.finalPrice += Item.black_case_apple.price;
							   GUI.finalPriceLabel.setText("Your total is " + GUI.finalPrice+ "JD");
							   Cart.addToCart(black_case_apple);
							   GUI.access1.setText("Added To Cart!");
								 }
							
			   }
			   
			   public static void buySamsungCase() {

								if(GUI.balance >= Item.black_case_samsung.price && !Cart.cartList.contains(black_case_samsung))
								{	
							   Store.store_list.remove(Item.black_case_samsung);
							   Cart.addToCart(black_case_samsung);
							   GUI.finalPrice += Item.black_case_samsung.price;
							   GUI.finalPriceLabel.setText("Your total is " + GUI.finalPrice+ "JD");
							   GUI.access2.setText("Added To Cart!");
								 }
							
			   }
	       
			   public static void buyHuaweiCase() {
								if(GUI.balance >= Item.black_case_huawei.price && !Cart.cartList.contains(black_case_huawei))
								{	
							   Store.store_list.remove(Item.black_case_huawei);
							   GUI.finalPrice += Item.black_case_huawei.price;
							   GUI.finalPriceLabel.setText("Your total is " + GUI.finalPrice+ "JD");
							   Cart.addToCart(black_case_huawei);
							   GUI.access3.setText("Added To Cart!");
								 }
							
			   }
			   
			   public static void buyTypeCCharger() {
					if(GUI.balance >= Item.type_c_charger.price && !Cart.cartList.contains(type_c_charger))
					{	
				   Store.store_list.remove(Item.type_c_charger);
				   Cart.addToCart(type_c_charger);
				   GUI.finalPrice += Item.type_c_charger.price;
				   GUI.finalPriceLabel.setText("Your total is " + GUI.finalPrice+ "JD");	   
				   GUI.access4.setText("Added To Cart!");
					 }
				
  }
			   
			   public static void buyLightningCharger() {
					if(GUI.balance >= Item.lightning_charger.price && !Cart.cartList.contains(lightning_charger))
					{	
				   Store.store_list.remove(Item.lightning_charger);
				   GUI.finalPrice += Item.lightning_charger.price;
				   GUI.finalPriceLabel.setText("Your total is " + GUI.finalPrice + "JD");
				   Cart.addToCart(lightning_charger);
				   GUI.access5.setText("Added To Cart!");
					 }
				
  }
			   
			   public static void buyUSBCharger() {
					if(GUI.balance >= Item.usb_charger.price && !Cart.cartList.contains(usb_charger))
					{	
				   Store.store_list.remove(Item.usb_charger);
				   GUI.finalPrice += Item.usb_charger.price;
				   GUI.finalPriceLabel.setText("Your total is " + GUI.finalPrice+ "JD");
				   Cart.addToCart(usb_charger);
				   GUI.access6.setText("Added To Cart!");
					 }
				
  }
	       
	       
	       
	   
}
