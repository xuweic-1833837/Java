package assignment2.question3.purchaseManager;

/**
 * 
 * This is the MrToto class, the "model" of the whole program.
 *
 */
public class Customer {
    
	private double assets, spending = 0;
	private int items = 0;
	private final int MAX_ITEM = 10, MIN_REMAIN = 10, BASELINE = 100;
	
	
	
	public void setAssets(double assets){
		this.assets = assets;
	}
	
	
	/** 
	 * @return true if assets is more than $100, false otherwise
	 */
	public boolean assetsSuficient(){
		return assets > BASELINE;
	}
	
	
	/**
	 * @return true is maximum number of purchases reached
	 */
	public boolean maxPurchasesReached(){
		return items == MAX_ITEM;
	}
	
	
	/**
	 * The single process of purchasing, take price(double) as parameter
	 * @return true if purchase succeed, false if it fails because of insufficient assets 
	 */
	public boolean makePurchase(double price){
			
		if( (assets - price) < MIN_REMAIN){
			return false;  // return false if it is because of insufficient assets
		}	
		
		assets -= price;
		spending += price;
		items += 1;
		
        return true;    // return true if purchase succeed
	
	}
	
	
	
	public double getAssets(){
		return assets;
	}
	
	
	public double getSpending(){
		return spending;
	}
    
	public int getItems(){
		return items;
	}
}
