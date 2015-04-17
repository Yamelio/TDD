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
		case 70:
			return "soixante-dix";
		case 80:
			return "quatre-vingt";
		case 90:
			return "quatre-vingt-dix";

		default:
			return trad(input);

		}
	}

	private static String trad(String input) {
		switch (input.charAt(1)) {
		case '1':
			return num2text(input.charAt(0) + "0") + "-et-"
					+ num2text("" + input.charAt(1));

		default:
			return num2text(input.charAt(0) + "0") + "-"
					+ num2text("" + input.charAt(1));
		}
	}

	public static String text2num(String input) {
		return null;
	}
}