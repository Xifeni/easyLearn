package core.model;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TAG_ID")
    private UUID tagId;
    @Column(name = "TOPIC_ID")
    private UUID topicId;
    @Column
    private String tag;
}
