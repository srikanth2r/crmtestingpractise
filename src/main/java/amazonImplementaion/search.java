package amazonImplementaion;

public class search {
	public String displayproduct(Product Product) {

		if (Product.getproductlist().contains(Product.getProductname())) {
			return Product.getProductname();
		}

		return null;
	}

}
