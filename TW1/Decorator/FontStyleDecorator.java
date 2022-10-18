package Decorator;

import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import Main.G2TextEditor;


public abstract class FontStyleDecorator extends Init_Word{
	protected Init_Word w;
	protected JTextPane jtp = G2TextEditor.Tpane;

    @Override
	public abstract void setFontStyle(ActionEvent e);
}