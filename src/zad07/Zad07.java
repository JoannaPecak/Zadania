/**
 * 
 */
/**
 * @author User
 *
 */
package zad07;
public class Zad07
{

	public static void main(String[] args) {
		
		int[] tab = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		for(int i =0; i<tab.length;i++) {
			if (tab[i]%x ==0)
			{
				System.out.printf("Liczba - %d, indeks liczby - %d",tab[i],i);
				System.out.println();
				
			}
		}
		