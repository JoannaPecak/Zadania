/**
 * 
 */
/**
 * @author User
 *
 */
package zad10;
public class Zad10 {

	public static void main(String[] args) {
		
		int[][] numTab = {{1,2,3,4,5},
				{1,2,3,4,5}};
		char[] argsTab = {'+','-','*','/','q'};
		int[] result = new int[argsTab.length];
		for(int i=0;i<result.length;i++) {
			switch (argsTab[i]) {
				case '-': result[i]=numTab[0][i]-numTab[1][i]; break;
				case '*': result[i]=numTab[0][i]*numTab[1][i]; break;
				case '/': result[i]=numTab[0][i]/numTab[1][i]; break;
				default: result[i]=numTab[0][i]+numTab[1][i]; break;
			}
			System.out.println(result[i]);
		}

	}

}