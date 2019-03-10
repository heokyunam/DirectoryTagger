package test.java.com.overtheinfinite.directorytagger.directoryfinder;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.json.JSONArray;

import junit.framework.TestCase;
import main.java.com.overtheinfinite.directorytagger.Config;
import main.java.com.overtheinfinite.directorytagger.directoryfinder.FileManager;
import main.java.com.overtheinfinite.directorytagger.directoryfinder.TaggedFileFinder;
import main.java.com.overtheinfinite.directorytagger.directoryfinder.TaggedFileManager;

public class TestFileManager extends TestCase {
	// 파일을 찾고 JSON으로 알맞게 저장, 로드하는지 확인
	public void testFindInner() {
		TaggedFileFinder df = new TaggedFileFinder();
		FileManager fm = new FileManager();
		
		TaggedFileManager tfManager = new TaggedFileManager("C:\\Users\\heokyunam\\eclipse-workspace\\DirectoryTagger\\test\\");
		
		JSONArray array = tfManager.ToJSONArray();
		
		try {
			fm.save(Config.FILE_TAGGED_FILE_LIST, array);
			
			JSONArray loadedArray = fm.load(Config.FILE_TAGGED_FILE_LIST);
			
			assertEquals(loadedArray.length(), 5);
			
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
}
