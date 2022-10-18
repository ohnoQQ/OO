package Main;

import java.awt.event.*;
import Decorator.*;

public class Button_Strikethrough implements ActionListener{
	private Init_Word word;
	Button_Strikethrough(Init_Word w){
		word = w;
		word = new Strikethrough(word);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		word.setFontStyle(e);
	}
}
