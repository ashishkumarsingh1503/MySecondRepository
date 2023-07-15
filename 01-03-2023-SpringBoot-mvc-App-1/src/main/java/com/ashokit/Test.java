
//1.Write a program to mask the email as follows-
//Input - Test@gmail.com
//Output - T**t@g***l.com
package com.ashokit;

public class Test {

	public static void main(String[] args) {
		String str = "Test@gmail.com";
		String[] split = str.split("@");
		String userName = split[0];
		StringBuilder uTmp = new StringBuilder();
		for (int i = 1; i < userName.length() - 1; i++) {
			uTmp.append(userName.charAt(i));
		}
		System.out.println(uTmp);
	}

}
