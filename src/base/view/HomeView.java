package base.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;


import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;

import base.controller.CenterTabsUpdater;
import base.view.preferences.themes.Themes;

public class HomeView {

	private static JFrame frame;
	private static JPanel top;
	private static JPanel center;
	private static JPanel bottom;

	private static JScrollPane lPane;
	private static JTabbedPane cPane;
	private static JScrollPane rPane;

	private static JSplitPane cr;
	private static JSplitPane lcr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					initialize();
					frame.setVisible(true);
					cr.resetToPreferredSizes();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private static void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		frame.setSize(C.pcSize);
		frame.setBackground(Color.BLACK);

		Themes theme = Themes.getDefaultLightTheme();
		top = new JPanel();
		top.setBackground(theme.getMainBackground());

		center = new JPanel();
		center.setBackground(theme.getSupplementaryBackground());

		bottom = new JPanel();
		bottom.setBackground(theme.getComplementaryBackground());

		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup().addGap(P.Xa)
						.addComponent(top, GroupLayout.DEFAULT_SIZE, C.mWidth, Short.MAX_VALUE).addGap(P.Xa))
				.addGroup(groupLayout.createSequentialGroup().addGap(P.Xb)
						.addComponent(center, GroupLayout.DEFAULT_SIZE, C.pWidth, Short.MAX_VALUE).addGap(P.Xb))
				.addGroup(groupLayout.createSequentialGroup().addGap(P.Xc)
						.addComponent(bottom, GroupLayout.DEFAULT_SIZE, C.bWidth, Short.MAX_VALUE).addGap(P.Xc)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(P.H1)
						.addComponent(top, GroupLayout.DEFAULT_SIZE, C.mHeight, Short.MAX_VALUE).addGap(P.H2)
						.addComponent(center, GroupLayout.DEFAULT_SIZE, C.pHeight, Short.MAX_VALUE).addGap(P.H3)
						.addComponent(bottom, GroupLayout.DEFAULT_SIZE, C.bHeight, Short.MAX_VALUE).addGap(P.HZ)));

		lPane = new JScrollPane();

		cPane = new JTabbedPane();
		rPane = new JScrollPane();

		cr = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, cPane, rPane);

		lcr = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, lPane, cr);

		GroupLayout layoutC = new GroupLayout(center);
		layoutC.setHorizontalGroup(
				layoutC.createParallelGroup(Alignment.LEADING).addGroup(layoutC.createSequentialGroup().addGap(0)
						.addComponent(lcr, GroupLayout.DEFAULT_SIZE, C.lcrWidth, GroupLayout.DEFAULT_SIZE).addGap(0)));
		layoutC.setVerticalGroup(
				layoutC.createParallelGroup(Alignment.LEADING).addGroup(layoutC.createSequentialGroup().addGap(0)
						.addComponent(lcr, GroupLayout.DEFAULT_SIZE, C.lcrHeight, GroupLayout.DEFAULT_SIZE).addGap(0)));
		center.setLayout(layoutC);

		cr.setDividerSize(P.D);
		cr.setBorder(BorderFactory.createCompoundBorder());
		
		lcr.setDividerSize(P.D);
		lcr.setBorder(BorderFactory.createCompoundBorder());
		lcr.setResizeWeight(C.lcrRW);

		setCenterPaneContent();

		lPane.setPreferredSize(new Dimension(C.lWidth, C.lHeight));
		cPane.setPreferredSize(new Dimension(C.cWidth, C.cHeight));
		rPane.setMaximumSize(new Dimension(C.rWidth, C.rHeight));

		frame.getContentPane().setLayout(groupLayout);
	}

	private static void setCenterPaneContent() {
		CenterTabsUpdater.UpdateWorkSpaces();
	}

	public static JTabbedPane getCenterTab() {
		return cPane;
	}
}
