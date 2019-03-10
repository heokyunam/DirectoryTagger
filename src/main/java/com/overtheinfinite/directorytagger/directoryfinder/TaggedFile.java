package main.java.com.overtheinfinite.directorytagger.directoryfinder;

import java.io.File;

import org.json.JSONObject;

public class TaggedFile {
	private String path;
	private String directory;
	private String name;
	
	public TaggedFile(File file) {
		this.path = file.getAbsolutePath();
		this.directory = file.getParentFile().getAbsolutePath();
		this.name = file.getName();
	}
	
	public TaggedFile(String path, String directory, String name) {
		super();
		this.path = path;
		this.directory = directory;
		this.name = name;
	}
	
	public String getPath() {
		return path;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
	public String getDirectory() {
		return directory;
	}
	
	public void setDirectory(String directory) {
		this.directory = directory;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public JSONObject ToJSONObject() {
		JSONObject objFile = new JSONObject();
		objFile.put("path", this.path);
		objFile.put("directory", this.directory);
		objFile.put("name", this.name);
		return objFile;
	}
}
