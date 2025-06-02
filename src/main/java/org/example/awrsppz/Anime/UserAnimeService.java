package org.example.awrsppz.Anime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAnimeService {
    private final UserAnimeRepository userAnimeRepository;

    @Autowired
    public UserAnimeService(UserAnimeRepository userAnimeRepository) {
        this.userAnimeRepository = userAnimeRepository;
    }
    public UserAnime addUserAnime(UserAnime userAnime) {
        return userAnimeRepository.save(userAnime);
    }

    public List<UserAnime> getUserAnimes(int userId) {
        return userAnimeRepository.findByUserId(userId);
    }
    public void deleteUserAnime(int id) {
        userAnimeRepository.deleteById(id);
    }
}
