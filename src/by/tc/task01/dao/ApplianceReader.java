package by.tc.task01.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApplianceReader {
	private final String path;

	public ApplianceReader(String path) {
		this.path = path;
	}

	public List<String> take() throws IOException {
		List<String> devicesList = new ArrayList<String>();
		BufferedReader reader = null;
		try {
			String currentLine;
			reader = new BufferedReader(new FileReader(this.path));
			while ((currentLine = reader.readLine()) != null) {
				devicesList.add(currentLine);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {	
			reader.close();
		}
		return devicesList;
	}

	public List<String> take(String groupName) throws IOException {
		List<String> devicesList = new ArrayList<String>();
		BufferedReader reader = null;
		try {
			String currentLine;
			reader = new BufferedReader(new FileReader(this.path));
			while ((currentLine = reader.readLine()) != null) {
				if (currentLine.contains(groupName)) {
					devicesList.add(currentLine);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {	
			reader.close();
		}

		return devicesList;
	}

	public String getPath() {
		return path;
	}
}