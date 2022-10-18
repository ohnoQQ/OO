package Decorator;

import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.text.StyleConstants;

public class ItalicFont extends FontStyleDecorator{
	/*
	 * In java.awt.Font:
	 * Font.PLAIN = 0;
	 * Font.BOLD = 1;
	 * Font.ITALIC = 2;
	 * Font.BOLD + Font.ITALIC = 3;
	 */
	int con = 1;
	public ItalicFont(Init_Word word) {
		super.w = word;
	}

	@Override
	public void setFontStyle(ActionEvent e) {
		StyleConstants.setItalic(w.style, ((JToggleButton)e.getSource()).isSelected());
		w.setFontStyle(e);
	}

}
