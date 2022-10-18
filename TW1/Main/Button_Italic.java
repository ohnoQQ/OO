package Main;

import java.awt.event.*;
import Decorator.*;

public class Button_Italic implements ActionListener{
	private Init_Word word;
	Button_Italic(Init_Word w){
		this.word = w;
		word = new ItalicFont(word);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		word.setFontStyle(e);
	}
}
