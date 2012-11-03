package asset.connect.api.request.impl;

import asset.connect.api.request.Request;
import asset.connect.api.result.impl.AuthenticateResult;
import asset.connect.api.util.DigestUtils;

public class AuthenticateRequest implements Request<AuthenticateResult> {

	private String username;
	private String password;
	
	public AuthenticateRequest(String username, String password, String passwordKey) {
		this.username = username;
		this.password = DigestUtils.shaHex(DigestUtils.shaHex(passwordKey) + DigestUtils.shaHex(password));
	}

	public Class<AuthenticateResult> getResult() {
		return AuthenticateResult.class;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public String getPassword() {
		return this.password;
	}

}
