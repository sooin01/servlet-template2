import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringToByte {

	private static String[] NAME = {"Juliet", "Romeo", "Adam", "Tom", "Madam"};// fixed size : 20
	private static String[] AGE = {"qwe", "ewgs", "rt", "gfd", "fds"};    // fixed size : 5
	private static String[] ADDR = {"", "한글주소11", "", "", "한글주주주소소소22"};                // fixed size : 24
	private static String[] SUB = {"A", "B", "C", "D", "E"};                   // fixed size : 1
	
	public static void main(String[] args) throws IOException {
		StringToByte stb = new StringToByte();

		// Client : Make byte array
		byte[] arr = stb.getByteArray();

		// Server : Print byte array
		List<byte[]> list = new ArrayList<byte[]>();
		int i = 0;
		while (i < arr.length) {
			byte[] dest = new byte[70];
			System.arraycopy(arr, i, dest, 0, dest.length);
			list.add(dest);
			i += dest.length;
		}

		for (byte[] b : list) {
			stb.print(b);// bean 객체에 담
		}
	}

	private byte[] getByteArray() throws IOException {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();

		for (int i = 0; i < 5; i++) {
			bos.write(getByteData(i));
		}
		return bos.toByteArray();
	}

	private byte[] getByteData(int i) throws IOException {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		bos.write(rPad("^", 1));// start
		bos.write(rPad("", 18));// header
		bos.write(rPad(NAME[i], 20));
		bos.write(rPad(AGE[i], 5));
		bos.write(rPad(ADDR[i], 24));
		bos.write(rPad(SUB[i], 1));
		bos.write(rPad(".", 1));// end
		
		return bos.toByteArray();
	}

	private byte[] rPad(String string, int size) throws UnsupportedEncodingException {
		byte[] src = string.getBytes("MS949");
		byte[] dest = new byte[size];
		Arrays.fill(dest, (byte) 32);// space
		System.arraycopy(src, 0, dest, 0, string.length());
		return dest;
	}

	private void print(byte[] b) throws UnsupportedEncodingException {
		int idx = 0;
			// 1, 18, 20, 5, 24, 1, 1
		byte[] col = Arrays.copyOfRange(b, idx, idx += 1);
		System.out.println("Receive message: (" + col.length + ")[" + new String(col, "MS949") + "]");

		col = Arrays.copyOfRange(b, idx, idx += 18);
		System.out.println("Receive message: (" + col.length + ")[" + new String(col, "MS949") + "]");

		col = Arrays.copyOfRange(b, idx, idx += 20);
		System.out.println("Receive message: (" + col.length + ")[" + new String(col, "MS949") + "]");

		col = Arrays.copyOfRange(b, idx, idx += 5);
		System.out.println("Receive message: (" + col.length + ")[" + new String(col, "MS949") + "]");

		col = Arrays.copyOfRange(b, idx, idx += 24);
		System.out.println("Receive message: (" + col.length + ")[" + new String(col, "MS949") + "]");

		col = Arrays.copyOfRange(b, idx, idx += 1);
		System.out.println("Receive message: (" + col.length + ")[" + new String(col, "MS949") + "]");

		col = Arrays.copyOfRange(b, idx, idx += 1);
		System.out.println("Receive message: (" + col.length + ")[" + new String(col, "MS949") + "]");
	}

}

