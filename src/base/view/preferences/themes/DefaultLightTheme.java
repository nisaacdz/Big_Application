package base.view.preferences.themes;

import java.awt.Color;

public class DefaultLightTheme extends Themes {
	private DefaultLightTheme() {

	}

	protected static DefaultLightTheme lightTheme = new DefaultLightTheme();

	@Override
	public Color getMainForeground() {
		return new Color(0, 0, 0);
	}

	@Override
	public Color getComplementaryForeground() {
		return new Color(255, 255, 0);
	}

	@Override
	public Color getSupplementaryForeground() {
		return new Color(180, 55, 55);
	}

	@Override
	public Color getMainBackground() {
		return new Color(220, 220, 255);
	}

	@Override
	public Color getComplementaryBackground() {
		return new Color(0, 55, 55);
	}

	@Override
	public Color getSupplementaryBackground() {
		return new Color(230, 230, 230);
	}

}
