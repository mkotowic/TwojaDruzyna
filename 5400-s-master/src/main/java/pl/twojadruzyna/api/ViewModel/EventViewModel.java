package pl.twojadruzyna.api.ViewModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.twojadruzyna.model.validator.EventValidator;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EventValidator
public class EventViewModel {

    private Long id;
    @NotNull
    private TeamViewModel myTeam;
    @NotNull
    private TeamViewModel oppositeTeam;
    @NotNull
    private Integer oppositeTeamScores;
    @NotNull
    private Integer myTeamScores;
    private String refereeName;
    private String stadiumName;
    private String country;
    private String city;
    @NotNull
    private Date matchDate;
}
