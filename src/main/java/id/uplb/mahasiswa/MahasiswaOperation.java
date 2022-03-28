package id.uplb.mahasiswa;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MahasiswaOperation {
	Map<String, Mahasiswa> listMahasiswa = new ConcurrentHashMap<String, Mahasiswa>();
	
	public void addMahasiswa(String nama, String nim, String jurusan, String jenis_kelamin, String domisili) {
		Mahasiswa mahasiswa = new Mahasiswa(nama, nim, jurusan, jenis_kelamin, domisili);
		validateMahasiswa(mahasiswa);
		listMahasiswa.put(printMahasiswa(mahasiswa), mahasiswa);
	}
	
	public void deleteMahasiswa(String nama, String nim, String jurusan, String jenis_kelamin, String domisili) {
		Mahasiswa mahasiswa = new Mahasiswa(nama, nim, jurusan, jenis_kelamin, domisili);
		if(listMahasiswa.containsKey(printMahasiswa(mahasiswa))) {
			listMahasiswa.remove(printMahasiswa(mahasiswa));
		} else {
			throw new RuntimeException("Mahasiswa tersebut tidak terdaftar");
		}
	}
	
	public Collection<Mahasiswa> getAllMahasiswa(){
		return listMahasiswa.values();
	}
	
	public void validateMahasiswa(Mahasiswa mahasiswa) {
		mahasiswa.validateNamaMahasiswa();
		mahasiswa.validateNIMMahasiswa();
		mahasiswa.validateJurusanMahasiswa();
		mahasiswa.validateJenisKelaminMahasiswa();
		mahasiswa.validateDomisiliMahasiswa();
	}
	
	private String printMahasiswa(Mahasiswa mahasiswa) {
		return String.format("%s-%s-%s-%s-%s", mahasiswa.getNamaMahasiswa(), mahasiswa.getNIMMahasiswa(),
				mahasiswa.getJurusanMahasiswa(), mahasiswa.getJenisKelaminMahasiswa(), mahasiswa.getDomisiliMahasiswa());
	}
}
