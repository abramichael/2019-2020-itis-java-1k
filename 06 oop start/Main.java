public class Main {
	
	public static void main(String [] args) {
		
		User u1 = new User("Arthur");
		User u2 = new User("Konstantin");
		
		u1.subscribe(u2);
		System.out.println(u1.isFriend(u2));
		u2.subscribe(u1);
		System.out.println(u1.isFriend(u2));
	
	}
	
}