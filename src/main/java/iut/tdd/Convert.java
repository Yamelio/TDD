package iut.tdd;

public class Convert {
	public static String num2text(String input) {
		switch (Integer.parseInt(input)) {
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
		String res = "";
		switch (input.length()) {
		case 3:
			return num2text(input.charAt(0) + "") + " cent "
					+ num2text(input.substring(1));

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
		return null;
	}
}