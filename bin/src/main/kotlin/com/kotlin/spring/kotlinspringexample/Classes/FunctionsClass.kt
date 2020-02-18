package com.kotlin.spring.kotlinspringexample

class FunctionsClass {

	companion object {
		fun isAnnogram(string1: String, string2: String): Boolean {
			var cArray = string1.toCharArray();
			var manipulatedString = string2

			if (string1.length != string2.length) {
				return false;
			}

			for (i in 0..string1.length - 1) {
				if (manipulatedString.indexOf(cArray[i]) != -1) {
					manipulatedString = removeCharAt(manipulatedString, manipulatedString.indexOf(cArray[i]));
				}

			}


			if (manipulatedString.length > 0) {
				return false;
			}
			return true;
		}

		fun removeCharAt(s: String, pos: Int): String {
			return s.substring(0, pos) + s.substring(pos + 1);
		}

	}
}