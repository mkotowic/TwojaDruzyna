package pl.twojadruzyna.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "events")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Event implements Serializable {
    private static final long serialVersionUID = 7021150458271420830L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_event")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "my_team_id")
    private Team myTeam;
    @ManyToMany()
    private List<Team> teams = new ArrayList<>();
    private Integer oppositeTeamScores;
    private Integer myTeamScores;
    private String refereeName;
    private String stadiumName;
    private String country;
    private String city;
    private Date matchDate;
}
