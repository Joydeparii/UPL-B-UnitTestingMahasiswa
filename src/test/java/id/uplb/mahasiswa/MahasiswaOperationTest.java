package id.uplb.mahasiswa;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MahasiswaOperationTest {
	private MahasiswaOperation mahasiswaOperation;
	
	@BeforeEach
	public void setUp() {
		mahasiswaOperation = new MahasiswaOperation();
		mahasiswaOperation.addMahasiswa("Muhammad Fauzan", "24060119130131", "Informatika", "Laki-laki", "Jakarta");
		mahasiswaOperation.addMahasiswa("Joy Depari", "24060119130132", "Matematika", "Laki-laki", "Bekasi");
		mahasiswaOperation.addMahasiswa("Dionysius Mario", "24060119130144", "Fisika", "Laki-laki", "Jakarta");
		mahasiswaOperation.addMahasiswa("Maria Moria", "24060119100124", "Kimia", "Perempuan", "Surabaya");
		mahasiswaOperation.addMahasiswa("Dini Dinia", "24060119100107", "Biologi", "Perempuan", "Yogyakarta");
	}
	
	@Test
	@DisplayName("Berhasil dalam menambahkan mahasiswa baru")
	public void addMahasiswaSuccesful() {
		mahasiswaOperation.addMahasiswa("Sana Nurul", "24060119074087", "Statistika", "Perempuan", "Semarang");
		assertFalse(mahasiswaOperation.getAllMahasiswa().isEmpty());
		assertEquals(6, mahasiswaOperation.getAllMahasiswa().size());
	}
	
	@Test
	@DisplayName("Gagal dalam menambahkan mahasiswa baru karena ada field yang kosong")
	public void addMahasiswaFailed() {
		assertThrows(RuntimeException.class, () -> {
			mahasiswaOperation.addMahasiswa("Joko Munkar", null, "Bioteknologi", "Laki-laki", null);
		});
	}
	
	@Test
	@DisplayName("Berhasil dalam menghapus mahasiswa")
	public void deleteMahasiswaSuccesful() {
		mahasiswaOperation.deleteMahasiswa("Maria Moria", "24060119100124", "Kimia", "Perempuan", "Surabaya");
		assertEquals(4, mahasiswaOperation.getAllMahasiswa().size());
	}
	
	@Test
	@DisplayName("Gagal dalam menghapus mahasiswa")
	public void deleteMahasiswaFailed() {
		assertThrows(RuntimeException.class, () -> {
			mahasiswaOperation.deleteMahasiswa("Maria Moria", "24060119100124", "Hukum", "Laki-laki", "Surabaya");
		});
	}
}
