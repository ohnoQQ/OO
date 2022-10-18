package Main;

import java.awt.event.*;
import Decorator.*;

public class Button_Bold implements ActionListener{
	private Init_Word word;
	Button_Bold(Init_Word w){
		this.word = w;
		word = new BoldFont(word);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		word.setFontStyle(e);
	}
}
