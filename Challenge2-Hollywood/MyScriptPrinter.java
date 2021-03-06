//UIUC CS125 SPRING 2016 MP. File: MyScriptPrinter.java, CS125 Project: Challenge2-Hollywood, Version: 2016-02-08T21:42:05-0600.407451735
/**
 * A program to print one actor's lines. 
 * See ScriptPrinter.txt for more information.
 * TODO: add your netid to the line below
 * @author zzhan145
 */
public class MyScriptPrinter {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		boolean output = false; //Set to true when we find the desired character
		String name = ""; // Only print lines for this character
		
		TextIO.putln("Which character's lines would you like? (NEO,MORPHEUS,ORACLE)");
		name = TextIO.getln();
		name = name.toUpperCase();

		TextIO.readFile("thematrix.txt"); // stop reading from the keyboard- use the script

		//TODO: Print the name here (see ScriptPrinter.txt example output for format)
		
		output = false; // initially don't print anything
		TextIO.putln(name + "'s lines:");

		// This loop will read one line at a time from the script until it
		// reaches the end of the file and then TextIO.eof() will return true.
		// eof means end-of-file
		
		while (false == TextIO.eof()) {
			String line = TextIO.getln(); // Read the next line
			
			//TODO: Re-order the three if statements so the output is correct

			if (line.indexOf(name) >= 0){
				output = true; // We found the character's name, time to start printing their lines
			}else{
				output = false;
			}

			if (output){
				line = TextIO.getln();
				//TODO: Correct the output format (see ScriptPrinter.txt example output)
				line = line.trim();
				TextIO.putln(name + ":\"" + line + "\""); // Only print the line if 'output' is true
			}
			
			//TODO: If it's a blank line set 'output' to false
			if(line == ""){
				output = false;
			}
		}
		//TODO: Print 3 dashes here to indicate processing is complete
		TextIO.putln("---");
	}

}
