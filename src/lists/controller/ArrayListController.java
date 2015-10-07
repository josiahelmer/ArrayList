package lists.controller;

import java.util.ArrayList;
import lists.view.ListViewer;

public class ArrayListController
{
	private ArrayList<String> firstWords;
	private ListViewer popupDisplay;

	public ArrayListController()
	{
		firstWords = new ArrayList<String>();
		popupDisplay = new ListViewer();
	}
	
	public void start()
	{
		firstWords.add("ladksfgjldsfjkglo");
		firstWords.add("bababababababababababababab");
		displayList();
	}
	
	private void displayList()
	{
		for(int spot = 0; spot < firstWords.size(); spot++)
		{
			popupDisplay.showList("The contents at " + spot+ " are " + firstWords.get(spot));
		}
	}
}
