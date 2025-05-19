package pertemuan11.tugas;

public class EWallet extends Pembayaran implements BuktiTransaksi {
    private double saldo;

    public EWallet(double jumlah, double saldo) {
        super(jumlah);
        this.saldo = saldo;
    }

    @Override
    public void proses() {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Pembayaran E-Wallet berhasil!");
        } else {
            System.out.println("Saldo tidak cukup untuk pembayaran.");
        }
    }

    @Override
    public void cetakBukti() {
        System.out.println("Jumlah dibayar via E-Wallet: Rp" + jumlah);
    }
}
