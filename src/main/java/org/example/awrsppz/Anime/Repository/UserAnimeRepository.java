package org.example.awrsppz.Anime.Repository;

import org.example.awrsppz.Anime.UserAnime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserAnimeRepository extends JpaRepository<UserAnime, Integer> {
    List<UserAnime> findByUserId(int userId);
}
