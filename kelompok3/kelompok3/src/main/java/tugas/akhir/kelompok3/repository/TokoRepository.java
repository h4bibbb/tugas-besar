package tugas.akhir.kelompok3.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import tugas.akhir.kelompok3.model.Toko;

public interface TokoRepository extends JpaRepository<Toko, Integer> {

    
}
