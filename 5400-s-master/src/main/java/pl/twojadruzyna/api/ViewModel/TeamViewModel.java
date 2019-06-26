package pl.twojadruzyna.api.ViewModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeamViewModel {
    private Long id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String shortName;
    private String country;
    private String city;
    @NotNull
    private Date foundedDate;
    private Long points;
}
