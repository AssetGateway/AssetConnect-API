package asset.connect.api.request.impl;

import asset.connect.api.request.Request;
import asset.connect.api.result.impl.KeyResult;

public class KeyRequest implements Request<KeyResult> {

	public Class<KeyResult> getResult() {
		return KeyResult.class;
	}

}
