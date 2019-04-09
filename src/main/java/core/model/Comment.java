package core.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "COMMENT_ID")
    private UUID commentId;
    @Column(name = "USER_ID")
    private UUID userId;
    @Column(name = "DATE_OF_CREATED")
    private Timestamp dateOfCreated;
    @Column(name = "DATE_OF_UPDATED")
    private Timestamp dateOfUpdated;
    //todo: How correctly store this?
    @Column
    private String comment;
}
