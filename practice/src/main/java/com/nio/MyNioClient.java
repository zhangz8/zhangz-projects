package com.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Scanner;

public class MyNioClient {
	private Selector selector; // 创建一个选择器
	private final static int port = 8686;
	private final static int BUF_SIZE = 10240;
	private static ByteBuffer byteBuffer = ByteBuffer.allocate(BUF_SIZE);

	private void initClient() throws IOException {
		this.selector = Selector.open();
		SocketChannel clientChannel = SocketChannel.open();
		clientChannel.configureBlocking(false);
		clientChannel.connect(new InetSocketAddress(port));
		clientChannel.register(selector, SelectionKey.OP_CONNECT);
		while (true) {
			selector.select();
			Iterator<SelectionKey> iterator = selector.selectedKeys()
					.iterator();
			while (iterator.hasNext()) {
				SelectionKey key = iterator.next();
				iterator.remove();
				if (key.isConnectable()) {
					doConnect(key);
				} else if (key.isReadable()) {
					doRead(key);
				}
			}
		}
	}

	public void doConnect(SelectionKey key) throws IOException {
		SocketChannel clientChannel = (SocketChannel) key.channel();
		if (clientChannel.isConnectionPending()) {
			clientChannel.finishConnect();
		}
		clientChannel.configureBlocking(false);
		for (;;) {
			Scanner scanner = new Scanner(System.in);
			String info = scanner.next();
			byteBuffer.clear();
			byteBuffer.put(info.getBytes("UTF-8"));
			byteBuffer.flip();
			clientChannel.write(byteBuffer);
			//clientChannel.close();
			//scanner.close();
		}
		// clientChannel.register(key.selector(),SelectionKey.OP_READ);
	}

	public void doRead(SelectionKey key) throws IOException {
		SocketChannel clientChannel = (SocketChannel) key.channel();
		clientChannel.read(byteBuffer);
		byte[] data = byteBuffer.array();
		String msg = new String(data).trim();
		System.out.println("服务端发送消息：" + msg);
		clientChannel.close();
		key.selector().close();
	}

	public static void main(String[] args) throws IOException {
		MyNioClient myNioClient = new MyNioClient();
		myNioClient.initClient();
	}
}
