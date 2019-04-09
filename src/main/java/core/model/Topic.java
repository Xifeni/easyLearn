package core.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@Entity
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TOPIC_ID")
    private UUID topicId;
    @Column(name = "USER_ID")
    private UUID userId;
    @Column(name = "DATE_OF_CREATED")
    private Timestamp dateOfCreated;
    @Column(name = "DATE_OF_UPDATED")
    private Timestamp dateOfUpdate;
    //todo: How correctly store text of topic?
    @Column
    private String topic;
}
