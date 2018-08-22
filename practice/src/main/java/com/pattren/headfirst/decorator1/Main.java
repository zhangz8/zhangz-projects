package com.pattren.headfirst.decorator1;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStream in = new LowercaseInputStream(new ByteArrayInputStream(
				"I Am Zhangz".getBytes()));

		int c;
		while ((c = in.read()) >= 0) {
			System.out.print((char) c);
		}
		in.close();

	}
}
