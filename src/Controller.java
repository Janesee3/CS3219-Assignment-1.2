import java.util.ArrayList;

public class Controller {
	private ArrayList<ArrayList<String>> tokenizedTitles;
	public static ArrayList<String> ignoreWords;
	public static ArrayList<String> outputTitles;
	
	public void initKWIC() {
		
		tokenizedTitles = new ArrayList<ArrayList<String>>();
		ignoreWords = new ArrayList<String>();
		outputTitles = new ArrayList<String>();
		
		InputHandler.readAndStoreInput(tokenizedTitles, ignoreWords, outputTitles);
		OutputHandler.printOutput(outputTitles);
	}
	
}
