package entity;

public class Bill {
	public float tvprice, tnprice;
	public float total_Bill;

	public float getTopping() {
		return tvprice;
	}

	public float getTnprice() {
		return tnprice;
	}

	public void setTvprice(float tvprice) {
		this.tvprice = tvprice;
	}

	public void setTnprice(float tnprice) {
		this.tnprice = tnprice;
	}

	public void Total_Bill() {
		total_Bill = tvprice + tnprice;
		System.out.println("The total bill is :" + total_Bill);
	}

}
