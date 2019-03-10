package main.java.com.overtheinfinite.directorytagger.addtag;

public class Tag {
	private String tagCode, tagName;

	public Tag(String tagCode, String tagName) {
		this.tagCode = tagCode;
		this.tagName = tagName;
	}

	public String getTagCode() {
		return tagCode;
	}

	public void setTagCode(String tagCode) {
		this.tagCode = tagCode;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
	
}
