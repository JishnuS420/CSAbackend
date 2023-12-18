package com.nighthawk.spring_portfolio.mvc.travisscott;

import java.util.List;

import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TravisScottCollaboratorJpaRepository extends JpaRepository<TravisScottCollaborator, Long> {
    List<TravisScottEntity> findByCollaborator(String collaborator);

    @Transactional
    void deleteById(long id);
}

