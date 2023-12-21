package tugas.akhir.kelompok3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tugas.akhir.kelompok3.model.Toko;
import tugas.akhir.kelompok3.repository.TokoRepository;

@Service
public class TokoService {

    @Autowired
    private TokoRepository tokoRepo;

    public Toko saveToko(Toko toko) {

        return tokoRepo.save(toko);

    }

   public List<Toko> getToko(){
    return tokoRepo.findAll();
}



}
