package miniProject;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class USDataRead {
HashMap <String, Details> MapBankobjcompdet = new HashMap<>();
public void fileLoader() {
 String path="C:\\Users\\AKRITI\\Downloads\\complaints.csv";
 String line="";
 
 try {
	BufferedReader bf=new BufferedReader(new FileReader(path));
	while ((line=bf.readLine())!=null)
	{   
		
		//String[] elements=line.split(",(?=(?:[^\"]\"[^\"]\")[^\"]$)", -1);
		String[] elements=line.split(",");
		Details objcompdet=new Details();
		objcompdet.dateReceived=elements[0];
		objcompdet.product=elements[1];
		objcompdet.subProduct=elements[2];
		objcompdet.issue=elements[3];
		objcompdet.subIssue=elements[4];
		objcompdet.company=elements[5];
		objcompdet.state=elements[6];
		objcompdet.ZIPcode=elements[7];
		objcompdet.submittedVia=elements[8];
		objcompdet.dateSentToCompany=elements[9];
		objcompdet.companyResponseToConsumer=elements[10];
		objcompdet.timelyResponse=elements[11];
		objcompdet.consumerDisputed=elements[12];
		objcompdet.consumerDisputed=elements[12];
		
		MapBankobjcompdet.put(elements[13],objcompdet); 
	}
	bf.close();
	
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 
 
}

HashMap<String,Details> GetMapBankobjcompdet(){
	
	return MapBankobjcompdet;
	
}
}