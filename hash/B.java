/** 2020. 4. 19. 오후 7:40:22
 * @author ventulus95
 */
package hash;

public class B {

	public static void main(String[] args) {
		String[] phoneBook ={};
		boolean answer = true;
		for(int i=0; i<phoneBook.length-1; i++) {
            for(int j=i+1; j<phoneBook.length; j++) {
                if(phoneBook[i].startsWith(phoneBook[j])) 
                	answer = false;
                if(phoneBook[j].startsWith(phoneBook[i]))
                	answer = false;
            }
        }
	}

}
