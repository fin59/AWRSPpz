package org.example.awrsppz.Anime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/useranime")
public class UserAnimeController {
    private final UserAnimeService userAnimeService;

    @Autowired
    public UserAnimeController(UserAnimeService userAnimeService) {
        this.userAnimeService = userAnimeService;
    }
    @PostMapping
    public UserAnime addUserAnime(@RequestBody UserAnime userAnime) {
        return userAnimeService.addUserAnime(userAnime);
    }
    @GetMapping("/user/{id}")
    public List<UserAnime> getUserAnime(@PathVariable int id) {
        return userAnimeService.getUserAnimes(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUserAnime(@PathVariable int id) {
        userAnimeService.deleteUserAnime(id);
    }



}
