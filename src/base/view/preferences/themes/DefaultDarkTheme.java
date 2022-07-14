package base.view.preferences.themes;

import java.awt.Color;

public class DefaultDarkTheme extends Themes {
	private DefaultDarkTheme() {

	}

	protected static DefaultDarkTheme darkTheme = new DefaultDarkTheme();

	@Override
	public Color getMainForeground() {
		return new Color(255, 255, 255);
	}

	@Override
	public Color getComplementaryForeground() {
		return new Color(0, 255, 255);
	}

	@Override
	public Color getSupplementaryForeground() {
		return new Color(239, 228, 176);
	}

	@Override
	public Color getMainBackground() {
		return new Color(30, 30, 30);
	}

	@Override
	public Color getComplementaryBackground() {
		return new Color(0, 0, 0);
	}

	@Override
	public Color getSupplementaryBackground() {
		return new Color(88, 88, 88);
	}

}
