package com.madgag.ssh.authagent;

import java.util.Map;

public interface AuthAgent {
	Map<String,byte[]> getIdentities();

	byte[] sign(byte[] publicKey, byte[] data);
}
