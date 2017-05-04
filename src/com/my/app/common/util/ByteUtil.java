package com.my.app.common.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ByteUtil {

	public static byte[] getDataList() throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		int idx = 0;
		baos.write(getData(idx++));
		baos.write(getData(idx++));
		baos.write(getData(idx++));
		return baos.toByteArray();
	}

	private static byte[] getData(int idx) throws IOException {
		// 1, 18, 6, 4, 40, 1, 40, 1
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		// start 1
		baos.write(rPad("'", 1));
		// header 18
		baos.write(rPad(idx+"", 18));
		// body
		baos.write(rPad("123456", 6));
		baos.write(rPad("9999", 4));
		baos.write(rPad("한글 제목입니다.", 40));
		baos.write(rPad("Y", 1));
		baos.write(rPad("This is English title.", 40));
		//  end 1
		baos.write(rPad("-", 1));
		return baos.toByteArray();
	}

	private static byte[] rPad(String str, int size) throws UnsupportedEncodingException {
		byte[] src = str.getBytes("MS949");
		byte[] dest = new byte[size];
		Arrays.fill(dest, (byte) 32);
		System.arraycopy(src, 0, dest, 0, src.length);
		return dest;
	}

}
