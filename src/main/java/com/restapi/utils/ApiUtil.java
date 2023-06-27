package com.restapi.utils;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class ApiUtil {

	private ApiUtil() {
	}

	public static String decode(String encodedArg) {
		return new String(Base64.getDecoder().decode(encodedArg), StandardCharsets.UTF_8);
	}

	public static String encode(String arg) {
		return Base64.getEncoder().encodeToString(arg.getBytes());
	}
}