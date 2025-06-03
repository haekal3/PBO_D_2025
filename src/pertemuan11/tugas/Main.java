package pertemuan11.tugas;

public class Main {
	 public static void main(String[] args) {
	     EWallet ewallet = new EWallet(50000, 100000);
	     ewallet.proses();
	     ewallet.cetakBukti();
	
	     System.out.println();
	
	     KartuKredit kartu = new KartuKredit(150000, 100000);
	     kartu.proses();
	     kartu.cetakBukti();
	 }
}