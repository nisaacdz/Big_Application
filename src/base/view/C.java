package base.view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;

public class C {
	public static Dimension pcSize = Toolkit.getDefaultToolkit().getScreenSize();

	private static String s = File.separator;
	public static File defaultFile = new File("metadata" + s + "default");
	public static File userFile = new File("metadata" + s + "user");

	private static int tolR = 8;
	private static int tolL = 8;
	private static int tolT = 31;
	private static int tolB = 8;

	public static int pcWidth = pcSize.width;
	public static int pcHeight = pcSize.height;

	public static int sHeight = pcHeight - tolT - tolB;
	public static int sWidth = pcWidth - tolR - tolL;

	public static int mHeight = (int) ((double) (sHeight * 0.062));
	public static int mWidth = sWidth - (2 * P.Xa);

	public static int bHeight = (int) ((double) (sHeight * 0.0345));
	public static int bWidth = sWidth - (2 * P.Xc);

	public static int pHeight = sHeight - P.H1 - mHeight - P.H2 - P.H3 - bHeight - P.HZ;
	public static int pWidth = sWidth - (2 * P.Xb);

	public static int lHeight = pHeight;
	public static int lWidth = (int) ((double) (sWidth * 0.18));

	public static int cHeight = pHeight;
	public static int cWidth = (int) ((double) (sWidth * 0.68));

	public static int rHeight = pHeight;
	public static int rWidth = sWidth - lWidth - cWidth;

	public static int crWidth = cWidth + rWidth;
	public static int crHeight = cHeight;

	public static int lcrWidth = pWidth;
	public static int lcrHeight = pHeight;

	public static double crRW = 0;
	public static double lcrRW = 0.2;
}
