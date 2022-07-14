package base.view.preferences.themes;

import java.awt.Color;

public class CustomTheme extends Themes{
	
	private Color mainForeground = new Color(0, 0, 0);
	private Color supplementaryForeground = new Color(0, 0, 0);
	private Color complementaryForeground = new Color(0, 0, 0);
	private Color mainBackground = new Color(0, 0, 0);
	private Color supplementaryBackground = new Color(0, 0, 0);
	private Color complementaryBackground = new Color(0, 0, 0);

	protected CustomTheme() {
		
	}
	
	protected static CustomTheme customTheme = new CustomTheme();

	@Override
	public Color getMainForeground() {
		return mainForeground;
	}

	public void setMainForeground(Color mainForeground) {
		this.mainForeground = mainForeground;
	}

	@Override
	public Color getSupplementaryForeground() {
		return supplementaryForeground;
	}

	public void setSupplementaryForeground(Color supplementaryForeground) {
		this.supplementaryForeground = supplementaryForeground;
	}

	@Override
	public Color getComplementaryForeground() {
		return complementaryForeground;
	}

	public void setComplementaryForeground(Color complementaryForeground) {
		this.complementaryForeground = complementaryForeground;
	}

	@Override
	public Color getMainBackground() {
		return mainBackground;
	}

	public void setMainBackground(Color mainBackground) {
		this.mainBackground = mainBackground;
	}

	@Override
	public Color getSupplementaryBackground() {
		return supplementaryBackground;
	}

	public void setSupplemantaryBackground(Color supplementaryBackground) {
		this.supplementaryBackground = supplementaryBackground;
	}

	@Override
	public Color getComplementaryBackground() {
		return complementaryBackground;
	}

	public void setComplemantryBackground(Color complementaryBackground) {
		this.complementaryBackground = complementaryBackground;
	}

	
}
