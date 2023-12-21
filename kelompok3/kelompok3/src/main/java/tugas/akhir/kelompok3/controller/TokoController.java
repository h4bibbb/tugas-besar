package tugas.akhir.kelompok3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import tugas.akhir.kelompok3.model.Toko;
import tugas.akhir.kelompok3.service.TokoService;

@Controller
public class TokoController {

    @Autowired
    private TokoService tokoService;

    @GetMapping("/")
    public String showToko(Model model) {
        List<Toko> tokos = tokoService.getToko();
        model.addAttribute("toko", tokos);
        return "index";
    }

    @GetMapping("/daftar")
    public String getForm() {
        return "AddToko";
    }

    @PostMapping("/daftar")
    public String addToko(@ModelAttribute Toko toko) {
        tokoService.saveToko(toko);
        return "redirect:/";
    }

     @GetMapping("/toko/{id}")
    public String tampilkanProfilToko(@PathVariable("id") String id) {
        // Logika untuk mengambil data toko dengan ID tertentu dari database atau sumber daya lainnya
        // Kemudian kembalikan tampilan profil toko yang sesuai
        return "profil"; // Ini harus sesuai dengan nama file HTML tampilan profil toko Anda
    }


}
