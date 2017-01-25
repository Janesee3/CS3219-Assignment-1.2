import java.util.ArrayList;

public class Controller {
	private ArrayList<ArrayList<String>> tokenizedTitles;
	ArrayList<String> ignoreWords;
	
	public static ArrayList<String> outputTitles;
	
	public void initKWIC() {
		InputHandler.readAndStoreInput(tokenizedTitles, ignoreWords);
		Logic.executeKWIC(tokenizedTitles, ignoreWords, outputTitles);
		OutputHandler.printOutput(outputTitles);
	}
	
}
