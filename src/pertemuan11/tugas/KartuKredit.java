package pertemuan11.tugas;

public class KartuKredit extends Pembayaran implements BuktiTransaksi {
    private double limit;

    public KartuKredit(double jumlah, double limit) {
        super(jumlah);
        this.limit = limit;
    }

    @Override
    public void proses() {
        if (jumlah <= limit) {
            limit -= jumlah;
            System.out.println("Pembayaran Kartu Kredit berhasil!");
        } else {
            System.out.println("Limit tidak mencukupi.");
        }
    }

    @Override
    public void cetakBukti() {
        System.out.println("Jumlah dibayar via Kartu Kredit: Rp" + jumlah);
    }
}
