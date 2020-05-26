/** 2020. 5. 21. 오전 10:30:34
 * @author ventulus95
 */
package summer_WinterCoding;

public class B_19 {

	public static void main(String[] args) {
		int n = 3;
		int[] answer = {};
		int[][] nans = new int[21][];
		nans[1] = new int[1];
		nans[1][0] = 0;
		for(int i =2; i<=n; i++){
			int init = nans[i-1].length*2 +1;
			nans[i] = new int[init];
			int k =0;
			while(k<init){
				for(int  j=0; j<nans[i-1].length; j++){
					nans[i][k] = nans[i-1][j];
					k++;
				}
				nans[i][k] = 0;
				k++;
				for(int j=nans[i-1].length-1; j>=0; j--){
					if(nans[i-1][j] == 1){
						nans[i][k] = 0;
					}
					else{
						nans[i][k] = 1;
					}
					k++;
				}
			}
		}
		System.out.println(nans[n]);
	}

}
