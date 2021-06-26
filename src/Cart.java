import java.util.ArrayList;

public class Cart {
	
	 static ArrayList<Item> cartList = new ArrayList<Item>();
	 
	 public static void addToCart(Item i)
		{
			 if(GUI.count == 1)
				{
				 cartList.add(i);
					GUI.cartItem1.setText(i.name + " ");
					GUI.count++;
				}
				else if(GUI.count == 2)
				{
					 cartList.add(i);
						GUI.cartItem2.setText(i.name + " ");
						GUI.count++;
				}
				else if(GUI.count == 3)
				{
					 cartList.add(i);
						GUI.cartItem3.setText(i.name + " ");
						GUI.count++;
				}
				else if(GUI.count == 4)
				{
					 cartList.add(i);
						GUI.cartItem4.setText(i.name + " ");
						GUI.count++;
				}
				else if(GUI.count == 5)
				{
					 cartList.add(i);
						GUI.cartItem5.setText(i.name + " ");
						GUI.count++;
				}
				else if(GUI.count == 6)
				{
					 cartList.add(i);
						GUI.cartItem6.setText(i.name + " ");
						GUI.count++;
				}
				else if(GUI.count == 7)
				{
					 cartList.add(i);
						GUI.cartItem7.setText(i.name + " ");
						GUI.count++;
				}
				else if(GUI.count == 8)
				{
					 cartList.add(i);
						GUI.cartItem8.setText(i.name + " ");
						GUI.count++;
				}
				else if(GUI.count == 9)
				{
					 cartList.add(i);
						GUI.cartItem9.setText(i.name + " ");
						GUI.count++;
				}
				else if(GUI.count == 10)
				{
					 cartList.add(i);
						GUI.cartItem10.setText(i.name + " ");
						GUI.count++;
				}
			 
				else if(GUI.count == 11)
				{
					 cartList.add(i);
						GUI.cartItem11.setText(i.name + " ");
						GUI.count++;
				}
			 
				else if(GUI.count == 12)
				{
					 cartList.add(i);
						GUI.cartItem12.setText(i.name + " ");
				}
}
}
