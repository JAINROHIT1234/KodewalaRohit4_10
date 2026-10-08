/**
 * 
 */
package Day_20_Types_of_Loops;

/**
 * 
 */
public class Continue {

	/**
	 * Continue keyword we used when we want to Skip the iteration
	 */
	public static void main(String[] args) {
		int numbers [] = {1, 2 ,3 , 4 ,-5 ,6 ,-9 , -8 ,10, -6, 7 ,12,63};
		
		for(int i=0;i<numbers.length;i++) {
			int currentNo=numbers[i];
			if(currentNo<0) {
				continue;
			}
			System.out.println(currentNo*10);
			
			
		}

	}

}
