import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {

	public static void main(String[] args) {
		
		{
			List<String> array = new ArrayList<String>();
			
			array.add("hoge");
			array.add("pos");
			array.add("foo");
			
			array.set(1, "bar");
		
			System.out.println(array.get(2) + "のインデックス:2");
			
		}
		
		{
			Map<String, Object> map = new HashMap<>();
			
			map.put("address","/////");
			map.put("name","kousuke");
			map.put("age","29");
			
			for (String key : map.keySet()) {
				System.out.println("key: " + key);
			}
			for (Object val : map.values()) {
				System.out.println("value: " + val);
			}
		 }	
		
		 {
			Calendar cal = Calendar.getInstance();
			
			int[] arrayDate = new int[3];
			
			arrayDate[0] = cal.get(Calendar.YEAR);
		    arrayDate[1] = cal.get(Calendar.MONTH + 1 );
		    arrayDate[2] = cal.get(Calendar.DAY_OF_MONTH);
			
			List<int[]> list = Arrays.asList(arrayDate);
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		 }

	}
}
