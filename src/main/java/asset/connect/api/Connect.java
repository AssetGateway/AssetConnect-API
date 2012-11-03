package asset.connect.api;

import asset.connect.api.request.Request;
import asset.connect.api.request.RequestException;
import asset.connect.api.result.FutureResult;
import asset.connect.api.result.Result;

public interface Connect {

	public boolean connect();
	
	public void disconnect();
	
	public void close();
	
	public <T extends Result> FutureResult<T> request(Request<T> request) throws RequestException;

	public void registerDirectEventListener(DirectEventListener directEventListener);
	
	public void unregisterDirectEventListener(DirectEventListener directEventListener);
	
	public void dispatchDirectEvent(DirectEvent directEvent);
	
	public boolean isConnected();
	
	public boolean isClosed();
	
	public ConnectSettings getSettings();
	
	@Deprecated
	public ConnectSettings getConnectSettings();
	
}
