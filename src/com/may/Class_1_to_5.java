package com.may;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.logging.Logger;

/*
1. clonableInterface								      			= Done	
2. Serialization example											= DOne					 
3. Count Number of repeating Character in String like "Ravindra:	= 	
4. JXAB example with Marshaling and UnMarshaling.
5. JSON read and write 												= 
6. JSON to XML
7. XML to JSON
8. Implement Logger in this class  = Done
9. Properties file also use here.  = Done
*/

abstract class Abst{
	
	public abstract void data();
	Abst(){
		
	}
	
	public void getList(){
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("A");
		list.add("A");
		list.add("A");
		list.add("A");
		list.add("A");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}
	}
}

class ExAbstract extends Abst{

	@Override
	public void data() {
		// TODO Auto-generated method stub
		
	}
	
	
}
class CloTest {

	String str = "Hello";
	String str2 = "Hello2";

	CloTest() {
		System.out.println("Clonable clas : " + str);
	}
}

class clonableInterface implements Cloneable, Runnable {

	private String name;
	private String address;

	private final static Logger LOGGER = Logger.getLogger(clonableInterface.class.getName());

	public clonableInterface(String str, String str1) {

		this.name = str;
		this.address = str1;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		LOGGER.info("Success Full");
		return "Name : " + getName() + " , Address : " + getAddress();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}

class Serial implements Serializable {

	/**
	 * 
	 */

	private final static Logger LOGGER = Logger.getLogger(Serial.class.getName());
	private static final long serialVersionUID = 1L;
	private String name;
	private String id;
	private transient String address;

	public Serial(String str, String str1, String str2) {
		LOGGER.info("Inside Constructor");
		this.name = str;
		this.address = str1;
		this.id = str2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void testSer() throws IOException, ClassNotFoundException {
		LOGGER.info("Inside testSer");
		Serial a = new Serial(this.name, this.address, this.id);
		FileOutputStream fos = new FileOutputStream("xyz.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a);

		// De-serializing 'a'
		FileInputStream fis = new FileInputStream("xyz.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Serial b = (Serial) ois.readObject();// down-casting object

		System.out.println(b.address + " " + b.name);

		// closing streams
		oos.close();
		ois.close();
		LOGGER.info("Close testSer");
	}

	@Override
	public String toString() {

		return "Name : " + getName() + " , Address : " + getAddress() + " , " + getId();

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serial other = (Serial) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

/*
 * JSON Read and Write class
 */
class JsonReadWrite {

	public void demo() {
		/*JSONObject obj = new JSONObject();
		obj.put("name", "mkyong.com");
		obj.put("age", 100);

		JSONArray list = new JSONArray();
		list.add("msg 1");
		list.add("msg 2");
		list.add("msg 3");

		obj.put("messages", list);

		try (FileWriter file = new FileWriter("c:\\projects\\test.json")) {
			file.write(obj.toJSONString());
		} catch (IOException e) {
			e.printStackTrace();
		}*/
	}
}

/*
 * Main class here...
 */
public class Class_1_to_5 {

	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
		// TODO Auto-generated method stub

		CloTest c1 = new CloTest();
		CloTest c2 = c1;

		System.out.println(c1.str);
		System.out.println(c2.str);

		// Clonable Inter face call
		clonableInterface clon1 = new clonableInterface("Ravi", "Pune");
		clonableInterface clon2 = (clonableInterface) clon1.clone();
		System.out.println(clon2.toString());

		Serial objSerial = new Serial("Ravindra", "Delhi", "12345678");
		objSerial.testSer();

		final Logger LOGGER = Logger.getLogger(Class_1_to_5.class.getName());

		/*
		 * FileReader newFile = new FileReader("uat.properties"); Properties pro
		 * = new Properties();
		 */
		/*
		 * pro.load(newFile); System.out.println(pro.getProperty("Name"));
		 * System.out.println(pro.getProperty("Address"));
		 */

		Properties p = System.getProperties();
		Set set = p.entrySet();

		LOGGER.info("Properties Details ");
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}

	}

}
