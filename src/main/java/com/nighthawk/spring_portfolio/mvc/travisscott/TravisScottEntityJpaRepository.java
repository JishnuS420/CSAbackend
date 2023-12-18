package com.nighthawk.spring_portfolio.mvc.travisscott;

import java.util.List;

import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TravisScottEntityJpaRepository extends JpaRepository<TravisScottEntity, Long> {
    List<TravisScottEntity> findByAlbum(String album);

    @Transactional
    void deleteById(long id);
}

