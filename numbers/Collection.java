package numbers;

import java.util.ArrayList;
import java.util.Collections;

public class Collection {
	public static ArrayList<UDO> udo = new ArrayList<UDO>();
	public Collection(UDO udo){
		this.udo.add(udo);
	}
	
	public void display(){
		for(int i=0;i<this.udo.size();i++){
			System.out.println("Name: "+udo.get(i).name+" Age: "+udo.get(i).age);
			
		}
	}
}
