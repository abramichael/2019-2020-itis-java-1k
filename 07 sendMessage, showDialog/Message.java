import java.util.*;

public class Message {
	
	private User sender;
	private User receiver;
	private String text;
	private Date date;
	
	public Message(User sender, User receiver, String text) {
		
		this.sender = sender;
		this.receiver = receiver;
		this.text = text;
		this.date = new Date();
		
	}
	
	public User getSender() {
		
		return sender;
		
	}
	
	public User getReceiver() {
		
		return receiver;
		
	}
	
	private static ArrayList<Message> messages = new ArrayList<Message>();
	
	public static void addNewMessage(User u1, User u2, String text) {
		
		messages.add(new Message(u1, u2, text));
		
	}
	
	public static void showDialog(User u1, User u2) {
		
		for (Message message : messages)  {
			if (message.getSender() == u1 && message.getReceiver() == u2
				|| message.getSender() == u2 && message.getReceiver() == u1) {
				
				System.out.println(message);
				
			}
		}
	}
	
	public String toString() {
		
		return "FROM: " + sender + "\nTO: " + receiver + 
			" \nON: " + date + "\n" + text + "\n";
		
	}
	
}