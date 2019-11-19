import java.util.ArrayList;

public class User {
	
	private String username;
	private ArrayList<User> subscriptions;
	
	public User(String username) {
		this.username = username;
		this.subscriptions = new ArrayList<User>();
		System.out.println("user with name <" + username + "> created.");
	}
	
	public void subscribe(User u) {
		subscriptions.add(u);
	}
	
	public boolean isSubscribed(User u){
		return this.subscriptions.contains(u);
	}
	
	public boolean isFriend(User u) {
		return this.isSubscribed(u) && u.isSubscribed(this);
		
	}
	
	
	
	
}