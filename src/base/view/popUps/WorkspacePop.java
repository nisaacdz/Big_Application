package base.view.popUps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class WorkspacePop extends JPopupMenu {
	public static final long serialVersionUID = 1L;

	public WorkspacePop() {
		JMenuItem item0 = new JMenuItem("Undo");
		JMenuItem item1 = new JMenuItem("Redo");
		JMenuItem item2 = new JMenuItem("Save");
		JMenuItem item3 = new JMenuItem("Save As");
		JMenuItem item4 = new JMenuItem("Select All");
		JMenuItem item5 = new JMenuItem("Open With");
		JMenuItem item6 = new JMenuItem("Replace");
		JMenuItem item7 = new JMenuItem("Copy");
		JMenuItem item8 = new JMenuItem("Cut");
		JMenuItem item9 = new JMenuItem("Paste");

		addAllListeners(item0);
		addAllListeners(item1);
		addAllListeners(item2);
		addAllListeners(item3);
		addAllListeners(item4);
		addAllListeners(item5);
		addAllListeners(item6);
		addAllListeners(item7);
		addAllListeners(item8);
		addAllListeners(item9);
		
		this.add(item0);
		this.add(item1);
		this.add(item2);
		this.add(item3);
		this.add(item4);
		this.add(item5);
		this.add(item6);
		this.add(item7);
		this.add(item8);
		this.add(item9);

	}

	public void setVisible() {
		this.setVisible(true);
	}

	private void addAllListeners(JMenuItem item) {
		item.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
	}
}
