/** 2020. 5. 5. 오후 10:11:55
 * @author ventulus95
 * 총 걸린 시간: 1:08:33
 */
package kakaoBilnd2020;

import java.util.Stack;

public class A {

	public static void main(String[] args) {
		String tc = "xababcdcdababcdcd";
		int min = tc.length();
		for(int i=1; i<tc.length(); i++){
			String zipStand = tc.substring(0, i);
			StringBuilder checker = new StringBuilder();
			Stack<String> stack = new Stack();
			stack.add(zipStand);
			for(int j=i; j<tc.length(); j+=i){
				if(j+i<=tc.length()){
					String dis = tc.substring(j, j+i);
					if(zipStand.equals(dis)){	
						stack.add(dis);
					}
					else{
						if(stack.size()>=2){
							checker.append(stack.size());
						}
						checker.append(stack.pop());
						stack.removeAllElements();
						zipStand = dis;
						stack.add(zipStand);
					}
				}
			}
			if(!stack.isEmpty()){
				if(stack.size()>=2)
					checker.append(stack.size());
				checker.append(stack.pop());
			}
			if(tc.length()%i >0)
				checker.append(tc.substring(tc.length()-(tc.length()%i)));
			min = Math.min(min, checker.length());
		}
		System.out.println(min);
	}

}
