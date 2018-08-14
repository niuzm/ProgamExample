import java.util.LinkedList;
import java.util.Scanner;

public class Quarrel {
	public static void main(String[] args) {

		long startTime=System.currentTimeMillis(); 
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] chars = s.toCharArray();
		LinkedList<Character> charlist=new LinkedList<>();
		boolean flag=true;
		for (char c : chars) {
			charlist.add(c);
		}
		for (int i = 0; i < charlist.size()-1; i++) {
			if(charlist.get(i)=='R'&&charlist.get(i+1)=='L') {
				if(i-1>=0&&charlist.get(i-1)=='L') { 
					charlist.remove(i+1);
				}else {
					charlist.remove(i);
				}
				i=0;
			}
		}
		long endTime=System.currentTimeMillis();
		long time=endTime-startTime;
		System.out.println(charlist.size()+"--"+time);
	}
}
