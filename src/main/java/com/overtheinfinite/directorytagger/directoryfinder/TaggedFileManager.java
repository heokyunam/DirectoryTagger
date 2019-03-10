package main.java.com.overtheinfinite.directorytagger.directoryfinder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;

public class TaggedFileManager {
	private List<TaggedFile> taggedFileList;
	
	public TaggedFileManager(String directory) {
		this.taggedFileList = new ArrayList<TaggedFile>();
		TaggedFileFinder finder = new TaggedFileFinder();
		List<File> files = finder.findInner(directory);
		
		for(int i = 0; i < files.size(); i++) {
			TaggedFile taggedFile = new TaggedFile(files.get(i));
			this.taggedFileList.add(taggedFile);
		}
	}
	
	public JSONArray ToJSONArray() {
		JSONArray array = new JSONArray();
		
		if(taggedFileList != null) {			
			for(int i = 0; i < taggedFileList.size() ; i++) {
				TaggedFile taggedFile = taggedFileList.get(i);
				array.put(taggedFile.ToJSONObject());
			}
		}
		
		return array;
	}
}
