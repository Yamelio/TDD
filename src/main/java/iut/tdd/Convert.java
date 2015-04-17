package iut.tdd;

public class Convert {
	public static String num2text(String input) {

		if (input.contains(",")) {
			int idx = input.indexOf(",");
			return num2text(input.substring(0, idx)) + " virgule "
					+ num2text(input.substring(idx + 1));
		}
		if (input.contains(".")) {
			int idx = input.indexOf(".");
			return num2text(input.substring(0, idx)) + " virgule "
					+ num2text(input.substring(idx + 1));
		}

		if (input.charAt(0) == ' ') {
			return num2text(input.substring(1));
		}
		if (input.endsWith(" ")) {
			return num2text(input.substring(0, input.length() - 1));
		}

		switch (Integer.parseInt(input)) {
		case 81:
			return "quatre-vingt-un";
		case 0:
			return "zéro";
		case 1:
			return "un";

		case 2:
			return "deux";

		case 3:
			return "trois";

		case 4:
			return "quatre";

		case 5:
			return "cinq";

		case 6:
			return "six";

		case 7:
			return "sept";

		case 8:
			return "huit";

		case 9:
			return "neuf";
		case 10:
			return "dix";
		case 11:
			return "onze";
		case 12:
			return "douze";
		case 13:
			return "treize";
		case 14:
			return "quatorze";
		case 15:
			return "quinze";
		case 16:
			return "seize";
		case 20:
			return "vingt";
		case 30:
			return "trente";
		case 40:
			return "quarante";
		case 50:
			return "cinquante";
		case 60:
			return "soixante";
		case 80:
			return "quatre-vingt";

		default:
			return trad(input);

		}
	}

	private static String trad(String input) {
		if (input.charAt(0) == '0') {
			return num2text(input.substring(1));
		}
		String res = "";

		switch (input.length()) {

		case 7:
			res += num2text("" + input.charAt(0));
			if (input.charAt(0) == '1') {
				res += " million";
				if (input.substring(1).equals("000000")) {
					return res;
				}
			} else {
				res += " millions";
			}
			res += " " + num2text(input.substring(1));
			break;
		case 6:
			if (input.substring(0, 2) != "001") {
				res += num2text(input.substring(0, 3) + "") + " ";
			}
			res += "mille " + num2text(input.substring(3));
			break;

		case 5:
			if (input.substring(0, 1) != "01") {
				res += num2text(input.substring(0, 2) + "") + " ";
			}
			res += "mille " + num2text(input.substring(2));
			break;

		case 4:
			if (input.charAt(0) != '1') {
				res += num2text(input.charAt(0) + "") + " ";
			}
			res += "mille " + num2text(input.substring(1));
			break;
		case 3:
			if (input.charAt(0) != '1') {
				res += num2text(input.charAt(0) + "") + " ";
			}
			res += "cent " + num2text(input.substring(1));
			break;

		default:

			switch (input.charAt(0)) {

			case '7':
				res += num2text("60") + "-";
				if (input.charAt(1) == '1') {
					res += "et-";
				}
				res += num2text("1" + input.charAt(1));
				break;
			case '9':
				res += num2text("80") + "-";
				res += num2text("1" + input.charAt(1));
				break;
			default:
				switch (input.charAt(1)) {
				case '1':
					return num2text(input.charAt(0) + "0") + "-et-un";

				default:
					return num2text(input.charAt(0) + "0") + "-"
							+ num2text("" + input.charAt(1));
				}
			}
		}
		return res;
	}

	public static String text2num(String input) {

		for (Integer i = 0; i < 1000000000; i++) {

			if (num2text(i.toString()).equals(input))
				return (i + "");
		}
		return null;

	}
}