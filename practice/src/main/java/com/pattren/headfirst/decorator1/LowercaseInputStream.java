package com.pattren.headfirst.decorator1;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowercaseInputStream extends FilterInputStream {

	protected LowercaseInputStream(InputStream in) {
		super(in);
	}

	public int read() throws IOException {
		int c = in.read();
		return (c == -1 ? c : Character.toLowerCase((char) c));
	}

	public int read(byte b[], int offset, int len) throws IOException {
		int result = super.read(b, offset, len);
		for (int i = offset; i < offset + result; i++) {
			b[i] = (byte) Character.toLowerCase((char) b[i]);
		}
		return result;
	}

}
