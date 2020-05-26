/** 2020. 5. 21. 오후 4:06:29
 * @author ventulus95
 */
package summer_WinterCoding;

import java.util.LinkedList;
import java.util.Queue;

public class A_18 {
	
	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		int answer = 0;
		for(int i =0; i<skill_trees.length; i++){
			Queue<Character> iq = new LinkedList<>();
			Queue<Character> oq = new LinkedList<>();
			String temp = skill_trees[i];
			for(int k =0; k<temp.length(); k++){
				iq.add(temp.charAt(k));
			}
			for(int j =0; j<skill.length(); j++){
				char index = skill.charAt(j);
				boolean checker = true;
				while(!oq.isEmpty()){
					char tt = oq.poll();
					if( tt == index){
						oq.add(tt);
						checker =false;
						break;
					}
					else{
						oq.add(tt);
					}
				}
				while(!iq.isEmpty()){
					char t = iq.poll();
					if(t == index){
						oq.add(t);
						break;
					}
					else{
						oq.add(t);
					}
				}
				if(j>0 && iq.isEmpty() == true && checker == true){
					answer++;
					break;
				}
			}
		}
		System.out.println(answer);

	}

}
