package pertemuan11.tugas;

public abstract class Pembayaran {
    protected double jumlah;

    public Pembayaran(double jumlah) {
        this.jumlah = jumlah;
    }

    public abstract void proses();

    public double getJumlah() {
        return jumlah;
    }
}