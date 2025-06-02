package org.example.awrsppz.Anime.Controller;

import org.example.awrsppz.Anime.Anime;
import org.example.awrsppz.Anime.Service.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/anime")
public class AnimeController {
    private final AnimeService animeService;
    @Autowired
    public AnimeController(AnimeService animeService) {
        this.animeService = animeService;
    }
    @GetMapping
    public List<Anime> getAllAnime() {
        return animeService.getAllAnimes();
    }
    @GetMapping("/{id}")
    public Anime getAnimeById(@PathVariable int id) {
        return animeService.getAnimeById(id);
    }
    @PostMapping
    public Anime addAnime(@RequestBody Anime anime) {
        return animeService.addAnime(anime);
    }

}
