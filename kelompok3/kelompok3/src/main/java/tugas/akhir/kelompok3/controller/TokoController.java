package tugas.akhir.kelompok3.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

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
    public String tampilkanProfilToko(@PathVariable("id") Integer id, Model model) {
        Toko toko = tokoService.findById(id);
        model.addAttribute("toko", toko);
        return "profil"; 
    }


}
