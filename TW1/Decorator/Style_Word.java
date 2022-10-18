package Decorator;

import java.awt.event.ActionEvent;
import Main.StyleDocument;
import Main.G2TextEditor;

public class Style_Word extends Init_Word{
	
	protected StyleDocument sdoc = G2TextEditor.sDoc;
	public Style_Word(){
		style = sdoc.getFontStyle();
	}
	@Override
	public void setFontStyle(ActionEvent e) {
		System.out.println("Setted");
	}
}
