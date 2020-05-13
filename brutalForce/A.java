/** 2020. 4. 20. 오후 7:00:36
 * @author ventulus95
 */
package brutalForce;

import java.util.LinkedList;

public class A {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		int[] answers ={5,5};
		int max =0; 
		int[] answer = {0,0,0};
		for(int i=0; i<answers.length; i++){
			int curr = answers[i];
			if(a[i%a.length] == curr)  answer[0]++; 
			if(b[i%b.length] == curr)  answer[1]++;
			if(c[i%c.length] == curr)  answer[2]++;
		}
		max =Math.max(max, Math.max(answer[0], Math.max(answer[1], answer[2])));
		int cnt = 0;
		for(int i =0; i<3; i++){
			if(max==answer[i]){
				cnt++;
			}
		}
		int[] ans = new int[cnt];
		int k =0;
		for(int i =0; i<3; i++){
			if(max==answer[i]){
				ans[k] = i+1;
			}
			k++;
		}
		System.out.println(ans[2]);
	}

}
