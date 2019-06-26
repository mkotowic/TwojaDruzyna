package pl.twojadruzyna.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.twojadruzyna.exception.ResourceNotFoundException;
import pl.twojadruzyna.model.Player;
import pl.twojadruzyna.repo.PlayerRepo;

import java.util.List;

@Service
public class PlayerService {

    private PlayerRepo playerRepo;

    @Autowired
    public PlayerService(PlayerRepo playerRepo) {
        this.playerRepo = playerRepo;
    }


    public List<Player> getPlayerList() {
        return playerRepo.findAll();
    }

    public Player getPlayerById(Long playerId) {
        return playerRepo.findById(playerId)
                .orElseThrow((() -> new ResourceNotFoundException(Player.class.getName(), "playerId", playerId)));
    }
}
