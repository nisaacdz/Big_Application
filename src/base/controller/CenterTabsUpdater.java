package base.controller;

import java.io.File;
import java.util.List;

import base.view.HomeView;
import base.view.Student;
import base.view.workspace.Workspace;

public class CenterTabsUpdater {

	public static void UpdateWorkSpaces() {
		List<String> recentFilesFile = Student.getRecentFilesPaths();
		try {
			int index = 0;
			for (String filePath : recentFilesFile) {
				File file = new File(filePath);

				Workspace workspace = new Workspace(file);
				HomeView.getCenterTab().add(workspace);
				HomeView.getCenterTab().setTitleAt(index, file.getName());
				index++;
			}
			Workspace untitled = new Workspace();
			HomeView.getCenterTab().add(untitled);
			HomeView.getCenterTab().setTitleAt(index, "Untitled");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
