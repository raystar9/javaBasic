package week3.day12.exam._02_StringBuilder;

class StringBufferMain {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("동해물과 백두산이 마르고 ");
		System.out.println(sb.append("닳도록 보우하사 "));
		System.out.println(sb.insert(18, "하느님이 하느님이 "));
		System.out.println(sb.delete(23, 27));
		System.out.println(sb.deleteCharAt(22));
	}
}
