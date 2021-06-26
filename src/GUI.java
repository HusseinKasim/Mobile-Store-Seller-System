
	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	
public class GUI implements ActionListener {

   static int count = 1;
   static int balance = 0;
   static int finalPrice = 0;
	static int loginCount = 0;
	static int fixedBalance = balance;
   
	static JFrame frame = new JFrame("Mobile Store Seller System");
	static JPanel panel = new JPanel();
	static JPanel panel1 = new JPanel();
	static JPanel exitPanel = new JPanel();
	static JLabel name = new JLabel("Mobile Store Seller System");
	static JButton loginButton = new JButton("Login");
	static JTextField username = new JTextField("");
	static JPasswordField password = new JPasswordField("");
	static JLabel usernameLabel = new JLabel("Username:");
	static JLabel passwordLabel = new JLabel("Password:");
	static JButton registerButton = new JButton("Register");
	static JLabel loginCountLabel = new JLabel();
	
	
	
	static JFrame registerFrame = new JFrame();
	static JPanel registerPanel = new JPanel();
	static JPanel registerPanel1 = new JPanel();
	static JLabel usernameRegisterLabel = new JLabel("Username: *");
	static JLabel passwordRegisterLabel = new JLabel("Password: *");
	static JTextField usernameRegister = new JTextField(" ");
	static JPasswordField passwordRegister = new JPasswordField("");
	static JLabel confirmPasswordRegisterLabel = new JLabel("Confirm Password: *");
	static JPasswordField confirmPasswordRegister = new JPasswordField("");
	static JLabel addFundsRegisterLabel = new JLabel("Add Funds:");
	static JTextField addFundsRegister = new JTextField("");
	static JButton backButton = new JButton("Back");
	static JButton confirmRegisterButton = new JButton("Register");
	static JLabel RegistrationLabel = new JLabel("Registration");
	static JPanel exitRegisterPanel = new JPanel();
	static String username1;
	String password1;
	
	
	
	static JFrame mainStoreFrame = new JFrame("Mobile Store Seller System");
	static JPanel mainStorePanel = new JPanel();
	static JPanel mainStorePanel1 = new JPanel();
	static JPanel mainStoreExitPanel = new JPanel();
	static JButton phonesButton = new JButton("Phones");
	static JButton accessoriesButton = new JButton("Accessories");
	static JButton cartButton = new JButton("Cart");
	static JButton addFundsButton= new JButton("Add Funds");
	
	
	static JLabel phoneBalanceLabel = new JLabel();
	static JFrame phonesFrame = new JFrame();
	static JPanel phonesPanel = new JPanel();
	static JPanel phonesPanel1 = new JPanel();
	static JButton phonesBackButton = new JButton("Back");
	static JPanel exitPhonesPanel = new JPanel();
	static JButton buyPhone1 = new JButton("Add To Cart");
	static JButton buyPhone2 = new JButton("Add To Cart");
	static JButton buyPhone3 = new JButton("Add To Cart");
	static JButton buyPhone4 = new JButton("Add To Cart");
	static JButton buyPhone5 = new JButton("Add To Cart");
	static JButton buyPhone6 = new JButton("Add To Cart");
	static JLabel phone1 = new JLabel("Samsung Note 8 (Price: 550 JD)");
	static JLabel phone2 = new JLabel("Samsung Note 10 (Price: 720 JD)");
	static JLabel phone3 = new JLabel("Huawei Y7 Prime 2019(Price: 119 JD)");
	static JLabel phone4 = new JLabel("Huawei Y9 Prime 2019(Price: 185 JD)");
	static JLabel phone5 = new JLabel("Apple iPhone 8(Price: 490 JD)");
	static JLabel phone6 = new JLabel("Apple iPhone X(Price: 550 JD)");
	
	
	static JLabel accessBalanceLabel = new JLabel();
	static JFrame accessFrame = new JFrame();
	static JPanel accessPanel = new JPanel();
	static JPanel accessPanel1 = new JPanel();
	static JButton accessBackButton = new JButton("Back");
	static JPanel exitAccessPanel = new JPanel();
	static JButton buyAccess1 = new JButton("Add To Cart");
	static JButton buyAccess2 = new JButton("Add To Cart");
	static JButton buyAccess3 = new JButton("Add To Cart");
	static JButton buyAccess4 = new JButton("Add To Cart");
	static JButton buyAccess5 = new JButton("Add To Cart");
	static JButton buyAccess6 = new JButton("Add To Cart");
	static JLabel access1 = new JLabel("Black Apple Case (Price: 4 JD)");
	static JLabel access2 = new JLabel("Black Samsung Case (Price: 4 JD)");
	static JLabel access3 = new JLabel("Black Huawei Case (Price: 4 JD)");
	static JLabel access4 = new JLabel("Type-C Charger(Price: 7 JD)");
	static JLabel access5 = new JLabel("Lightning Charger(Price: 7 JD)");
	static JLabel access6 = new JLabel("USB Charger(Price: 7 JD)");
	
	
	
	static JFrame cartFrame = new JFrame();
	static JPanel cartPanel = new JPanel();
	static JPanel cartPanel1 = new JPanel();
	static JButton cartBackButton = new JButton("Back");
	static JPanel exitCartPanel = new JPanel();
	static JLabel cartItem1 = new JLabel();
	static JLabel cartItem2 = new JLabel();
	static JLabel cartItem3 = new JLabel();
	static JLabel cartItem4 = new JLabel();
	static JLabel cartItem5 = new JLabel();
	static JLabel cartItem6 = new JLabel();
	static JLabel cartItem7 = new JLabel();
	static JLabel cartItem8 = new JLabel();
	static JLabel cartItem9 = new JLabel();
	static JLabel cartItem10 = new JLabel();
	static JLabel cartItem11 = new JLabel();
	static JLabel cartItem12 = new JLabel();
	static JLabel finalPriceLabel = new JLabel();
	static JButton checkoutButton = new JButton("Checkout");
	static JButton clearCart = new JButton("Clear Cart");
	
	
	static JFrame fundsFrame = new JFrame();
	static JPanel fundsPanel = new JPanel();
	static JPanel fundsPanel1 = new JPanel();
	static JButton fundsBackButton = new JButton("Back");
	static JTextField fundsText = new JTextField("");
	static JLabel fundsLabel = new JLabel("Please Enter the Amount To Be Added:");
	static JPanel fundsExitPanel = new JPanel();
	static JLabel fundsWarningLabel = new JLabel("WARNING: You can only add funds once.");
	static JLabel fundsBalanceLabel = new JLabel();
	static int addFundsCount=0;
	public GUI() {
		
		mainScreen();
	}
	
	
	private static void mainScreen() {
		
			frame.setLocation(150, 70); 
			frame.setSize(1000, 600);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(panel);
			frame.add(panel1);
			frame.add(exitPanel);
			frame.setUndecorated(true);
			registerFrame.setUndecorated(true);
			mainStoreFrame.setUndecorated(true);
			phonesFrame.setUndecorated(true);
			accessFrame.setUndecorated(true);
			cartFrame.setUndecorated(true);
			fundsFrame.setUndecorated(true);
			frame.setLayout(null);
			panel.setLayout(null);
			
			
			
			panel.setForeground(Color.WHITE);
			panel.setBackground(new Color(0, 102, 255));
			panel.setBounds(0, 0, 950, 35);
			
			
			exitPanel.setForeground(Color.WHITE);
			exitPanel.setBackground(Color.RED);
			exitPanel.setBounds(950, 0, 50, 35);
			exitPanel.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					if(e.getSource()==exitPanel)
					{
						System.exit(0);
					}
				}
				});
			
			panel1.add(name);
			name.setBounds(260, 70, 600, 60);
			name.setForeground(Color.WHITE);
			name.setFont(new Font("Arial Black", Font.BOLD, 30));
			
			
			panel1.setLayout(null);
			panel1.setBackground(Color.DARK_GRAY);
			panel1.setBounds(0, 35, 1000, 600);
			frame.setVisible(true);
			
			panel1.add(loginCountLabel);
			loginCountLabel.setBounds(100, 100, 100, 100);
	    	loginCountLabel.setForeground(Color.WHITE);
			
			panel1.add(loginButton);
			loginButton.setForeground(Color.WHITE);
			loginButton.setBackground(new Color(0, 102, 255));
			loginButton.setBounds(310, 430, 180, 60);
			loginButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==loginButton)
					{
						if(username.getText().equals(usernameRegister.getText()) && password.getText().equals(passwordRegister.getText()))
						{
							mainStoreScreen();
							frame.setVisible(false);	
					}
						else
						{
							loginCount++;
						}
						if(loginCount == 3)
						{
							JOptionPane.showMessageDialog(frame,"You have failed to login 3 times. You have been timed out for 10 seconds.");
					    long seconds = 1;
					    for(int i=1; i<11; i++)
					    {	
					    	
									try {
										Thread.sleep(1000);
										System.out.println(String.valueOf(seconds));
										} catch (InterruptedException e1) {
										e1.printStackTrace();
									}
									seconds++;
						}
						loginCount++;
						}
					
					}
				}
				});
			
		
			
			
			panel1.add(username);
			username.setForeground(Color.WHITE);
			username.setBackground(new Color(0, 102, 255));
			username.setBounds(530, 200, 180, 40);
			
			panel1.add(usernameLabel);
			usernameLabel.setForeground(Color.WHITE);
			usernameLabel.setBackground(new Color(0, 102, 255));
			usernameLabel.setBounds(350, 200, 180, 40);
			
			panel1.add(password);
			password.setForeground(Color.WHITE);
			password.setBackground(new Color(0, 102, 255));
			password.setBounds(530, 300, 180, 40);
			
			panel1.add(passwordLabel);
			passwordLabel.setForeground(Color.WHITE);
			passwordLabel.setBackground(new Color(0, 102, 255));
			passwordLabel.setBounds(350, 300, 180, 40);
			
			panel1.add(registerButton);
			registerButton.setForeground(Color.WHITE);
			registerButton.setBackground(new Color(0, 102, 255));
			registerButton.setBounds(510, 430, 180, 60);
			registerButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==registerButton)
					{
					   registerScreen();
					   registerFrame.setVisible(true);
					   frame.setVisible(false);
					}
				}
				});
		
	}
	
	
	
	private static void registerScreen() {
	
		registerFrame.setLocation(150, 70); 
		registerFrame.setSize(1000, 600);
		registerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		registerFrame.add(registerPanel);
		 registerFrame.add(registerPanel1);
	
		registerPanel.setForeground(Color.WHITE);
		registerPanel.setBackground(new Color(0, 102, 255));
		registerPanel.setBounds(0, 0, 1000, 35);
		
		registerPanel1.setLayout(null);
		registerPanel1.setBackground(Color.DARK_GRAY);
		registerPanel1.setBounds(0, 35, 1000, 600);
		
		registerPanel1.add(backButton);
		backButton.setForeground(Color.WHITE);
		backButton.setBackground(new Color(0, 102, 255));
		backButton.setBounds(350, 530, 150, 50);
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{	
			registerFrame.setVisible(false);
			frame.setVisible(true);
				
			}
		});
		
		
		registerPanel1.add(confirmPasswordRegisterLabel);
		confirmPasswordRegisterLabel.setForeground(Color.WHITE);
		confirmPasswordRegisterLabel.setBackground(new Color(0, 102, 255));
		confirmPasswordRegisterLabel.setBounds(350, 350, 150, 50);
		
		
		registerPanel1.add(confirmRegisterButton);
		confirmRegisterButton.setForeground(Color.WHITE);
		confirmRegisterButton.setBackground(new Color(0, 102, 255));
		confirmRegisterButton.setBounds(550, 530, 150, 50);
		confirmRegisterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				if(e.getSource() == confirmRegisterButton)
				{
					
					username.setText(usernameRegister.getText());
					if(passwordRegister.getText().equals(confirmPasswordRegister.getText()))
					{
					password.setText(passwordRegister.getText());
			
			}
					
					else
						System.out.println("Password incorrect!");
				}
			}
		});
		
		registerPanel1.add(passwordRegister);
		passwordRegister.setForeground(Color.WHITE);
		passwordRegister.setBackground(new Color(0, 102, 255));
		passwordRegister.setBounds(500, 250, 150, 50);
		
		registerPanel1.add(passwordRegisterLabel);
		passwordRegisterLabel.setForeground(Color.WHITE);
		passwordRegisterLabel.setBackground(new Color(0, 102, 255));
		passwordRegisterLabel.setBounds(350, 250, 150, 50);
		
		
		registerPanel1.add(confirmPasswordRegister);
		confirmPasswordRegister.setForeground(Color.WHITE);
		confirmPasswordRegister.setBackground(new Color(0, 102, 255));
		confirmPasswordRegister.setBounds(500, 350, 150, 50);
		
		registerPanel1.add(usernameRegister);
		usernameRegister.setForeground(Color.WHITE);
		usernameRegister.setBackground(new Color(0, 102, 255));
		usernameRegister.setBounds(500, 150, 150, 50);
		
		registerPanel1.add(usernameRegisterLabel);
		usernameRegisterLabel.setForeground(Color.WHITE);
		usernameRegisterLabel.setBackground(new Color(0, 102, 255));
		usernameRegisterLabel.setBounds(350, 150, 150, 50);
	
	
		registerPanel1.add(RegistrationLabel);
		RegistrationLabel.setFont(new Font("Arial Black", Font.BOLD, 40));
		RegistrationLabel.setForeground(Color.WHITE);
		RegistrationLabel.setBounds(350, 60, 500, 50);
		
		
	}

private static void mainStoreScreen()
{
	mainStoreFrame.setLocation(150, 70); 
	mainStoreFrame.setSize(1000, 600);
	mainStoreFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	mainStoreFrame.add(mainStorePanel);
	mainStoreFrame.add(mainStorePanel1);
mainStoreFrame.add(mainStoreExitPanel);
	
	mainStorePanel.setForeground(Color.WHITE);
	mainStorePanel.setBackground(new Color(0, 102, 255));
	mainStorePanel.setBounds(0, 0, 950, 35);
	
	mainStorePanel1.setLayout(null);
	mainStorePanel1.setBackground(Color.DARK_GRAY);
	mainStorePanel1.setBounds(0, 35, 1000, 600);
	
	
	mainStorePanel1.add(cartButton);
	cartButton.setForeground(Color.WHITE);
	cartButton.setBackground(new Color(0, 102, 255));
	cartButton.setBounds(820, 70, 100, 50);
	cartButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			cartScreen();
			mainStoreFrame.setVisible(false);
			cartFrame.setVisible(true);
		
		}
	});
	
	
	
	mainStorePanel1.add(phonesButton);
	phonesButton.setForeground(Color.WHITE);
	phonesButton.setBackground(new Color(0, 102, 255));
	phonesButton.setBounds(200, 250, 200, 150);
	phonesButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			phonesScreen();
			mainStoreFrame.setVisible(false);
			phonesFrame.setVisible(true);
			
		}
	});
	
	
	mainStorePanel1.add(accessoriesButton);
	accessoriesButton.setForeground(Color.WHITE);
	accessoriesButton.setBackground(new Color(0, 102, 255));
	accessoriesButton.setBounds(600, 250, 200, 150);
	accessoriesButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			accessScreen();
			mainStoreFrame.setVisible(false);
			accessFrame.setVisible(true);
			
		}
	});
	
	
	
	mainStorePanel1.add(addFundsButton);
	addFundsButton.setForeground(Color.WHITE);
	addFundsButton.setBackground(new Color(0, 102, 255));
	addFundsButton.setBounds(50, 100, 100, 50);
	addFundsButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
				addFundsScreen();
				mainStoreFrame.setVisible(false);
				fundsFrame.setVisible(true);	
		}
	});
	

	
	mainStoreFrame.setLayout(null);
	mainStoreExitPanel.setForeground(Color.WHITE);
	mainStoreExitPanel.setBackground(Color.RED);
	mainStoreExitPanel.setBounds(950, 0, 50, 35);
	mainStoreExitPanel.addMouseListener(new MouseAdapter() {
		public void mousePressed(MouseEvent e) {
			if(e.getSource()==mainStoreExitPanel)
			{
				System.exit(0);
			}
		}
		});
	
	
	
	mainStoreFrame.setVisible(true);
}
	

private static void phonesScreen()
{
	phonesFrame.setLocation(150, 70); 
	phonesFrame.setSize(1000, 600);
	phonesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	phonesFrame.add(phonesPanel);
	phonesFrame.add(phonesPanel1);
	phonesFrame.add(exitPhonesPanel);

	
	phonesPanel.setForeground(Color.WHITE);
	phonesPanel.setBackground(new Color(0, 102, 255));
	phonesPanel.setBounds(0, 0, 950, 35);


	phonesPanel1.setLayout(null);
	phonesPanel1.setBackground(Color.DARK_GRAY);
	phonesPanel1.setBounds(0, 35, 1000, 600);
	
	
	phonesPanel1.add(phoneBalanceLabel);
	phoneBalanceLabel.setBounds(850, 30, 200, 50);
	phoneBalanceLabel.setForeground(Color.WHITE);
	phoneBalanceLabel.setText("Balance: " + balance + "JD");
	
	phonesPanel1.add(phone1);
	phone1.setBounds(150, 100, 200, 50);
	phone1.setForeground(Color.WHITE);
	phonesPanel1.add(buyPhone1);
	buyPhone1.setBounds(150, 150, 100, 50);
	buyPhone1.setBackground(new Color(0, 102, 255));
	buyPhone1.setForeground(Color.WHITE);
	buyPhone1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == buyPhone1)
			{
				Item.buyNote8();	
		}
		}
	});
	
	
	phonesPanel1.add(phone2);
	phone2.setBounds(480, 100, 200, 50);
	phone2.setForeground(Color.WHITE);
	phonesPanel1.add(buyPhone2);
	buyPhone2.setBounds(480, 150, 100, 50);
	buyPhone2.setBackground(new Color(0, 102, 255));
	buyPhone2.setForeground(Color.WHITE);
	buyPhone2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == buyPhone2)
			{
				Item.buyNote10();	
		}
		}
	});
	
	
	phonesPanel1.add(phone3);
	phone3.setBounds(770, 100, 250, 50);
	phone3.setForeground(Color.WHITE);
	phonesPanel1.add(buyPhone3);
	buyPhone3.setBounds(800, 150, 100, 50);
	buyPhone3.setBackground(new Color(0, 102, 255));
	buyPhone3.setForeground(Color.WHITE);
	buyPhone3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == buyPhone3)
			{
				Item.buyY7();	
		}
		}
	});
	
	phonesPanel1.add(phone4);
	phone4.setBounds(120, 300, 250, 50);
	phone4.setForeground(Color.WHITE);
	phonesPanel1.add(buyPhone4);
	buyPhone4.setBounds(150, 350, 100, 50);
	buyPhone4.setBackground(new Color(0, 102, 255));
	buyPhone4.setForeground(Color.WHITE);
	buyPhone4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == buyPhone4)
			{
				Item.buyY9();	
		}
		}
	});
	
	phonesPanel1.add(phone5);
	phone5.setBounds(480, 300, 200, 50);
	phone5.setForeground(Color.WHITE);
	phonesPanel1.add(buyPhone5);
	buyPhone5.setBounds(480, 350, 100, 50);
	buyPhone5.setBackground(new Color(0, 102, 255));
	buyPhone5.setForeground(Color.WHITE);
	buyPhone5.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == buyPhone5)
			{
				Item.buyiPhone8();	
		}
		}
	});
	
	phonesPanel1.add(phone6);
	phone6.setBounds(800, 300, 200, 50);
	phone6.setForeground(Color.WHITE);
	phonesPanel1.add(buyPhone6);
	buyPhone6.setBounds(800, 350, 100, 50);
	buyPhone6.setBackground(new Color(0, 102, 255));
	buyPhone6.setForeground(Color.WHITE);
	buyPhone6.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == buyPhone6)
			{
				Item.buyiPhoneX();	
		}
		}
	});
	
	
	phonesPanel1.add(phonesBackButton);
	phonesBackButton.setForeground(Color.WHITE);
	phonesBackButton.setBackground(new Color(0, 102, 255));
	phonesBackButton.setBounds(100, 480, 150, 50);
	phonesBackButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			
		phonesFrame.setVisible(false);
		mainStoreFrame.setVisible(true);
			
		}
	});
	
	
	
	phonesFrame.setLayout(null);
	
	
	exitPhonesPanel.setForeground(Color.WHITE);
	exitPhonesPanel.setBackground(Color.RED);
	exitPhonesPanel.setBounds(950, 0, 50, 35);
	exitPhonesPanel.addMouseListener(new MouseAdapter() {
		public void mousePressed(MouseEvent e) {
			if(e.getSource()==exitPhonesPanel)
			{
				System.exit(0);
			}
		}
		});
	
	phonesFrame.setVisible(true);
	}

private static void accessScreen()
{
	accessFrame.setLocation(150, 70); 
	accessFrame.setSize(1000, 600);
	accessFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	accessFrame.add(accessPanel);
	accessFrame.add(accessPanel1);
	accessFrame.add(exitAccessPanel);

	
	accessPanel.setForeground(Color.WHITE);
	accessPanel.setBackground(new Color(0, 102, 255));
	accessPanel.setBounds(0, 0, 950, 35);
	
	accessPanel1.setLayout(null);
	accessPanel1.setBackground(Color.DARK_GRAY);
	accessPanel1.setBounds(0, 35, 1000, 600);
	
	accessPanel1.add(accessBalanceLabel);
	accessBalanceLabel.setBounds(850, 30, 200, 50);
	accessBalanceLabel.setForeground(Color.WHITE);
	accessBalanceLabel.setText("Balance: " + balance + "JD");
	
	accessPanel1.add(access1);
	access1.setBounds(150, 100, 300, 50);
	access1.setForeground(Color.WHITE);
	accessPanel1.add(buyAccess1);
	buyAccess1.setBounds(150, 150, 100, 50);
	buyAccess1.setBackground(new Color(0, 102, 255));
	buyAccess1.setForeground(Color.WHITE);
	buyAccess1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == buyAccess1)
			Item.buyAppleCase();
		}
	});
	
	accessPanel1.add(access2);
	access2.setBounds(480, 100, 300, 50);
	access2.setForeground(Color.WHITE);
	accessPanel1.add(buyAccess2);
	buyAccess2.setBounds(480, 150, 100, 50);
	buyAccess2.setBackground(new Color(0, 102, 255));
	buyAccess2.setForeground(Color.WHITE);
	buyAccess2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == buyAccess2)
			Item.buySamsungCase();
		}
	});
	
	
	accessPanel1.add(access3);
	access3.setBounds(790, 100, 300, 50);
	access3.setForeground(Color.WHITE);
	accessPanel1.add(buyAccess3);
	buyAccess3.setBounds(800, 150, 100, 50);
	buyAccess3.setBackground(new Color(0, 102, 255));
	buyAccess3.setForeground(Color.WHITE);
	buyAccess3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == buyAccess3)
			Item.buyHuaweiCase();
		}
	});
	
	accessPanel1.add(access4);
	access4.setBounds(150, 300, 300, 50);
	access4.setForeground(Color.WHITE);
	accessPanel1.add(buyAccess4);
	buyAccess4.setBounds(150, 350, 100, 50);
	buyAccess4.setBackground(new Color(0, 102, 255));
	buyAccess4.setForeground(Color.WHITE);
	buyAccess4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == buyAccess4)
			Item.buyTypeCCharger();
		}
	});
	
	accessPanel1.add(access5);
	access5.setBounds(480, 300, 300, 50);
	access5.setForeground(Color.WHITE);
	accessPanel1.add(buyAccess5);
	buyAccess5.setBounds(480, 350, 100, 50);
	buyAccess5.setBackground(new Color(0, 102, 255));
	buyAccess5.setForeground(Color.WHITE);
	buyAccess5.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == buyAccess5)
			Item.buyLightningCharger();
		}
	});
	
	accessPanel1.add(access6);
	access6.setBounds(800, 300, 300, 50);
	access6.setForeground(Color.WHITE);
	accessPanel1.add(buyAccess6);
	buyAccess6.setBounds(800, 350, 100, 50);
	buyAccess6.setBackground(new Color(0, 102, 255));
	buyAccess6.setForeground(Color.WHITE);
	buyAccess6.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == buyAccess6)
			Item.buyUSBCharger();
		}
	});
	
	accessPanel1.add(accessBackButton);
	accessBackButton.setForeground(Color.WHITE);
	accessBackButton.setBackground(new Color(0, 102, 255));
	accessBackButton.setBounds(100, 480, 150, 50);
	accessBackButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			
		accessFrame.setVisible(false);
		mainStoreFrame.setVisible(true);
			
		}
	});
	
	
	
	accessFrame.setLayout(null);
	
	
	exitAccessPanel.setForeground(Color.WHITE);
	exitAccessPanel.setBackground(Color.RED);
	exitAccessPanel.setBounds(950, 0, 50, 35);
	exitAccessPanel.addMouseListener(new MouseAdapter() {
		public void mousePressed(MouseEvent e) {
			if(e.getSource()==exitAccessPanel)
			{
				System.exit(0);
			}
		}
		});
	
	accessFrame.setVisible(true);
	}

private static void cartScreen()
{
	cartFrame.setLocation(150, 70); 
	cartFrame.setSize(1000, 600);
	cartFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	cartFrame.add(cartPanel);
	cartFrame.add(cartPanel1);
	cartFrame.add(exitCartPanel);
	
	cartPanel.setForeground(Color.WHITE);
	cartPanel.setBackground(new Color(0, 102, 255));
	cartPanel.setBounds(0, 0, 950, 35);
	
	cartPanel1.setLayout(null);
	cartPanel1.setBackground(Color.DARK_GRAY);
	cartPanel1.setBounds(0, 35, 1000, 600);
	
	
	cartPanel1.add(cartItem1);
	cartItem1.setBounds(200, 100, 200, 100);
	cartItem1.setForeground(Color.WHITE);
	
	cartPanel1.add(cartItem2);
	cartItem2.setBounds(200, 200, 200, 100);
	cartItem2.setForeground(Color.WHITE);
	
	cartPanel1.add(cartItem3);
	cartItem3.setBounds(200, 300, 200, 100);
	cartItem3.setForeground(Color.WHITE);
	
	cartPanel1.add(cartItem4);
	cartItem4.setBounds(400, 100, 200, 100);
	cartItem4.setForeground(Color.WHITE);
	
	cartPanel1.add(cartItem5);
	cartItem5.setBounds(400, 200, 200, 100);
	cartItem5.setForeground(Color.WHITE);
	
	cartPanel1.add(cartItem6);
	cartItem6.setBounds(400, 300, 200, 100);
	cartItem6.setForeground(Color.WHITE);
	
	cartPanel1.add(cartItem7);
	cartItem7.setBounds(600, 100, 200, 100);
	cartItem7.setForeground(Color.WHITE);
	
	cartPanel1.add(cartItem8);
	cartItem8.setBounds(600, 200, 200, 100);
	cartItem8.setForeground(Color.WHITE);
	
	cartPanel1.add(cartItem9);
	cartItem9.setBounds(600, 300, 200, 100);
	cartItem9.setForeground(Color.WHITE);
	
	cartPanel1.add(cartItem10);
	cartItem10.setBounds(800, 100, 200, 100);
	cartItem10.setForeground(Color.WHITE);
	
	cartPanel1.add(cartItem11);
	cartItem11.setBounds(800, 200, 200, 100);
	cartItem11.setForeground(Color.WHITE);
	
	cartPanel1.add(cartItem12);
	cartItem12.setBounds(800, 300, 200, 100);
	cartItem12.setForeground(Color.WHITE);
	
	
	cartPanel1.add(cartBackButton);
	cartBackButton.setForeground(Color.WHITE);
	cartBackButton.setBackground(new Color(0, 102, 255));
	cartBackButton.setBounds(100, 480, 150, 50);
	cartBackButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			
		cartFrame.setVisible(false);
		mainStoreFrame.setVisible(true);
			
		}
	});
	
	
	cartPanel1.add(finalPriceLabel);
	finalPriceLabel.setForeground(Color.WHITE);
	finalPriceLabel.setBounds(500, 480, 150, 50);
	
	cartPanel1.add(checkoutButton);
	checkoutButton.setForeground(Color.WHITE);
	checkoutButton.setBackground(new Color(0, 102, 255));
	checkoutButton.setBounds(650, 480, 100, 50);
	checkoutButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == checkoutButton)
			{
				if(finalPrice > balance)
				{
					JOptionPane.showMessageDialog(cartFrame, "You do not have enough balance to do that!");
				}
				if(finalPrice <= balance && finalPrice > 0) {
		JOptionPane.showMessageDialog(cartFrame, "Thank you for buying," + usernameRegister.getText() + "!");
		Cart.cartList.clear();
		balance-=finalPrice;
		phone1.setText("Samsung Note 8 (Price: 550 JD)");
		phone2.setText("Samsung Note 10 (Price: 720 JD)");
		phone3.setText("Huawei Y7 Prime 2019(Price: 119 JD)");
		phone4.setText("Huawei Y9 Prime 2019(Price: 185 JD)");
		phone5.setText("Apple iPhone 8(Price: 490 JD)");
		phone6.setText("Apple iPhone X(Price: 550 JD)");
		access1.setText("Black Apple Case (Price: 4 JD)");
		access2.setText("Black Samsung Case (Price: 4 JD)");
		access3.setText("Black Huawei Case (Price: 4 JD)");
		access4.setText("Type-C Charger(Price: 7 JD)");
		access5.setText("Lightning Charger(Price: 7 JD)");
		access6.setText("USB Charger(Price: 7 JD)");
		cartItem1.setText("");
		cartItem2.setText("");
		cartItem3.setText("");
		cartItem4.setText("");
		cartItem5.setText("");
		cartItem6.setText("");
		cartItem7.setText("");
		cartItem8.setText("");
		cartItem9.setText("");
		cartItem10.setText("");
		cartItem11.setText("");
		cartItem12.setText("");
		finalPriceLabel.setText("");
		finalPrice = 0;
		count = 1;
				}
			}
		}
	});
	
	cartPanel1.add(clearCart);
	clearCart.setForeground(Color.WHITE);
	clearCart.setBackground(new Color(0, 102, 255));
	clearCart.setBounds(850, 480, 100, 50);
	clearCart.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == clearCart)
			{
		 if(Cart.cartList.isEmpty())
		 ;
		 else
		 {
		Cart.cartList.clear();
		phone1.setText("Samsung Note 8 (Price: 550 JD)");
		phone2.setText("Samsung Note 10 (Price: 720 JD)");
		phone3.setText("Huawei Y7 Prime 2019(Price: 119 JD)");
		phone4.setText("Huawei Y9 Prime 2019(Price: 185 JD)");
		phone5.setText("Apple iPhone 8(Price: 490 JD)");
		phone6.setText("Apple iPhone X(Price: 550 JD)");
		access1.setText("Black Apple Case (Price: 4 JD)");
		access2.setText("Black Samsung Case (Price: 4 JD)");
		access3.setText("Black Huawei Case (Price: 4 JD)");
		access4.setText("Type-C Charger(Price: 7 JD)");
		access5.setText("Lightning Charger(Price: 7 JD)");
		access6.setText("USB Charger(Price: 7 JD)");
		cartItem1.setText("");
		cartItem2.setText("");
		cartItem3.setText("");
		cartItem4.setText("");
		cartItem5.setText("");
		cartItem6.setText("");
		cartItem7.setText("");
		cartItem8.setText("");
		cartItem9.setText("");
		cartItem10.setText("");
		cartItem11.setText("");
		cartItem12.setText("");
		finalPriceLabel.setText("");
		finalPrice = 0;
		count = 1;
		if(Cart.cartList.contains(Item.note_8))
		{
			Cart.cartList.remove(Item.note_8);
			Store.store_list.add(Item.note_8);
		}
	if(Cart.cartList.contains(Item.note_10))
		{
			Cart.cartList.remove(Item.note_10);
			Store.store_list.add(Item.note_10);
		}
		if(Cart.cartList.contains(Item.Y7_prime_2019))
		{
				Cart.cartList.remove(Item.Y7_prime_2019);
				Store.store_list.add(Item.Y7_prime_2019);
		}
		if(Cart.cartList.contains(Item.Y9_prime_2019))
		{
				Cart.cartList.remove(Item.Y9_prime_2019);
				Store.store_list.add(Item.Y9_prime_2019);
		}
		 if(Cart.cartList.contains(Item.iphone8))
		{
				Cart.cartList.remove(Item.iphone8);
				Store.store_list.add(Item.iphone8);
		}
		 if(Cart.cartList.contains(Item.iphonex))
		{
			Cart.cartList.remove(Item.iphonex);
			Store.store_list.add(Item.iphonex);
		}
		 if(Cart.cartList.contains(Item.black_case_apple))
		{
				Cart.cartList.remove(Item.black_case_apple);
				Store.store_list.add(Item.black_case_apple);
		}
		if(Cart.cartList.contains(Item.black_case_samsung))
		{
				Cart.cartList.remove(Item.black_case_samsung);
				Store.store_list.add(Item.black_case_samsung);
		}
	 if(Cart.cartList.contains(Item.black_case_huawei))
		{
			Cart.cartList.remove(Item.black_case_huawei);
			Store.store_list.add(Item.black_case_huawei);
		}
	 if(Cart.cartList.contains(Item.type_c_charger))
		{
			Cart.cartList.remove(Item.type_c_charger);
			Store.store_list.add(Item.type_c_charger);
		}
		if(Cart.cartList.contains(Item.lightning_charger))
		{
				Cart.cartList.remove(Item.lightning_charger);
				Store.store_list.add(Item.lightning_charger);
		}
		  if(Cart.cartList.contains(Item.usb_charger))
		{
				Cart.cartList.remove(Item.usb_charger);
				Store.store_list.add(Item.usb_charger);
		}
				}
			}
		}
	});
	
	cartFrame.setLayout(null);
	
	
	exitCartPanel.setForeground(Color.WHITE);
	exitCartPanel.setBackground(Color.RED);
	exitCartPanel.setBounds(950, 0, 50, 35);
	exitCartPanel.addMouseListener(new MouseAdapter() {
		public void mousePressed(MouseEvent e) {
			if(e.getSource()==exitCartPanel)
			{
				System.exit(0);
			}
		}
		});
	
	cartFrame.setVisible(true);
	}
	
	

	private static void addFundsScreen()
	{
		fundsFrame.setLocation(150, 70); 
		fundsFrame.setSize(1000, 600);
		fundsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fundsFrame.add(fundsPanel);
		fundsFrame.add(fundsPanel1);
		
		fundsPanel.setBackground(new Color(0, 102, 255));
		fundsPanel.setBounds(0, 0, 950, 35);
		
		fundsPanel1.setLayout(null);
		fundsPanel1.setBackground(Color.DARK_GRAY);
		fundsPanel1.setBounds(0,25,300,200);
		
		
		fundsPanel1.add(fundsLabel);
		fundsLabel.setBounds(390,250,400,30);
		fundsLabel.setForeground(Color.WHITE);
		
		
		fundsPanel1.add(fundsText);
		fundsText.setBounds(420,310,150,30);
		fundsText.setForeground(Color.WHITE);
		fundsText.setBackground(new Color(0, 102, 255));
		
		
	fundsPanel1.add(fundsWarningLabel);
	fundsWarningLabel.setBounds(385,100,500,30);
	fundsWarningLabel.setForeground(Color.WHITE);
		
		fundsPanel1.add(addFundsButton);
		addFundsButton.setBounds(520,370,150,30);
		addFundsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource() == addFundsButton && addFundsCount==0)
			{
			balance = Integer.parseInt(fundsText.getText());
			addFundsCount++;
			}
			}
		});
		
		
		fundsPanel1.add(fundsExitPanel);
		fundsExitPanel.setForeground(Color.WHITE);
		fundsExitPanel.setBackground(Color.RED);
		fundsExitPanel.setBounds(950, 0, 50, 35);
		fundsExitPanel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if(e.getSource()==fundsExitPanel)
				{
					System.exit(0);
				}
			}
			});
		
		fundsPanel1.add(fundsBackButton);
		fundsBackButton.setForeground(Color.WHITE);
		fundsBackButton.setBackground(new Color(0, 102, 255));
		fundsBackButton.setBounds(320,370,150,30);
		fundsBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
			fundsFrame.setVisible(false);
			mainStoreFrame.setVisible(true);
			}
		});
		
		fundsPanel1.add(fundsBalanceLabel);
		fundsBalanceLabel.setBounds(850, 30, 200, 50);
		fundsBalanceLabel.setForeground(Color.WHITE);
		fundsBalanceLabel.setText("Balance: " + balance + "JD");
		
	}

public static void main(String[] args) {
		
		new GUI();

	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
