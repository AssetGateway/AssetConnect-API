package asset.connect.api.result.impl;

import java.util.List;
import java.util.Map;

import asset.connect.api.result.Result;
import asset.connect.api.result.StatusCode;

public class ServerPlayersResult extends Result {

	private Map<String, List<String>> serversToPlayers;
	
	public ServerPlayersResult(StatusCode statusCode) {
		super(statusCode);
	}
	
	public ServerPlayersResult(Map<String, List<String>> serversToPlayers) {
		super(StatusCode.SUCCESS);
		this.serversToPlayers = serversToPlayers;
	}
	
	public Map<String, List<String>> getServersToPlayers() {
		return this.serversToPlayers;
	}

}
