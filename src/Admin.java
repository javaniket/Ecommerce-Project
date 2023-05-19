
public class Admin extends User {

	//private Product[] productsListed;
private User[] Admin;
	public User[] getAdmin() {
	return Admin;
}
public void setAdmin(User[] admin) {
	Admin = admin;
}
	@Override
	public Boolean verifyUser() {

		return true;
	}

		
}

