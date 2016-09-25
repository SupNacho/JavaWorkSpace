package ru.spec.java1.lec3;

import java.util.HashMap;
import java.util.Map;

public class Punto {

	static String en = "`1234567890-=qwertyuiop[]asdfghjkl;'\\\\zxcvbnm,./"
			+ "~!@#$%^&*()_+QWERYTIUOP{}ASDFGHJKL:\"||ZXCVBNM<>?";
	static String ru = "ё1234567890-=йцукенгшщзхъфывапролджэ\\\\ячсмитбью."
			+ "Ё!\"№;%:?*()_+ЙЦУКЕНШГЩЗХЪФЫВАПРОЛДЖЭ//ЯЧСМИТЬБЮ,";

	public static void main(String[] args) {
		String s = "Ghbdtn vbh";

		// testMap();

		HashMap<Character, Character> map = new HashMap<>();

		for (int i = 0; i < en.length(); i++) {
			map.put(en.charAt(i), ru.charAt(i));
		}

		String res = "";
		for (int i = 0; i < s.length(); i++) {
			Character srcChar = s.charAt(i);
			Character ruChar = map.get(srcChar);

			res += (ruChar == null ? srcChar : ruChar);
		}
		System.out.println(res);
	}

	private static void testMap() {
		HashMap<String, String> map = new HashMap<>();

		map.put("hello", "world");
		map.put("asd", "123");
		map.put("zxc", "gfh");
		map.put("hello", "123");

		System.out.println(map.get("hello").length());
	}

}
