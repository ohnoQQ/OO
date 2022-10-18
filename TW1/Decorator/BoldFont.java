package Decorator;


import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.text.StyleConstants;


public class BoldFont extends FontStyleDecorator{
	/*
	 * In java.awt.Font:
	 * Font.PLAIN = 0;
	 * Font.BOLD = 1;
	 * Font.ITALIC = 2;
	 * Font.BOLD + Font.ITALIC = 3;
	 */
	int con = 1;
	public BoldFont(Init_Word word) {
		super.w = word;
	}

	@Override
	public void setFontStyle(ActionEvent e) {
		StyleConstants.setBold(w.style, ((JToggleButton)e.getSource()).isSelected());
		w.setFontStyle(e);
	}
	
}
