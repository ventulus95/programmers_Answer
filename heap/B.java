/** 2020. 4. 19. 오후 8:24:25
 * @author ventulus95
 */
package heap;

import java.util.PriorityQueue;

public class B {

	public static void main(String[] args) {
		int stock=4, k=30;
		int[] dates={4,10,15}, supplies={20,5,10};
		int answer=0;
		PriorityQueue<supply> q = new PriorityQueue<>();
		for(int i=0; i<dates.length; i++ ){
			q.add(new supply(dates[i], supplies[i]));
		}
		for(int i=1; i<=k; i++){
			stock--;
			if(!q.isEmpty() && q.peek().date == i){
				if(stock<=0){
					stock += q.poll().supply;
					answer++;
				}
				else{
					supply temp = q.peek();
					int demand;
					if(q.size() <= 1 ){
						demand = k-temp.date ;
					}
					else{
						demand = temp.date - i;
					}
					if(stock-demand<=0){
						stock += temp.supply;
						answer++;
					}
					q.poll();
						

				}
			}
		}
		System.out.println(answer);
	}

}

class supply implements Comparable<supply>{
	int date;
	int supply;

	public supply(int date, int supply) {
		this.date = date;
		this.supply = supply;
	}

	@Override
	public int compareTo(supply o) {
		if(this.date > o.date)
			return 1;
		return -1;
	}
}