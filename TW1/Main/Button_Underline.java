package Main;

import java.awt.event.*;
import Decorator.*;

public class Button_Underline implements ActionListener{
	private Init_Word word;
	Button_Underline(Init_Word w){
		word = w;
		word = new Underline(word);
	}
	@Override
	public void actionPerformed(ActionEvent e){
		word.setFontStyle(e);
	}
}
