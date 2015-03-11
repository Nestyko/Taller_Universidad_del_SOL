
import java.util.Scanner;
	public class ImputChar
		{
		private static String input;
		private static Scanner sc = new Scanner(System.in);
		private static char in;

		// metodo leer

		public static char read() {
				input = sc.nextLine();
				in= input.charAt(0);
				return in;
  }
}