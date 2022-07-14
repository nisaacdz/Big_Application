package base.view.preferences.themes;

import java.awt.Color;

public abstract class Themes {

	public static Themes getDefaultLightTheme() {
		return DefaultLightTheme.lightTheme;
	}
	public static Themes getDefaultDarkTheme() {
		return DefaultDarkTheme.darkTheme;
	}
	public static Themes creatNewCustomTheme() {
		return new CustomTheme();
	}
	
	public abstract Color getMainForeground();
	public abstract Color getComplementaryForeground();
	public abstract Color getSupplementaryForeground();
	
	public abstract Color getMainBackground();
	public abstract Color getComplementaryBackground();
	public abstract Color getSupplementaryBackground();
	
}