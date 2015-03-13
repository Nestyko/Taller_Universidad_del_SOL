package aux_classes.nestor.input_output.KbInput;

// Autor Mildred Chacin Fonseca



import java.io.Reader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class KbInputChar
 {
	private static char entrada;
	
	// Read Method
	public static char read() 
    //       throws IOException
           {
		try {
			Reader r= new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(r);
			entrada = (char)br.read();
			}
		catch (IOException e) {
			System.exit(1);
			}
			return entrada;
  }
}