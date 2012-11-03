package asset.connect.api.request;

import asset.connect.api.result.Result;

public interface Request<T extends Result> {

	public Class<T> getResult();
	
}
