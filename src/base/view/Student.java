package base.view;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Student {

	public static String readLineFromFile(String filePath, int lineNum) {
		String path = filePath;
		String lineTxt = "";

		try (Stream<String> lines = Files.lines(Paths.get(path))) {
			lineTxt = lines.skip(lineNum).findFirst().get();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return lineTxt;
	}

	public static String writeLineToFile(String filePath, int n) {
		return null;
	}

	public static String getFileContents(String filePath) {
		List<String> fileContent = new ArrayList<>();
		try {
			fileContent = Files.readAllLines(Paths.get(filePath));
		} catch (IOException e) {
			e.printStackTrace();
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < fileContent.size(); i++) {
			sb.append(fileContent.get(i));
			sb.append("\n");
		}
		return sb.toString();
	}

	public static List<String> getRecentFilesPaths() {
		String recentFilesFile = P.recentFilesFile;
		List<String> lines = new ArrayList<>();
		try {
			lines = Files.readAllLines(Paths.get(recentFilesFile));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines;
	}

}
