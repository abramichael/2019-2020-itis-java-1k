public class Main {
	
	public static void main(String [] args) {
		
		User u1 = new User("Arthur");
		User u2 = new User("Konstantin");
		
		u1.subscribe(u2);
		System.out.println(u1.isFriend(u2));
		u2.subscribe(u1);
		System.out.println(u1.isFriend(u2));
		u1.sendMessage(u2, "Hiiiiiii");
		u1.sendMessage(u2, "Hello, w u r not responding");
		u2.sendMessage(u1, "Good bye");
		u2.sendMessage(u1, "ban");
		Message.showDialog(u1, u2);
	
	}
	
}