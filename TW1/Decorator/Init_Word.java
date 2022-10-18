package Decorator;

import java.awt.event.ActionEvent;
import javax.swing.text.Style;

public abstract class Init_Word {
	
	public Style style;
	public abstract void setFontStyle(ActionEvent e);
}