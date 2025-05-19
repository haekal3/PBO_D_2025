package pertemuan11;

public class KartuElektronik implements Kartu {
    private String kodeBank;
    private String pin;

    public KartuElektronik(String kodeBank, String pin) {
        this.kodeBank = kodeBank;
        this.pin = pin;
    }

    @Override
    public boolean otentikasi(String pinInput) {
        return pinInput.equals(this.pin);
    }

    @Override
    public String encode(String pin) {
        // Belum diimplementasikan
        return null;
    }
}
