package com.madgag.ssh.android.authagent;


interface AndroidAuthAgent {
	Map getIdentities();

	byte[] sign(in byte[] publicKey, in byte[] data);
}
