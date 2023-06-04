/* 
	The place where all data process activies occur
 */


package data.crawl;

// used classes
import java.util.*;						// Container
import data.crawl.SearchLink;				// self
import data.crawl.ExtractData;
import data.crawl.character.wiki.SearchLinkCharacter;
import data.crawl.character.wiki.ExtractHistoricalCharacter;


public class DataGround {
	
	public static void main(String[] args) {
		// setup
		SearchLinkCharacter seacher = new SearchLinkCharacter();
		ExtractHistoricalCharacter extractor = new ExtractHistoricalCharacter();
		DataControler controler = new DataControler(seacher, extractor);
		// Search links
		String urlSeed = "https://vi.wikipedia.org/wiki/Nh%C3%A0_Tri%E1%BB%87u";
		String fileUrl = "/home/minh/School/Learning/20222/OOP/ProjectOOP20222/Data/Database/url/historical-character/url#1";
		controler.searchLinkIntoFile(urlSeed, 3, 50, fileUrl);
		// Extract data
		String databaseFile = "/home/minh/School/Learning/20222/OOP/ProjectOOP20222/Data/Database/historical-character/hc#1.json";
		String attributeFile = "/home/minh/School/Learning/20222/OOP/ProjectOOP20222/Data/DataConfigure/attributeHistoricalCharacter.json";
		String readableFile = "/home/minh/School/Learning/20222/OOP/ProjectOOP20222/Data/Database/readable/hc#1";
		controler.extractUrlFile(fileUrl, databaseFile);
		controler.reWriteData(databaseFile, readableFile, attributeFile);
	}	// close main
}	// close DataGround