package pl.twojadruzyna.model;

import lombok.Data;
import pl.twojadruzyna.model.enums.Card;
import pl.twojadruzyna.model.enums.Gender;
import pl.twojadruzyna.model.enums.Position;

import javax.persistence.*;

@Entity
@Data
public class Player {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String secondName;
    @ManyToOne(cascade= CascadeType.ALL, fetch= FetchType.EAGER)
    private Team team;
    private Position position;
    private Gender gender;
    private Integer goals;
    private Integer shots;
    private Integer faults;
    private Card card;
    private boolean captain;
    private boolean injured;
    private int age;
}
