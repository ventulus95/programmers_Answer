/** 2020. 4. 19. 오후 7:08:30
 * @author ventulus95
 */
package hash;

import java.util.HashMap;

public class A {

	public static void main(String[] args) {
		String[] participant={"mislav", "stanko", "mislav", "ana"}, completion={"stanko", "ana", "mislav"};
		HashMap<String, Integer> table = new HashMap<>();
		for(String name : participant){
			if(table.containsKey(name)){
				int scnt = table.get(name);
				table.put(name, scnt+1);
			}
			else{
				table.put(name, 0);
			}
		}
		for(String name : completion){
			if(table.containsKey(name)){
				if(table.get(name)>0){
					int num = table.get(name);
					table.replace(name, num-1);
				}
				else{
					table.remove(name);
				}
			}
		}
		String answer = table.keySet().toString();
		System.out.print(answer.substring(1, answer.length()-1));
	}

}
