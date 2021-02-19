package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test{
	

	
	
	
	public static int minPartition(List usedspace, List totalSpace) {
		
		Collections.sort(usedspace, Collections.reverseOrder());
		Collections.sort(totalSpace, Collections.reverseOrder());
		List totalSpacebefore = new ArrayList();;
		totalSpacebefore.addAll(totalSpace);
		for(int i = 0; i< usedspace.size(); i++) {
			//System.out.println(usedspace.get(i));
			//System.out.println(totalSpace.get(i));
			for(int j = 0; j < totalSpace.size(); j++) {
				if((int)usedspace.get(i)<=(int)totalSpace.get(j)) {
					//then shift the amount of usedspace to total space
					//keep the remaining amount in total space
					//and break out of this loop.
					//System.out.println(usedspace.get(i)+"  "+totalSpace.get(j));
					int temp = (int)totalSpace.get(j) - (int)usedspace.get(i);
					totalSpace.set(j, temp);
					//System.out.println(totalSpace.get(j));
					break;
					
					
				}
			}
		}
		
		List<Integer> toReturn = new ArrayList<>(totalSpace);
		   toReturn.removeAll(totalSpacebefore);
		   
		   
		System.out.println(toReturn.size());
		//for(int i = 0; i< toReturn.size(); i++) {
			//System.out.println(toReturn.get(i));
		//}
		
		return toReturn.size();
	}
	
	public static void main(String[] args) {
		ArrayList usedspace = new ArrayList(10);
		ArrayList totalSpace = new ArrayList(10);
		
		usedspace.add(10);
		usedspace.add(20);
		usedspace.add(4);
		usedspace.add(6);
		usedspace.add(40);
		usedspace.add(20);
		usedspace.add(7);
		usedspace.add(3);
		usedspace.add(3);
		usedspace.add(1);
		
		//usedspace.add(3);
		//usedspace.add(1);
		
		totalSpace.add(20);
		totalSpace.add(20);
		totalSpace.add(50);
		totalSpace.add(10);
		totalSpace.add(30);
		totalSpace.add(5);
		totalSpace.add(8);
		totalSpace.add(20);
		totalSpace.add(40);
		totalSpace.add(10);
		
		//totalSpace.add(5);
		//totalSpace.add(5);
		
		
		int number = minPartition(usedspace,totalSpace);
		System.out.println(number);
		
		
	}
	
	

}
