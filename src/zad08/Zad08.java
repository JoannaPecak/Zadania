/**
 * 
 */
/**
 * @author User
 *
 */
package zad08;
public class Zad08 {

	public static void main(String[] args) {

		int[][] tab = new int[args.length][];
		for(int i=0;i<args.length;i++)
			tab[i] = new int[Integer.parseInt(args[i])];
		writeTable(tab);
	}
	
	public static void writeTable(int[][] tab) {
		for(int i=0;i<tab.length;i++) {
			for(int j=0;j<tab[i].length;j++)
				System.out.printf("%d-%d\t",i,j);
			System.out.println();
		}
	}
}