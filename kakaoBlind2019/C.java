/** 2020. 5. 6. 오후 7:37:37
 * @author ventulus95
 */
package kakaoBlind2019;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class C {

	static Queue<String> noc = new LinkedList<>(); //경우의 수 담는 큐.

	//조합 (순서관심없고 뽑은 유무만 생각)
	private static void combination(int[] comArr, int n, int r, int index, int target) {
		if(r==0){
			StringBuilder checker = new StringBuilder();
			for(int i : comArr){
				checker.append(i);// 모든 경우 다 들어감.
			}
			noc.add(checker.toString()); // 다른 케이스 시작
			return;
		}
		if(target == n)return;

		comArr[index] = target;
		combination(comArr, n, r-1, index+1, target+1);//뽑는경우
		combination(comArr, n, r, index, target+1);//안뽑는경우
	}

	public static void main(String[] args) {
		String[][] relation = new String[10][7];
		int row = relation.length;
		int n = relation[0].length;
		ArrayList<Integer> cobnum = new ArrayList<Integer>();
		Set<String> dupChecker = new HashSet<>();
		for(int i =0; i<n; i++){
			cobnum.add(i);
		}
		int[] comArr = new int [1];
		combination(comArr, n, 1, 0, 0);
		while(!noc.isEmpty()){
			String tc = noc.poll();
			StringBuilder temp;
			for(int j=0; j<row; j++){
				temp = new StringBuilder();
				for(int i =0; i<tc.length(); i++){
					int index = tc.charAt(i)-'0';
					temp.append(relation[j][index]);
				}
				if(dupChecker.contains(temp)){
					dupChecker = new HashSet<>();
					break;
				}
				else{
					dupChecker.add(temp.toString());
				}
			}
			if(dupChecker.isEmpty()){
				noc.clear();
			}
		}
	}

}
