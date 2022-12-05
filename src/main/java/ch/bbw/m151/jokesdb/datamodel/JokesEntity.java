package ch.bbw.m151.jokesdb.datamodel;

import lombok.*;
import lombok.experimental.Accessors;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "jokes")
public class JokesEntity {

    @Id
    @GeneratedValue
    private int id;

    @Accessors(chain = true)
    @Column(nullable = false)
    private String joke;

    @OneToOne
    private RatingsEntity rating;

    @CreationTimestamp
    private Date createdOn;

    @UpdateTimestamp
    private Date updatedOn;

    public void rateJoke(String newRating) {
        rating.setRating(newRating);
    }

}
