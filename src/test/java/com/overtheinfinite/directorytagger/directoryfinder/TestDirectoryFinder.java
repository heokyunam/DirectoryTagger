package test.java.com.overtheinfinite.directorytagger.directoryfinder;

import java.io.File;
import java.util.List;

import org.json.JSONArray;

import junit.framework.TestCase;
import main.java.com.overtheinfinite.directorytagger.directoryfinder.TaggedFileFinder;

public class TestDirectoryFinder extends TestCase {	
	// �ܼ��� ���� ���丮���� �˸°� ã���� Ȯ��
	public void testFindInner() {
		TaggedFileFinder df = new TaggedFileFinder();
		List<File> list = df.findInner("C:\\Users\\heokyunam\\eclipse-workspace\\DirectoryTagger\\test");
		
		assertEquals(list.size(), 5);
	}
}
