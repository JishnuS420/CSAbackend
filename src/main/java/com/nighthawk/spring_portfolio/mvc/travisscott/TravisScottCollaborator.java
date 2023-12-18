package com.nighthawk.spring_portfolio.mvc.travisscott;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TravisScottCollaborator {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String collaboratorName;

    public TravisScottCollaborator(String collaboratorName) {
        this.collaboratorName = collaboratorName;
    }
}
