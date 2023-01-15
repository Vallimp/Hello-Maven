package restaurant;

import java.util.Scanner;

public class OrderingFood {
	
	float Gst, ParcelCharge, Discount, TotalBill,NetBill;
	
	Scanner input = new Scanner(System.in);		
		
		public int SelectDineInOrTakeAway() {
			System.out.println("Hello! Welcome to Numpy Ninja restaurant!  ");
			System.out.println("Please select the service offering from below list :");
			System.out.println("[1] Dine-in");
			System.out.println("[2] Take away");
			System.out.println("Please enter the option - ");
			int DineIn = input.nextInt();
			return DineIn;
		}
		
		public void MenuHeader() {
			System.out.print("Below are the dishes currently available to order :");
		}

		public int SelectMenu() {
			System.out.println("Please select the category from the below list : ");
			System.out.println("[1] vegetarian");
			System.out.println("[2] Non-vegetarian");
			System.out.println("Please enter the option - ");
			return input.nextInt();
		}
		public int VegorNonveg(int VegOrNonvegselection) {
			
			VegOrNonvegselection=0;
			if(VegOrNonvegselection == 1) {

				DisplayVegCategory();
			}
			else
				DisplayNonVegCategory();
			return VegOrNonvegselection;
		}
		
		public int Itemselection()
		{
			int Dishchoice = 0;
			System.out.println("Enter the dish you wish to order: ");
			Dishchoice = input.nextInt();
			
			return Dishchoice;
		}
		
		public int DisplayVegCategory() {
			
			System.out.println("Below are the Veg dishes available currently to order :");
			System.out.println("1. Paneer tikka - Rs. 120.00 (per item)");
			System.out.println("2. Cashew pulao - Rs. 150.00 (per item)");
			System.out.println("3. Veg fried rice - Rs. 130.00 (per item)");
			System.out.println("4. Gobi 65 - Rs. 100.00 (per item)");
			System.out.println("5. Veg. thali - Rs. 140.00 (per item)");
			System.out.println("Please enter the option - ");
			int Vegoptions = input.nextInt();
			return Vegoptions;
		}

		public int DisplayNonVegCategory() {
			
			System.out.println("Below are the Non veg dishes available currently to order :");
			System.out.println("1. Chicken briyani - Rs. 200.00 (per item)");
			System.out.println("2. Fish curry - Rs. 150.00 (per item)");
			System.out.println("3. Chicken 65 - Rs. 120.00 (per item)");
			System.out.println("4. Mutton gravy - Rs. 220.00 (per item)");
			System.out.println("5. Chicken fried rice - Rs. 180.00 (per item)");
			System.out.println("Please enter the option - ");
			int Nonvegoptions = input.nextInt();
			return Nonvegoptions;
		}
		
		public String MenuSelection(int CategorySelection, int Dishchoice)
		{
			String ItemName = null;
			
			switch(CategorySelection)
			{
			case 1:	
				switch(Dishchoice)
				{
					case 1:
						ItemName = "Paneer Tikka";
						break;
					case 2:
						ItemName = "Cashew Pulao";
						break;
					case 3:
						ItemName = "Veg Fried Rice";
						break;
					case 4:
						ItemName = "Gobi 65";
						break;
					case 5:
						ItemName = "Veg Thali";
						break;
				}
				break;
			case 2: 
				switch(Dishchoice)
				{
					case 1:
						ItemName = "Chicken Biriyani";
						break;
					case 2:
						ItemName = "Fish Curry";
						break;
					case 3:
						ItemName = "Chicken 65";
						break;
					case 4:
						ItemName = "Mutton gravy";
						break;
					case 5:
						ItemName = "Chicken Fried Rice";
						break;
				}
				break;
			}		
			return ItemName;
		}
		
		public int ItemQuantity(String ItemName) {
			int Itemquantity = 0;
			
			System.out.print("Please enter number of " + "'ItemName'" + " you would like to order - ");
			Itemquantity = input.nextInt();
			
			return Itemquantity;
		}
		
		public String NumberOfItems()
		{
			String Numofitems;
			System.out.println("Would you like to order one more dish? [Y] or [N] - ");
			
			Numofitems = input.next();
			
			return Numofitems;
		}
		
		public String CategoryChange()
		{
			String Changecategory;
			System.out.println("Would you like to order from other category? [Y] or [N] - ");
			
			Changecategory =input.next();
			
			return Changecategory;
		}		
		
		public int ItemCost(int Dishselection, int Dishcode)
		{
			int Itemcost=0;
			
			switch(Dishselection)
			{
			case 1:
				if(Dishcode==1)
					Itemcost = 120;
				else if(Dishcode==2)	
					Itemcost = 150;
				else if(Dishcode==3)
					Itemcost = 130;
				else if(Dishcode==4)
					Itemcost = 100;
				else if(Dishcode==5)
					Itemcost = 140;
				break;
				
			case 2:
				if(Dishcode==1)
					Itemcost = 200;
				else if(Dishcode==2)	
					Itemcost = 150;
				else if(Dishcode==3)
					Itemcost = 120;
				else if(Dishcode==4)
					Itemcost = 220;
				else if(Dishcode==5)	
					Itemcost = 180;
				break;
			}
			return Itemcost;
		}
		
		static
		{
			int ChickenBiriyani = 200;
			int FishCurry = 150;
			int Chicken65 = 120;
			int MuttonGravy = 220;
			int ChickenFriedRice = 180;
			int PaneerTikka = 120;
			int CashewPulao = 150;
			int VegFriedRice = 130;
			int Gobi65 = 100;
			int VegThali = 140;
		}
		
		
	/*	public double ItemsOrdered(int category, int subCategory) {
			double itemTotal = 0;
			int quantity = 0;
			int Totalquantity =0;
			
			if(category == 1) {
				switch(subCategory) {
					case 1: 
						System.out.println("Please enter number of Paneer tikka dishes you would like to order - ");
						quantity = input.nextInt();
						itemTotal = 120*quantity; 
						break;
					case 2:
						System.out.println("Please enter number of Cashew pulao dishes you would like to order - ");
						quantity = input.nextInt();
						itemTotal = 150*quantity; 
						break;
					case 3:
						System.out.println("Please enter number of Veg fried rice dishes you would like to order - ");
						quantity = input.nextInt();
						itemTotal = 130*quantity; 
						break;
					case 4:
						System.out.println("Please enter number of Gobi 65 dishes you would like to order - ");
						quantity = input.nextInt();
						itemTotal = 100*quantity; 
						break;
					case 5:
						System.out.println("Please enter number of \"Veg. thali\" you would like to order - ");
						quantity = input.nextInt();
						itemTotal = 140*quantity; 
						break;
					default:
						System.out.println("Invalid SubCategory");
				}
			}else if(category ==2) {
				switch(subCategory) {
				case 1: 
					System.out.println("Please enter number of Chicken briyani dishes you would like to order - ");
					quantity = input.nextInt();
					itemTotal = 200*quantity; 
					break;
				case 2:
					System.out.println("Please enter number of Fish curry dishes you would like to order - ");
					quantity = input.nextInt();
					itemTotal = 150*quantity; 
					break;
				case 3:
					System.out.println("Please enter number of Chicken 65 dishes you would like to order - ");
					quantity = input.nextInt();
					itemTotal = 120*quantity; 
					break;
				case 4:
					System.out.println("Please enter number of Mutton gravy dishe you would like to order - ");
					quantity = input.nextInt();
					itemTotal = 220*quantity; 
					break;
				case 5:
					System.out.println("Please enter number of Chicken fried rice dishes you would like to order - ");
					quantity = input.nextInt();
					itemTotal = 180*quantity; 
					break;
				default:
					System.out.println("Invalid SubCategory");
				
				}
			}
		
			Totalquantity+= 1;
			return itemTotal;
		}
*/
		
	public static void main(String[] args) {
	
	int DineIn = 0;
	int VegOrNonvegselection;
	int Dishchoice;
	int Menuquantity;
	int Counter = 0;
	
	float ServiceCost = 0;
	float ItemCost=0;
	float TotalCost = 0;
	float GSTcharges = 0;
	float Totalcostplustaxes = 0;
	float Discount = 0;
	
	String MenuName;
	String RepeatOrder;
	String MenuChange;
	
	String[] ItemName = new String[10];
	float[] ItemPrice = new float[10];
	float[] Itemquantity = new float[10];
		
	Scanner input1 = new Scanner(System.in);
	OrderingFood obj = new OrderingFood();
	
	System.out.println();
	
	DineIn = obj.SelectDineInOrTakeAway();
	
	VegOrNonvegselection = obj.VegorNonveg(VegOrNonvegselection);
	
	if(DineIn==1)
		ServiceCost = 30.0f;
	else
		ServiceCost = 10.0f;
	
	obj.MenuHeader();				
	obj.VegorNonveg(VegOrNonvegselection);
	
	Dishchoice = obj.Itemselection();		
	MenuName = obj.MenuSelection(VegOrNonvegselection, Dishchoice);
	
	ItemName[Counter] = MenuName;
	
	Menuquantity= obj.ItemQuantity(ItemName);
	
	Itemquantity = obj.ItemQuantity(ItemName);
	
	ItemCost = obj.ItemCost(VegOrNonvegselection, Dishchoice);
	
	ItemPrice[Counter] = ItemCost;		
	Itemquantity[Counter] = Menuquantity;
	
	Counter++;
	
	TotalCost = TotalCost + (ItemCost*Menuquantity);
	
	while(RepeatOrder.equalsIgnoreCase("Y"))
	{			
		obj.MenuHeader();
		obj.VegorNonveg(VegOrNonvegselection);
		
		Dishchoice = obj.Itemselection();	
		MenuName = obj.MenuSelection(VegOrNonvegselection, Dishchoice);
		ItemName[Counter] = MenuName;
		
		Menuquantity = obj.ItemQuantity(ItemName);
		RepeatOrder = obj.NumberOfItems();
		
		ItemCost = obj.ItemCost(VegOrNonvegselection, Dishchoice);
		ItemPrice[Counter] = ItemCost;		
		Itemquantity[Counter] = Menuquantity;
		
		TotalCost = TotalCost + (ItemCost*Menuquantity);
		Counter++;
	}
	
	while(RepeatOrder.equalsIgnoreCase("N"))
	{
		MenuChange = obj.CategoryChange();
		
		while(MenuChange.equalsIgnoreCase("Y") || RepeatOrder.equalsIgnoreCase("Y"))
		{				
			if(VegOrNonvegselection==1)
				VegOrNonvegselection = 2;
			else if(VegOrNonvegselection==2)
				VegOrNonvegselection=1;
			
			obj.MenuHeader();
			obj.VegorNonveg(VegOrNonvegselection);
			
			Dishchoice = obj.Itemselection();	
			MenuName = obj.MenuSelection(VegOrNonvegselection, Dishchoice);
			ItemName[Counter] = MenuName;
			
			Menuquantity = obj.ItemQuantity(ItemName);
			RepeatOrder = obj.NumberOfItems();
			
			ItemCost = obj.ItemCost(VegOrNonvegselection, Dishchoice);
			
			ItemPrice[Counter] = ItemCost;		
			Itemquantity[Counter] = Menuquantity;
			Counter++;
			
			TotalCost = TotalCost + (ItemCost*Menuquantity);
			
			if(VegOrNonvegselection==1)
				VegOrNonvegselection = 2;
			else if(VegOrNonvegselection==2)
				VegOrNonvegselection=1;
			
			VegOrNonvegselection = "N";
			
			if(MenuChange.equalsIgnoreCase("N") && RepeatOrder.equalsIgnoreCase("N"))
			{
				break;
			}
		}
		break;
	}	
	}
}
	
for(int i = 0; i < Counter; i++)
{
	System.out.println((i+1) + "\t | " +  ItemName[i] + " \t\t | " + ItemPrice[i] + " \t | " + Itemquantity[i] + " | ");
}

GSTCharge =  (TotalCost*6/100);
Totalcostplustaxes = TotalCost + GSTCharge + ServiceCost;

System.out.println("Total Cost : " + TotalCost +" + ");
System.out.println("GST Tax : " + GSTCharge);
System.out.println("Parcel / Dine-in charge : " + ServiceCost);
System.out.println("Total Order Amount : " + Totalcostplustaxes);

if(TotalCost>1000)
{
	Discount = TotalCost*10/100;
	System.out.println("Discount : " + Discount);
}
else if(TotalCost>1500)
{
	Discount = TotalCost*15/100;
	System.out.println("Discount : " + Discount);
}
else
{
	Discount = 0;
	System.out.println("Discount : 0.00");
}
System.out.println("Net Order Amount: " + (Totalcostplustaxes-DiscounCharge));

System.out.println("\t\t ##### Thank you for ordering... Visit us again !! #####");{
}
}
}

/*	boolean Category = true;
	boolean Vegoption = false;
	boolean NonVegoption = false;
	boolean OtherCategory = false;

	DineIn = obj.SelectDineInOrTakeAway();
	
	double itemTotals = 0;
	int VegCat, NonVegCat;
	int category = obj.SelectMenu();
	while(Category) {		
		if(category == 1) { Vegoption = true;
			while(Vegoption) {
				VegCat = obj.DisplayVegCategory();
				itemTotals+= obj.ItemsOrdered(1, VegCat);
				
				System.out.println("Would you like to order one more dish ? [Y] or [N] - ");
				Vegoption = (input1.next().equalsIgnoreCase("Y"))? true: false;
			}
		}else if(category ==2) { NonVegoption = true;
			while(NonVegoption) { 
				int subCategory;
				NonVegCat = obj.ItemsOrdered(int category, int subCategory);
				itemTotals+= obj.ItemsOrdered(2, NonVegCat);
				
				System.out.println("Would you like to order one more dish ? [Y] or [N] - ");
				NonVegoption = (input1.next().equalsIgnoreCase("Y"))? true: false;
			}
		}
		
		System.out.println("Would you like to order from other category ? [Y] or [N] - ");
		OtherCategory = input1.next().equalsIgnoreCase("Y");
		if(OtherCategory && category == 1) {
			category = 2;
		}else if(OtherCategory && category ==2) {
			category = 1;
		}
		if(!OtherCategory) {
			Category = false;
		}
	}
	
	}
}*/