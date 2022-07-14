package base.view.workspace;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.nio.file.Path;

import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;

import base.view.C;
import base.view.P;
import base.view.Student;
import base.view.popUps.WorkspacePop;
import base.view.preferences.themes.Themes;

public class Workspace extends JScrollPane {

	public static final long serialVersionUID = 1L;

	private JTextPane textArea;
	private WorkspacePop popup;

	public Workspace(File file) {
		int vsb = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int hsb = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		this.setPreferredSize(new Dimension(C.cWidth, C.cHeight));
		this.setVerticalScrollBarPolicy(vsb);
		this.setHorizontalScrollBarPolicy(hsb);

		textArea = new JTextPane();

		Themes theme1 = Themes.getDefaultDarkTheme();
		textArea.setForeground(theme1.getMainForeground());
		textArea.setFont(P.roman18);
		textArea.setBackground(theme1.getMainBackground());
		String content = Student.getFileContents(file.getAbsolutePath());
		textArea.setText(content);

		popup = new WorkspacePop();
		this.add(popup);
		addAllListeners();
		this.setViewportView(textArea);
	}

	public Workspace(Path filePath) {
		int vsb = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int hsb = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		this.setPreferredSize(new Dimension(C.cWidth, C.cHeight));
		this.setVerticalScrollBarPolicy(vsb);
		this.setHorizontalScrollBarPolicy(hsb);

		textArea = new JTextPane();

		Themes theme1 = Themes.getDefaultLightTheme();
		textArea.setForeground(theme1.getMainForeground());
		textArea.setFont(P.roman18);
		textArea.setBackground(theme1.getMainBackground());
		String content = Student.getFileContents(filePath.toString());
		textArea.setText(content);

		popup = new WorkspacePop();
		this.add(popup);
		addAllListeners();
		this.setViewportView(textArea);
	}

	public Workspace(String filePath) {
		int vsb = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int hsb = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		this.setPreferredSize(new Dimension(C.cWidth, C.cHeight));
		this.setVerticalScrollBarPolicy(vsb);
		this.setHorizontalScrollBarPolicy(hsb);

		textArea = new JTextPane();

		Themes theme1 = Themes.getDefaultLightTheme();
		textArea.setForeground(theme1.getMainForeground());
		textArea.setFont(P.roman18);
		textArea.setBackground(theme1.getMainBackground());
		String content = Student.getFileContents(filePath);
		textArea.setText(content);

		popup = new WorkspacePop();
		this.add(popup);
		addAllListeners();
		this.setViewportView(textArea);
	}

	public Workspace() {
		int vsb = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int hsb = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		this.setPreferredSize(new Dimension(C.cWidth, C.cHeight));
		this.setVerticalScrollBarPolicy(vsb);
		this.setHorizontalScrollBarPolicy(hsb);

		textArea = new JTextPane();

		Themes theme1 = Themes.getDefaultLightTheme();
		textArea.setForeground(theme1.getMainForeground());
		textArea.setFont(P.roman18);
		textArea.setBackground(theme1.getMainBackground());

		popup = new WorkspacePop();
		this.setLayout(null);
		this.add(popup);
		addAllListeners();
		this.setViewportView(textArea);
	}

	public void addAllListeners() {
		textArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (SwingUtilities.isRightMouseButton(e)) {
					WorkspacePop popup = new WorkspacePop();
					popup.setVisible();
				} else {
					popup.setVisible(false);
				}
			}
		});
	}

	public void save() {

	}

	public void firstSave() {

	}
}
