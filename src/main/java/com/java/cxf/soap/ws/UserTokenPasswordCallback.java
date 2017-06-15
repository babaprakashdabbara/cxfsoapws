package com.java.cxf.soap.ws;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;

public class UserTokenPasswordCallback implements CallbackHandler {

	private Map<String, String> passwords = new HashMap<>();

	public UserTokenPasswordCallback() {
		passwords.put("baba", "prakash");
	}

	@Override
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
		for (Callback callback : callbacks) {
			WSPasswordCallback wspasswordCallback = (WSPasswordCallback) callback;
			String pass = passwords.get(wspasswordCallback.getIdentifier());

			if (pass != null) {
				wspasswordCallback.setPassword(pass);
				return;
			}
		}
	}
}
