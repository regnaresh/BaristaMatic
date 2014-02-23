package coffeedispenser;

public class CoffeeBean extends Ingredient{

	private static CoffeeBean coffeeBean =  null;
	
	protected CoffeeBean(float price, int initial_quantity)
	{
		setPrice(price);
		setQuantity(initial_quantity);
	}

	public static CoffeeBean getInstance(float price, int initial_quantity)
	{
		if(coffeeBean == null)
			return new CoffeeBean(price, initial_quantity); 
		
		return coffeeBean;
	}
	public CoffeeBean() {
		// TODO Auto-generated constructor stub
	}
}
