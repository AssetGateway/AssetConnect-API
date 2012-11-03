package asset.connect.api;

public class DirectEvent {

	private String username;
	private String message;
	
	public DirectEvent(String username, String message) {
		this.username = username;
		this.message = message;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public String getMessage() {
		return this.message;
	}
	
}
