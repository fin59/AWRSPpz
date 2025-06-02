package org.example.awrsppz.Anime;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserAnimeRepository extends JpaRepository<UserAnime, Integer> {
    List<UserAnime> findByUserId(int userId);
}
