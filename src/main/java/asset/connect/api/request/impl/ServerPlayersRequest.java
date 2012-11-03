package asset.connect.api.request.impl;

import java.util.List;

import asset.connect.api.request.Request;
import asset.connect.api.result.impl.ServerPlayersResult;

public class ServerPlayersRequest implements Request<ServerPlayersResult> {

	private List<String> servers;
	
	public ServerPlayersRequest(List<String> servers) {
		this.servers = servers;
	}
	
	public Class<ServerPlayersResult> getResult() {
		return ServerPlayersResult.class;
	}
	
	public List<String> getServers() {
		return this.servers;
	}

}
