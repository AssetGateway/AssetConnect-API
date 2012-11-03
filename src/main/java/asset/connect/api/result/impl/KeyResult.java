package asset.connect.api.result.impl;

import asset.connect.api.result.Result;
import asset.connect.api.result.StatusCode;

public class KeyResult extends Result {

	private String key;
	
	public KeyResult(String key) {
		super(StatusCode.SUCCESS);
		this.key = key;
	}
	
	public String getKey() {
		return this.key;
	}
	
}
