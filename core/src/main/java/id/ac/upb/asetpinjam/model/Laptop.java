package id.ac.upb.asetpinjam.model;

/** Minggu 3: aset berupa laptop. Spesifikasi dan nomor inventaris tidak boleh kosong. */
public class Laptop extends Aset {

    private final String spesifikasi;
    private final String nomorInventaris;

    // TODO minggu 3: field spesifikasi dan nomorInventaris.

    public Laptop(String kode, String nama, String spesifikasi, String nomorInventaris) {
        super(kode, nama);
        this.spesifikasi = wajibAdaIsi(spesifikasi, "spesifikasi");
        this.nomorInventaris = wajibAdaIsi(nomorInventaris, "nomorInventaris");
    }

    private static String wajibAdaIsi(String nilaiString, String namaField) {
        if (nilaiString == null || nilaiString.isBlank()) {
            throw new IllegalArgumentException(namaField + " tidak boleh null atau kosong");
        }
        return nilaiString.trim();
    }
    public String getSpesifikasi() {
        return spesifikasi;
    }
    
    public String getNomorInventaris() {
        return nomorInventaris;
    }

    @Override
    public JenisAset getJenis() {
        return JenisAset.LAPTOP;
    }

    @Override
    public long hitungDenda(int hariTerlambat) {
        return hariTerlambat * 5000;
    }
}
