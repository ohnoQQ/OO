package Main;
import Decorator.*;
import javax.swing.*;
import java.awt.*;


public class G2TextEditor {

	public static JTextPane Tpane;
	public static StyleDocument sDoc;
	public static JButton fontcolor_btn;
	public static JToggleButton bold_btn;
	public static JToggleButton italic_btn;
	public static JToggleButton underline_btn;
    public static JToggleButton undo_btn;
    public static JToggleButton redo_btn;
	private JToggleButton strikethrough_btn;
	

    public G2TextEditor() {
    	
    	GenerateGUI();
    	InitializePattern();
    	
    }
    private void addComponentsToPane(Container pane) {
        pane.setLayout(new BorderLayout());
        Tpane = new JTextPane();
        //�۰ʴ���(jTextArea only)
        //jTextArea.setLineWrap(true);
        //�N�h���r�ءA�[��u�ʱ��b���O��
        JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.setViewportView(Tpane);
        pane.add(jScrollPane);
        Tpane.setFont(new Font("Times New Roman",Font.PLAIN,20));
        Panel panel = new Panel(new GridBagLayout());
        jScrollPane.setColumnHeaderView(panel);
        fontcolor_btn = new JButton("Font Color");
        fontcolor_btn.setBounds(0, 21, 943, -21);
        GridBagConstraints gbc_fontcolor_btn = new GridBagConstraints();
        gbc_fontcolor_btn.anchor = GridBagConstraints.WEST;
        gbc_fontcolor_btn.insets = new Insets(0, 0, 0, 5);
        gbc_fontcolor_btn.gridx = 0;
        gbc_fontcolor_btn.gridy = 0;
        panel.add(fontcolor_btn, gbc_fontcolor_btn);
        bold_btn = new JToggleButton("B");
        GridBagConstraints gbc_bold_btn = new GridBagConstraints();
        gbc_bold_btn.insets = new Insets(0, 0, 0, 5);
        gbc_bold_btn.gridx = 2;
        gbc_bold_btn.gridy = 0;
        panel.add(bold_btn, gbc_bold_btn);
        italic_btn = new JToggleButton("I");
        GridBagConstraints gbc_italic_btn = new GridBagConstraints();
        gbc_italic_btn.insets = new Insets(0, 0, 0, 5);
        gbc_italic_btn.gridx = 3;
        gbc_italic_btn.gridy = 0;
        panel.add(italic_btn, gbc_italic_btn);
        underline_btn = new JToggleButton("U");
        GridBagConstraints gbc_underline_btn = new GridBagConstraints();
        gbc_underline_btn.insets = new Insets(0, 0, 0, 5);
        gbc_underline_btn.gridx = 25;
        gbc_underline_btn.gridy = 0;
        panel.add(underline_btn, gbc_underline_btn);
        strikethrough_btn = new JToggleButton("S");
        GridBagConstraints gbc_strikethrough_btn = new GridBagConstraints();
        gbc_strikethrough_btn.gridx = 26;
        gbc_strikethrough_btn.gridy = 0;
        panel.add(strikethrough_btn, gbc_strikethrough_btn);
        undo_btn = new JToggleButton("undo");
        GridBagConstraints gbc_undo_btn = new GridBagConstraints();
        gbc_undo_btn.gridx = 27;
        gbc_undo_btn.gridy = 0;
        panel.add(undo_btn, gbc_undo_btn);
        redo_btn = new JToggleButton("redo");
        GridBagConstraints gbc_redo_btn = new GridBagConstraints();
        gbc_redo_btn.gridx = 28;
        gbc_redo_btn.gridy = 0;
        panel.add(redo_btn, gbc_redo_btn);
    }
    private void GenerateGUI() {
        JFrame frame = new JFrame("G2TextEditor");
        // ����ù��ѪR��
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        // �]�w�����j�p���ù��|�����@
        frame.setSize(size.width / 2, size.height / 2);
        // �]�w������ܦb�ù��e��������m
        int x = (int) ((size.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((size.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�]�w�����i�H�����{��
        // �bPane �e�����[�J����
        addComponentsToPane(frame.getContentPane());
        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        JMenu menu1 = new JMenu("File");
        menuBar.add(menu1);
        frame.setVisible(true);
       
    }
    private void InitializePattern() {
    	//Initialize Decorator
    	sDoc = new StyleDocument();
        Tpane.setDocument(sDoc);
    	Init_Word word = new Style_Word();
    	fontcolor_btn.addActionListener(new Button_ColorChooser(word));
    	bold_btn.addActionListener(new Button_Bold(word));
    	italic_btn.addActionListener(new Button_Italic(word));
    	underline_btn.addActionListener(new Button_Underline(word));
    	strikethrough_btn.addActionListener(new Button_Strikethrough(word));
        // undo_btn.addActionListener(new Button_Undo(word));
        // redo_btn.addActionListener(new Button_Redo(word));
    }

}