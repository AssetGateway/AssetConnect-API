package asset.connect.api.util;

import java.security.MessageDigest;

public class DigestUtils {

	public static String shaHex(byte[] bytes) {
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
			messageDigest.update(bytes, 0, bytes.length);
			return hex(messageDigest.digest());
		} catch(Throwable throwable) {
			throwable.printStackTrace();
		}
		return null;
	}
	
	public static String shaHex(String string) {
		return shaHex(string.getBytes());
	}
	
	private static String hex(byte[] data) { 
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < data.length; i++) { 
            int halfbyte = (data[i] >>> 4) & 0x0F;
            int two_halfs = 0;
            do { 
                if ((0 <= halfbyte) && (halfbyte <= 9)) {
                    buf.append((char) ('0' + halfbyte));
                } else {
                    buf.append((char) ('a' + (halfbyte - 10)));
                }
                halfbyte = data[i] & 0x0F;
            } while(two_halfs++ < 1);
        } 
        return buf.toString();
    } 
	
}
