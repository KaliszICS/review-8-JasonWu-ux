public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String pluralize(String word) {
		if (word == null) {
			return "";
		}
		String lower = word.toLowerCase();
			if (lower.endsWith("ife")) {
			return "ives";
		} else if (lower.endsWith("ey")) {
			return "eys";
		} else if (lower.endsWith("y")) {
			return "ies";
		} else {
			return "s";
		}
	}
		public static int min(int a, int b, int c) {
			int smallest = a;
			if (b < smallest) {
				smallest = b;
			}
			if (c < smallest) {
				smallest = c;
			}
			return smallest;
		}
	public static boolean isLeapYear(int year) {
		if (year % 4 != 0) {
			return false;
		} else if (year % 100 != 0) {
			return true;
		} else {
			return year % 400 == 0;
		}
	}
}

