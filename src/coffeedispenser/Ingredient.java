package coffeedispenser;

public abstract class Ingredient {
	
	private float price;		   	//price of an ingredient
	private int initial_quantity;	//initial or restock quantity of an ingredient
	private int current_quantity;	//initial or restock quantity of an ingredient
	
	/*public Ingredient()
	{
		//current_quantity = INITIAL_QUANTITY;
	}*/
	
	public float getPrice()
	{
		return price;
	}
	
	public void setPrice(float price)
	{
		this.price = price;
	}
	
	public int getQuantity()
	{
		return current_quantity;
	}
		
	public void setQuantity(int quantity )
	{
		this.initial_quantity = quantity;
		this.current_quantity = quantity;
		
	}
	
	public void updateCurrentQuantity(int reduce)
	{
		current_quantity -= reduce;
	}

}
