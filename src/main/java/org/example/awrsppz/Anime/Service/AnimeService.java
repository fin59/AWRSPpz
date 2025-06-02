package org.example.awrsppz.Anime.Service;

import org.example.awrsppz.Anime.Anime;
import org.example.awrsppz.Anime.Repository.AnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {
    private AnimeRepository animeRepository;
    @Autowired
    public AnimeService(AnimeRepository animeRepository) {
        this.animeRepository = animeRepository;
    }
    public Anime getAnimeById(int id) {
        return animeRepository.findById(id).orElse(null);
    }
    public List<Anime> getAllAnimes() {
        return animeRepository.findAll();
    }
    public Anime addAnime(Anime anime) {
        return animeRepository.save(anime);
    }

}
