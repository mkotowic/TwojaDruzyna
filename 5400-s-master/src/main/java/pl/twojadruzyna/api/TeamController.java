package pl.twojadruzyna.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.twojadruzyna.api.ViewModel.TeamViewModel;
import pl.twojadruzyna.service.TeamService;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("api/team")
@CrossOrigin
public class TeamController {
    private final TeamService teamService;

    @Autowired
    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping
    public ResponseEntity<List<TeamViewModel>> getTeams() {
        return ResponseEntity.ok(teamService.getAllTeams());
    }

    @PostMapping("/save")
    public void saveTeam(@Valid @RequestBody TeamViewModel team) {
        this.teamService.saveTeam(team);
    }
}
