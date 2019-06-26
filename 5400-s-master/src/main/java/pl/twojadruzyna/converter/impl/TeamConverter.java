package pl.twojadruzyna.converter.impl;

import org.springframework.stereotype.Component;
import pl.twojadruzyna.api.ViewModel.TeamViewModel;
import pl.twojadruzyna.converter.IConverter;
import pl.twojadruzyna.model.Team;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TeamConverter implements IConverter<Team, TeamViewModel> {
    @Override
    public TeamViewModel convertToViewModel(Team entity) {
        var viewModel = new TeamViewModel();
        viewModel.setId(entity.getId());
        viewModel.setName(entity.getName());
        viewModel.setShortName(entity.getShortName());
        viewModel.setCountry(entity.getCountry());
        viewModel.setCity(entity.getCity());
        viewModel.setFoundedDate(entity.getFoundedDate());
        viewModel.setPoints(entity.getPoints());
        return viewModel;
    }

    @Override
    public Team convertToEntity(TeamViewModel viewModel) {
        var entity = new Team();
        entity.setId(viewModel.getId());
        entity.setName(viewModel.getName());
        entity.setShortName(viewModel.getShortName());
        entity.setCountry(viewModel.getCountry());
        entity.setCity(viewModel.getCity());
        entity.setFoundedDate(viewModel.getFoundedDate());
        entity.setPoints(viewModel.getPoints());

        return entity;
    }

    public List<TeamViewModel> convertToViewModelList(List<Team> teamList) {
        return teamList
                .stream()
                .map(this::convertToViewModel)
                .collect(Collectors.toList());
    }
}
