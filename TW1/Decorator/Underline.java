package Decorator;

import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.text.StyleConstants;

public class Underline extends FontStyleDecorator{

	public Underline(Init_Word word) {
		super.w = word;
	}


	@Override
	public void setFontStyle(ActionEvent e) {
		StyleConstants.setUnderline(w.style, ((JToggleButton)e.getSource()).isSelected());
	}
}