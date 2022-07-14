package base.view;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class Temp {

	public static void main(String[] args) throws IOException, UnsupportedFlavorException{

		Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
		Object paste = cb.getData(DataFlavor.stringFlavor);
		
		System.out.println(paste);

	}
}
