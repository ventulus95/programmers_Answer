/** 2020. 5. 26. 오후 10:42:38
 * @author ventulus95
 */
package stack_queue;

public class Tower {

	public static void main(String[] args) {
		int[] heights = {1,5,3,6,7,6,5};
		int[] answer = new int[heights.length];
		
		for(int i=heights.length-1; i>0; i-- ){
			int t = heights[i];
			for(int j=i-1; j>0; j--){
				if(t<heights[j]){
					answer[i] = j+1;
					break;
				}
			}
		}
		System.out.println(answer.toString());
	}

}
