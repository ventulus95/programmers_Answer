/** 2020. 5. 27. 오전 3:38:49
 * @author ventulus95
 */
package stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class Printer {

	public static void main(String[] args) {
		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location = 0;
		Queue<Integer> q = new LinkedList();
		for(int i =0; i<priorities.length; i++){
			q.add(i);
		}
		int cnt =1;
		while(!q.isEmpty()){
			int k = q.poll();
			int p = priorities[k];
			boolean checker = true;
			for(int i =0; i<priorities.length; i++){
				if(i!=k && priorities[i] != -1){
					if(p<priorities[i]){
						q.add(k);
						checker = false;
						break;
					}
				}
			}
			if(checker == true && k==location){
				break;
			} 	
			if(checker == true ){
				cnt++;
				priorities[k] = -1;
			}
		}
		System.out.println(cnt);
	}

}
