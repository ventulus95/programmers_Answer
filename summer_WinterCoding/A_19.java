/** 2020. 5. 21. 오후 3:16:08
 * @author ventulus95
 */
package summer_WinterCoding;

public class A_19 {

	public static void main(String[] args) {
		int w = 8;
		int h = 12; 
		if(w>h){
			int temp = 0;
			temp = w;
			w = h;
			h = temp;
		}
		long ans =0;
		for(int i =1; i<w; i++){
			ans += (long)((double)(h/w*i));
		}
		System.out.print(ans*2);
	}
}
