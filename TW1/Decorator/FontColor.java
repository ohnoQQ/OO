package Decorator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.text.StyleConstants;



public class FontColor extends FontStyleDecorator{

	public FontColor(Init_Word word) {
		super.w = word;
    }
	@Override
	public void setFontStyle(ActionEvent e) {
		Color color = JColorChooser.showDialog(jtp, "FontColorChooser", Color.BLACK);
	    if (color != null) {
	    	StyleConstants.setForeground(w.style, color);
	    }
		w.setFontStyle(e);
	}
}
