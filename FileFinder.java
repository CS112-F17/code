import java.io.File;
import java.util.HashMap;

/**
	A class that recursively counts the number of files and directories.
**/
public class FileFinder {

	/**
		Return a Map containing the number of files and directories found.
	**/
	public static HashMap<String, Integer> countFilesDirs(String directory) {

		HashMap<String, Integer> result = new HashMap<String, Integer>();
		countFilesDirs(new File(directory), result);
		return result;

	}

	//helper method
	private static void countFilesDirs(File input, HashMap<String, Integer> result) {

		if(input.isFile()) {

			if(result.containsKey("Files")) {
				//get it out
				int value = result.get("Files");
				//increment
				value++;
				//put back
				result.put("Files", value);
			} else {
				result.put("Files", 1);
			}

		} else {

			if(result.containsKey("Dirs")) {
				//get it out
				int value = result.get("Dirs");
				//increment
				value++;
				//put back
				result.put("Dirs", value);
			} else {
				result.put("Dirs", 1);
			}
			File[] children = input.listFiles();
			for(File f: children) {
				countFilesDirs(f, result);
			}

		}

	} 

	public static void main(String[] args) {

		HashMap<String, Integer> result = countFilesDirs("/Users/srollins/teaching/cs112");

		for(String key: result.keySet()) {
			System.out.println(key + ": " + result.get(key));
		}

	}

}