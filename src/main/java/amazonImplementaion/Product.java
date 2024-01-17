package amazonImplementaion;

import java.util.ArrayList;
import java.util.List;

public class Product {

	private String productname;
	private int price;

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Product(String productname, int price) {

		this.productname = productname;
		this.price = price;
	}
	public List<String> getproductlist(){
		List<String> ls=new ArrayList<>();
		ls.add("Mac book pro");
		ls.add("ASUS");
		ls.add("windows");
		
		
		return ls;
	}

}
