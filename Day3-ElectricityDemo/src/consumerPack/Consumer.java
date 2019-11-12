package consumerPack;

public class Consumer {

	private int mtrNo;
	private int unitsConsumed;
	private int unitPrice;
	
	public Consumer(int mtrNo, int unitsConsumed, int unitPrice) {
		super();
		this.mtrNo = mtrNo;
		this.unitsConsumed = unitsConsumed;
		this.unitPrice = unitPrice;
	}
	
	private int billedAmount() {
		return (unitsConsumed*unitPrice);
	}

	@Override
	public String toString() {
		return "Consumer [mtrNo=" + mtrNo + ", unitsConsumed=" + unitsConsumed + ", unitPrice=" + unitPrice + ", billed amount: "+ billedAmount() + "]";
	}
	
	
	
}
