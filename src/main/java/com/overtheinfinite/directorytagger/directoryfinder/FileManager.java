package main.java.com.overtheinfinite.directorytagger.directoryfinder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;

public class FileManager {
	public void save(String filename, JSONArray array) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
		
		writer.write(array.toString());
		
		writer.flush();
		
		writer.close();
	}
	
	public JSONArray load(String filename) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(filename));
		
		JSONArray array = new JSONArray(reader.readLine());
		
		reader.close();
		
		return array;
	}
}
