package asset.connect.api.result.impl;

import asset.connect.api.result.Result;
import asset.connect.api.result.StatusCode;

public class WhoamiResult extends Result {

	private String identification;
	
	public WhoamiResult(String identification) {
		super(StatusCode.SUCCESS);
		this.identification = identification;
	}
	
	public String getIdentification() {
		return this.identification;
	}

}
