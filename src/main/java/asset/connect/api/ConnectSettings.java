package asset.connect.api;

import java.net.InetSocketAddress;

public interface ConnectSettings {

	public InetSocketAddress getOutboundAddress();
	
	public String getUsername();
	
	public String getPassword();
	
}
