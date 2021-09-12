package week2.day1;

public class FindTypes {

	public static void main(String[] args) {

		String test = "@ Welcome to 2nd Class of Automation $$";

		int Alphabet = 0, Space = 0, Number = 0, SpecialCharacter = 0;

		char[] arr = test.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (Character.isLetter(arr[i])) {
				Alphabet = Alphabet + 1;
			} else if (Character.isDigit(arr[i])) {
				Number = Number + 1;
			} else if (Character.isSpaceChar(arr[i])) {
				Space = Space + 1;
			} else {
				SpecialCharacter = SpecialCharacter + 1;
			}
		}
		System.out.println("letter: " + Alphabet);
		System.out.println("space: " + Space);
		System.out.println("number: " + Number);
		System.out.println("specialCharcter: " + SpecialCharacter);
	}

}
