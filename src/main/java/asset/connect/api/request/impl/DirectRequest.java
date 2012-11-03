package asset.connect.api.request.impl;

import java.util.Arrays;
import java.util.List;

import asset.connect.api.request.Request;
import asset.connect.api.result.impl.DirectResult;

public class DirectRequest implements Request<DirectResult> {

	private List<String> usernames;
	private String message;
	
	public DirectRequest(String username, String message) {
		this(Arrays.asList(username), message);
	}
	
	public DirectRequest(List<String> usernames, String message) {
		this.usernames = usernames;
		this.message = message;
	}

	public Class<DirectResult> getResult() {
		return DirectResult.class;
	}
	
	public List<String> getUsernames() {
		return this.usernames;
	}
	
	public String getMessage() {
		return this.message;
	}

}
