package com.nighthawk.spring_portfolio.mvc.travisscott;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Convert;
import static jakarta.persistence.FetchType.EAGER;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import com.vladmihalcea.hibernate.type.json.JsonType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Convert(attributeName = "travisScott", converter = JsonType.class)
public class TravisScottEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    private String song;

    @NonNull
    private String album;

    private int durationInSeconds;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(columnDefinition = "jsonb")
    private Map<String, Object> additionalInfo = new HashMap<>();

    @ManyToMany(fetch = EAGER)
    private List<TravisScottCollaborator> collaborators = new ArrayList<>();

    public TravisScottEntity(String song, String album, int durationInSeconds) {
        this.song = song;
        this.album = album;
        this.durationInSeconds = durationInSeconds;
    }

    public static TravisScottEntity[] init() {
        TravisScottEntity s1 = new TravisScottEntity("SICKO MODE", "ASTROWORLD", 312);
        s1.getAdditionalInfo().put("releaseYear", 2018);

        TravisScottEntity s2 = new TravisScottEntity("Goosebumps", "Birds in the Trap Sing McKnight", 244);
        s2.getAdditionalInfo().put("releaseYear", 2016);

        TravisScottEntity s3 = new TravisScottEntity("Highest in the Room", "Single", 175);
        s3.getAdditionalInfo().put("releaseYear", 2019);

        TravisScottEntity s4 = new TravisScottEntity("STARGAZING", "ASTROWORLD", 320);
        s4.getAdditionalInfo().put("releaseYear", 2018);

        TravisScottEntity s5 = new TravisScottEntity("Antidote", "Rodeo", 239);
        s5.getAdditionalInfo().put("releaseYear", 2015);

        TravisScottEntity[] songs = {s1, s2, s3, s4, s5};
        return songs;
    }

    public static void main(String[] args) {
        TravisScottEntity[] songs = init();

        for (TravisScottEntity song : songs) {
            System.out.println(song);
        }
    }
}
