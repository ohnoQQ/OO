package Decorator;

import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.text.StyleConstants;

public class Strikethrough extends FontStyleDecorator{

	public Strikethrough(Init_Word word) {
		super.w = word;
	}

	@Override
	public void setFontStyle(ActionEvent e) {
	    StyleConstants.setStrikeThrough(w.style, ((JToggleButton)e.getSource()).isSelected());
	}
}
