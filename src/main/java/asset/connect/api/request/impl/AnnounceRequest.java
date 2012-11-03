package asset.connect.api.request.impl;

import asset.connect.api.request.Request;
import asset.connect.api.result.impl.AnnounceResult;

public class AnnounceRequest implements Request<AnnounceResult> {
	
	private String ip;
	private int port;
	
	public AnnounceRequest(int port) {
		this(null, port);
	}
	
	public AnnounceRequest(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}

	public Class<AnnounceResult> getResult() {
		return AnnounceResult.class;
	}
	
	public String getIp() {
		return this.ip;
	}
	
	public int getPort() {
		return this.port;
	}

}
