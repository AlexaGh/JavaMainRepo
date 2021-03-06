package javasmmr.zoowsome.services.factories;

public final class Constants {

	public static final class Species {
		public static final String Mammals = "Mammals";
		public static final String Reptiles = "Reptiles";
		public static final String Birds = "Birds";
		public static final String Aquatics = "Aquatics";
		public static final String Insects = "Insects";
	}

	public static final class Animals {
		public static final class Mammals {
			public static final String Cow = "MILKA";
			public static final String Monkey = "Rafiki";
			public static final String Tiger = "Crookshanks";
		}

		public static final class Reptiles {
			public static final String Crocodile = "Lizard / Curt Connors";
			public static final String Dragon = "Viserion";
			public static final String Turtule = "Donatello";
		}

		public static final class Birds {
			public static final String Woodpecker = "Woodie";
			public static final String Dove = "Sansa";
			public static final String Nightingale = "Zazu";
		}

		public static final class Aquatics {
			public static final String MoonJellyfish = "MoonJellyfishX";
			public static final String SeaHorse = "Dory";
			public static final String SeaTurtle = "Nigel";
		}

		public static final class Insects {
			public static final String Spider = "Black Widow";
			public static final String Butterfly = "Hesperiidae";
			public static final String LadyBug = "Coccinellidae";
		}
	}

	/*
	 * public static final class TypesOfEmployees { public static final String
	 * CareTaker = "CareTaker"; }
	 */

	public static final class Employees {
		public static final String Caretaker = "Caretakers";

		public static final class Caretakers {
			public static final String TCO_SUCCESS = "SUCCESS";
			public static final String TCO_KILLED = "KILLED";
			public static final String TCO_NO_TIME = "NO_TIME";
		}
	}

	public static final class XML_TAGS {
		public static final String EMPLOYEE = "EMPLOYEE";
		public static final String DISCRIMINANT = "DISCRIMINANT";
		public static final String ANIMAL = "ANIMAL";
	}

	public class Frames {
		public static final int HEIGHT = 500;
		public static final int WIDTH = 700;
	}

}