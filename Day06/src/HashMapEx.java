
// import java.util.*;
import java.util.Map;
import java.util.HashMap; 
import java.util.List; 
import java.util.ArrayList; 
import java.util.Iterator;

public class HashMapEx {

	public static void main(String[] args) {
		
		Map map = new HashMap();
		
		map.put("name", "Ãß»ó¿±");
		map.put("age", 29);
		map.put("grade", "ÆÀÀå");
		
		System.out.println("ÀÌ¸§ : " + map.get("name"));
		System.out.println("³ªÀÌ : " + map.get("age"));
		System.out.println("Á÷Ã¥ : " + map.get("grade"));
		
		//--- List ¿¡ »ç¿ë 
		List company = new ArrayList(); 
		
		for(int i = 0; i < 50; i++) { 
			Map employee = new HashMap(); 
			employee.put("name", "Ãß»ó¿±_" + i);
			employee.put("age", 29 + i);
			employee.put("grade", "ÆÀÀå_" + i);
			company.add(employee);
			
		}
		
		System.out.println(company);
		
		//-- Student °´Ã¼ ³Ö±â 
		List school = new ArrayList(); 
		
		for(int i = 0; i < 50; i++) { 
			Student std = new Student(); 
			std.setName("Ãß»ó¿±_" + i);
			std.setGrade(i + "ÇĞ³â");
			std.setAge(45 + i);
			school.add(std);
		}
		
		Student std_1 = (Student)school.get(2);
		std_1.sayName();
		
		Iterator it = school.iterator();
		while(it.hasNext()) {
			((Student)(it.next())).sayName();
		}		
		
		
	}
	
}