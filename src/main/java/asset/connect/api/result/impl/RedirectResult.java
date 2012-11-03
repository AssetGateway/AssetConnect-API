package asset.connect.api.result.impl;

import asset.connect.api.result.Result;
import asset.connect.api.result.StatusCode;

public class RedirectResult extends Result {

	public RedirectResult(StatusCode statusCode) {
		super(statusCode);
	}

}
