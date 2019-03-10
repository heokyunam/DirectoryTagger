package main.java.com.overtheinfinite.directorytagger.directoryfinder;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class TaggedFileFinder {
	public List<File> findInner(String directory) {		
		File file = new File(directory);

		List<File> list = findInnerRecursive(file);
		
		return list;
	}
	
	private List<File> findInnerRecursive(File file) {
		File[] files = file.listFiles();
		List<File> list = new LinkedList<File>();
		
		if(files != null) {
			for(int i = 0; i < files.length; i++) {
				List<File> innerList = findInnerRecursive(files[i]);
				
				for(int j = 0; j < innerList.size(); j++) {
					list.add(innerList.get(j));
				}
			}
		}
		
		list.add(file);
		
		return list;
	}
}
