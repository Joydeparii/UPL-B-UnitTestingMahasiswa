package id.uplb.mahasiswa;

public class Mahasiswa {
	private String nama;
	private String nim;
	private String jurusan;
	private String jenis_kelamin;
	private String domisili;
	
	public Mahasiswa(String nama, String nim, String jurusan, String jenis_kelamin, String domisili) {
		this.setNamaMahasiswa(nama);
		this.setNIMMahasiswa(nim);
		this.setJurusanMahasiswa(jurusan);
		this.setJenisKelaminMahasiswa(jenis_kelamin);
		this.setDomisiliMahasiswa(domisili);
	}
	
	public String getNamaMahasiswa() {
		return nama;
	}
	
	public void setNamaMahasiswa(String nama) {
		this.nama = nama;
	}
	
	public String getNIMMahasiswa() {
		return nim;
	}
	
	public void setNIMMahasiswa(String nim) {
		this.nim = nim;
	}
	
	public String getJurusanMahasiswa() {
		return jurusan;
	}
	
	public void setJurusanMahasiswa(String jurusan) {
		this.jurusan = jurusan;
	}
	
	public String getJenisKelaminMahasiswa() {
		return jenis_kelamin;
	}
	
	public void setJenisKelaminMahasiswa(String jenis_kelamin) {
		this.jenis_kelamin = jenis_kelamin;
	}
	
	public String getDomisiliMahasiswa() {
		return domisili;
	}
	
	public void setDomisiliMahasiswa(String domisili) {
		this.domisili = domisili;
	}
	
	public void validateNamaMahasiswa() {
		if(this.nama.isBlank()) {
			throw new RuntimeException("Nama mahasiswa harus diisi");
		}
	}
	
	public void validateNIMMahasiswa() {
		if(this.nim.isBlank()) {
			throw new RuntimeException("NIM mahasiswa harus diisi");
		}
	}
	
	public void validateJurusanMahasiswa() {
		if(this.jurusan.isBlank()) {
			throw new RuntimeException("Jurusan mahasiswa harus diisi");
		}
	}
	
	public void validateJenisKelaminMahasiswa() {
		if(this.jenis_kelamin.isBlank()) {
			throw new RuntimeException("Jenis kelamin mahasiswa harus diisi");
		}
	}
	
	public void validateDomisiliMahasiswa() {
		if(this.domisili.isBlank()) {
			throw new RuntimeException("Domisili mahasiswa harus diisi");
		}
	}
}
