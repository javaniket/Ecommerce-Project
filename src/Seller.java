
public class Seller extends User {

	private User[] Seller;
	@Override
	public Boolean verifyUser() {

		return true;
	}
	public User[] getSeller() {
		return Seller;
	}
	public void setSeller(User[] seller) {
		Seller = seller;
	}
	

}
