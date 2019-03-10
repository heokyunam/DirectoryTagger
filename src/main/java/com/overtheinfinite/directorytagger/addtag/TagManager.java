package main.java.com.overtheinfinite.directorytagger.addtag;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class TagManager {
	private List<Tag> taglist;
	
	public JSONArray ToJSONArray() {
		JSONArray array = new JSONArray();
		
		if(taglist != null) {
			for(int i = 0; i < taglist.size(); i++) {
				JSONObject objTag = new JSONObject();
				
				objTag.put("code", taglist.get(i).getTagCode());
				objTag.put("name", taglist.get(i).getTagName());
				
				array.put(objTag);				
			}			
		}
		
		return array;
	}
}
