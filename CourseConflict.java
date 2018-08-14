import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class CourseConflict {
	public static void main(String[] args) {
//		long startTime=System.currentTimeMillis(); 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<String> list=new ArrayList<String>();
		List<String> conflictList=new ArrayList<String>();
		HashMap<String,String> map=new HashMap<String,String>();
		
		for (int i = 0; i < n; i++) {
			String courseTime=sc.next();
			String courseIndex=sc.next();
			sc.nextLine();
			if(list.contains(courseTime)) {
				String index =map.get(courseTime);
				index+=" "+courseIndex;
				map.put(courseTime, index);
				conflictList.add(courseTime);
			}else {
				list.add(courseTime);
				map.put(courseTime, courseIndex);
			}
			
			
		}
		for (String string : conflictList) {
			System.out.println(string+" "+map.get(string));
		}	
		if(conflictList.isEmpty()) {
			System.out.println("YES");
		}
//		long endTime=System.currentTimeMillis();
//		long time=endTime-startTime;
//		System.out.println("--"+time);
	}
}
