package asset.connect.api.request.impl;

import asset.connect.api.request.Request;
import asset.connect.api.result.impl.PlayerServerResult;

public class PlayerServerRequest implements Request<PlayerServerResult> {

	private String player;
	
	public PlayerServerRequest(String player) {
		this.player = player;
	}
	
	public Class<PlayerServerResult> getResult() {
		return PlayerServerResult.class;
	}
	
	public String getPlayer() {
		return this.player;
	}

}
