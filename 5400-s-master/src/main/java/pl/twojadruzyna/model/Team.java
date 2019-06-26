package pl.twojadruzyna.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "team_table")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Team implements Serializable {
    private static final long serialVersionUID = -7533996434173519473L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_team")
    private Long id;
    private String name;
    private String shortName;
    private String country;
    private String city;
    private Date foundedDate;
    private Long points;


}
