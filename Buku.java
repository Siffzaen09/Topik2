public class Buku {
    private final String isbn;
    private String judul;
    private String pengarang;
    private String tahunTerbit;
    private String harga;
    private float rating;

    public Buku(String isbn, String judul, String pengarang, String tahunTerbit, String harga, float rating) {
        this.isbn = isbn;
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
        this.rating = rating;
    }

    public String getIsbn(){ return isbn;}

    public String getJudul(){ return judul;}

    public void setJudul(String judul){ this.judul = judul;}

    public String getPengarang(){ return pengarang;}

    public void setPengarang(String pengarang){ this.pengarang = pengarang;}

    public String getTahunTerbit(){ return tahunTerbit;}

    public void setTahunTerbit(String tahunTerbit){ this.tahunTerbit = tahunTerbit;}

    public String getHarga(){ return harga;}

    public void setHarga(String harga){ this.harga = harga;}

    public float getRating() { return rating; }

    public void setRating( float rating) { this.rating = rating;}
}
