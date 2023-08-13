package javaPrograms;

public class MethodOverRiding {
	public static void main(String[] args) throws InterruptedException
    {
		Thread.sleep(4000);
        FurniturePurchase.Navigate();
        FurniturePurchase.ProdSearch("Furniture");
        FurniturePurchase.ProductSelect("Dressing Table");  

    }
	}

 class MobilePurchase extends TestMain
	{
	    public static void ProdSearch(String prodname)
	    {
	        System.out.println("Select the prod select");
	    }

	}

	 class FurniturePurchase extends TestMain
	{
	   
	    public static void ProductSelect(String itemname) //Method overrides
	    {
	        System.out.println("Select the Furniture product");
	    }
	}

  class TestMain
	{

	  public static void Navigate()
	    {
	        System.out.println("Navigate to home page1");
	    }
	   
	    public static void ProdSearch(String prodname)
	    {
	        System.out.println("Search for the product1");
	    }
	   
	    public static void ProductSelect(String itemname)
	    {
	        System.out.println("Select the product1");
	    }

	}


