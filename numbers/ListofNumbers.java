package numbers;

import java.util.Vector;

public class ListofNumbers {
	public static Vector<Integer> v  =new Vector<Integer>();
	public ListofNumbers(){
		
		for(int i=0;i<10;i++){
			v.add(i);
		}
	}
	
	public void writeList(){
		for(int i=0;i<10;i++){
			System.out.println(v.get(i));
		}
	}

}
