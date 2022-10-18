package Main;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Style;

@SuppressWarnings("serial")
public class StyleDocument extends DefaultStyledDocument {
	
	private Style FontStyle;

    public StyleDocument() {
        super();
        FontStyle = this.addStyle("FontStyle", null);
    }
    public Style getFontStyle() {
        return FontStyle;
    }
    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        super.insertString(offs, str, FontStyle); 
    }
		   
}
