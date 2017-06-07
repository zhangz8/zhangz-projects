package com.packtpub.java7.concurrency;

import java.util.Random;

public class DataCenter {

	private int[][] data;

	public int[][] getData() {
		return data;
	}

	public void setData(int[][] data) {
		this.data = data;
	}

	public DataCenter(int row, int col) {
		data = new int[row][col];
		Random random = new Random();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				int nextInt = random.nextInt(10);
				data[i][j] = nextInt;
			}
		}
	}
}
