

/**
 * @author Mordamir & Michelangelo Partipilo
 *
 * Keyboard Read Class (for lectures)
 */
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class KbInput {
	private static String input;
	
	// Read Method
	public static String read() {
		try {
			Reader rin = new InputStreamReader(System.in);
			BufferedReader brin = new BufferedReader(rin);
			input = brin.readLine();
			}
		catch (IOException e) {
			System.exit(1);
			}
			return input;
  }
}