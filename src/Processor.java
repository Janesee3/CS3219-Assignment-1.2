import java.util.ArrayList;

public class Processor {
	
	private ArrayList<String> ignoreWords;
	
	// Make constructor
	public Processor(ArrayList<String> ignoreWords) {
		this.ignoreWords = ignoreWords;
	}
	
	// Process the input shiftedTitles and returns the processed ArrayList
	public ArrayList<String> processTitles(	ArrayList<ArrayList<String>> shiftedTitles) {
		
		// Filter out titles that starts with ignoreWords
		ArrayList<ArrayList<String>> filteredTitles = filter(shiftedTitles, ignoreWords);
				
		// Convert to String List instead of a list of tokenized array
		
		// Sort Alphabetically
		
		return null;
	}
	
	
	// Filter out titles that start with words found in ignoreWords
	private ArrayList<ArrayList<String>> filter(	ArrayList<ArrayList<String>> shiftedTitles,
										ArrayList<String> ignoreWords ) {
		return null;
	}
}
