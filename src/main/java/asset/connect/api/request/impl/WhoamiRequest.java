package asset.connect.api.request.impl;

import asset.connect.api.request.Request;
import asset.connect.api.result.impl.WhoamiResult;

public class WhoamiRequest implements Request<WhoamiResult> {

	public Class<WhoamiResult> getResult() {
		return WhoamiResult.class;
	}

}
