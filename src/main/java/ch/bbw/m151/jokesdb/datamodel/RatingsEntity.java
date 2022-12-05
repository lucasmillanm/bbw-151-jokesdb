package ch.bbw.m151.jokesdb.datamodel;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "ratings")
public class RatingsEntity {

    @Id
    @GeneratedValue
    private int id;

    @Accessors(chain = true)
    @Column(nullable = false)
    private String rating;

}
