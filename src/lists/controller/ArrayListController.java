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
		firstWords.add(1,"CRYING INSANELY");
		
		displayList();
		firstWords.set(2,"mamamamamamamamamamama");
		firstWords.remove(0);
		displayList();
		showOtherLoop();

	}
	
	private void displayList()
	{
		popupDisplay.showList("The size of the list is " + firstWords.size());
		for(int spot = 0; spot < firstWords.size(); spot++)
		{
			popupDisplay.showList("The contents at " + spot+ " are " + firstWords.get(spot));
		}
	}
	
	private void showOtherLoop()
	{
		for(String words : firstWords)
		{
			popupDisplay.showList(words);
		}
	}
}
