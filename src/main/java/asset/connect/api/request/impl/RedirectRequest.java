package asset.connect.api.request.impl;

import asset.connect.api.request.Request;
import asset.connect.api.result.impl.RedirectResult;

public class RedirectRequest implements Request<RedirectResult> {

	private String player;
	private String server;
	
	public RedirectRequest(String player, String server) {
		this.player = player;
		this.server = server;
	}

	public Class<RedirectResult> getResult() {
		return RedirectResult.class;
	}
	
	public String getPlayer() {
		return this.player;
	}
	
	public String getServer() {
		return this.server;
	}

}
