import java.util.Scanner;
	public class Imput
		{
		private static String input;

		// metodo leer
		static Scanner sc = new Scanner(System.in);

		public static String read() {
				input = sc.nextLine();
				return input;
  }
}