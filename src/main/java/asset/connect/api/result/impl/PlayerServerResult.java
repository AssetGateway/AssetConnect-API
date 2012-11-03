package asset.connect.api.result.impl;

import asset.connect.api.result.Result;
import asset.connect.api.result.StatusCode;

public class PlayerServerResult extends Result {

	private String server;
	
	public PlayerServerResult(StatusCode statusCode) {
		super(statusCode);
	}
	
	public PlayerServerResult(String server) {
		super(StatusCode.SUCCESS);
		this.server = server;
	}
	
	public String getServer() {
		return this.server;
	}

}
