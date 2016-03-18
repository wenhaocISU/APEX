package gui.exploration;

import gui.Hierarchy;
import gui.UIAutomator;

import java.io.File;

import model.ApexApp;

public class DepthFirst {

	
	public static void main(String[] args)
	{
		explore(null);
	}
	
	// 0. Static analyze the app
	// 1. Instrument the app
	// 2. Install the app
	// 3. Apply startUp event
	// 4. collect exec log (adb logcat), activity info (adb shell dumpsys), keyboard info (adb shell dumpsys), layout hierarchy(UIAutomator)
	// 5. Update the Application Model: New Events, New unsolved Event Summaries, New GUI State, New GUI transition edges
	// 6. Choose next Event, go to its source GUI state, apply that event
	// 7. goto step 4
	public static void explore(ApexApp appModel)
	{
		File hierarchyXML = UIAutomator.dumpWindowXML();
		Hierarchy h = new Hierarchy(hierarchyXML);
	}
}
