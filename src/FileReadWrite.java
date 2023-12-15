import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class FileReadWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	String fileName="C:\\Users\\ashvi\\eclipse-workspace\\oop\\first.properties";
	readPropertyFile(fileName);
	writePropertyFile("C:\\Users\\ashvi\\eclipse-workspace\\oop\\info.properties");
	readTextFile("C:\\Users\\ashvi\\eclipse-workspace\\oop\\src\\second.txt");
	System.out.println("Gitstuff1");
	}

private static void readTextFile(String fileName3) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(new File(fileName3));
		while(s.hasNextLine()) {
			System.out.println(s.nextLine());
		}
		s.close();
	}

private static void writePropertyFile(String fileName1) throws IOException {
		// TODO Auto-generated method stub
	File f1=new File(fileName1);
	FileWriter fw=new FileWriter(f1);
	Properties p1=new Properties();
	p1.setProperty("Branch", "Finance");
	p1.setProperty("Sector", "IT");
	p1.store(fw, "Information about company");
	fw.close();
	
	}

public static void readPropertyFile(String fileName) throws IOException
{
File f=new File(fileName);
FileReader fr=new FileReader(f);
Properties p=new Properties();
p.load(fr);
Set<Entry<Object,Object>> s=p.entrySet();
Iterator i=s.iterator();
while(i.hasNext()) {
	Map.Entry<Object,Object> entry=(Map.Entry) i.next();
	System.out.println((String)entry.getKey()+" : "+(String)entry.getValue());
}

fr.close();



}

}

