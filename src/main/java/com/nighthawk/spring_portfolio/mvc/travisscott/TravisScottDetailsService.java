// package com.nighthawk.spring_portfolio.mvc.travisscott;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// @Service
// public class TravisScottDetailsService {

//     @Autowired
//     private TravisScottCollaboratorJpaRepository collaboratorRepo;

//     public void saveCollaborators() {
//         // Create collaborators
//         TravisScottCollaborator c1 = new TravisScottCollaborator("Drake");
//         TravisScottCollaborator c2 = new TravisScottCollaborator("Kendrick Lamar");
//         TravisScottCollaborator c3 = new TravisScottCollaborator("Kid Cudi");

//         // Save collaborators to the database
//         collaboratorRepo.save(c1);
//         collaboratorRepo.save(c2);
//         collaboratorRepo.save(c3);
//     }
//     public TravisScottEntity[] init() {
//         saveCollaborators(); // Save collaborators first

//         TravisScottEntity s1 = new TravisScottEntity("SICKO MODE", "ASTROWORLD", 312);
//         s1.getAdditionalInfo().put("releaseYear", 2018);

//         TravisScottEntity s2 = new TravisScottEntity("Goosebumps", "Birds in the Trap Sing McKnight", 244);
//         s2.getAdditionalInfo().put("releaseYear", 2016);

//         TravisScottEntity s3 = new TravisScottEntity("Highest in the Room", "Single", 175);
//         s3.getAdditionalInfo().put("releaseYear", 2019);

//         TravisScottEntity s4 = new TravisScottEntity("STARGAZING", "ASTROWORLD", 320);
//         s4.getAdditionalInfo().put("releaseYear", 2018);

//         TravisScottEntity s5 = new TravisScottEntity("Antidote", "Rodeo", 239);
//         s5.getAdditionalInfo().put("releaseYear", 2015);

//         TravisScottEntity[] songs = {s1, s2, s3, s4, s5};
//         return songs;
//     }
// }