package ch.bbw.m151.jokesdb.datamodel;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class RatingsEntity {

    @Id
    @GeneratedValue
    private int id;

    @Accessors(chain = true)
    @Column(nullable = false)
    private String rating;


    @CreationTimestamp
    private Date createdOn;

    @UpdateTimestamp
    private Date updatedOn;

}
