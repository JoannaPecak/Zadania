/**
 * 
 */
/**
 * @author User
 *
 */
package zad11;
public class Zad11 {

	public static void main(String[] args) {
		
		for (StanZamuwienia item:StanZamuwienia.values())
			wypiszStan(item);
	
	}
	
	public static void wypiszStan(StanZamuwienia zamuwienia) {
		System.out.println(zamuwienia.val);
	}
	
	enum StanZamuwienia{
		NOWE("Nowe"), OCZEKUJACE("Oczekujace"), REALIZOWANE("Pilne!"), WYSLANE("Wyslane"), ZWROT("Kontakt!");
		
		private String val;
		private StanZamuwienia(String arg) {
			this.val = arg;
		}
	}

}