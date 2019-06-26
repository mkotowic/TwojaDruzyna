package pl.twojadruzyna.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.twojadruzyna.api.ViewModel.TeamViewModel;
import pl.twojadruzyna.converter.impl.TeamConverter;
import pl.twojadruzyna.model.Team;
import pl.twojadruzyna.repo.TeamRepo;

import java.util.List;

@Service
public class TeamService {

    private final TeamRepo teamRepo;
    private final TeamConverter converter;

    @Autowired
    public TeamService(TeamRepo teamRepo, TeamConverter converter) {
        this.teamRepo = teamRepo;
        this.converter = converter;
    }

    public List<TeamViewModel> getAllTeams() {
        return converter.convertToViewModelList(teamRepo.findAll());
    }

    public void saveTeam(TeamViewModel teamViewModel){
        this.teamRepo.save(converter.convertToEntity(teamViewModel));
    }

}
