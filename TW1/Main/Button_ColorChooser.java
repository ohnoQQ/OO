package Main;

import java.awt.event.*;
import Decorator.*;

public class Button_ColorChooser implements ActionListener{
	private Init_Word word;
	Button_ColorChooser(Init_Word w){
		this.word = w;
		word = new FontColor(word);
	}
	@Override
	public void actionPerformed(ActionEvent e){
		word.setFontStyle(e);
	}
}
