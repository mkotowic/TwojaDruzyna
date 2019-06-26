package pl.twojadruzyna.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.twojadruzyna.model.Player;
import pl.twojadruzyna.service.PlayerService;

import java.util.List;

@RestController
@RequestMapping("api/player")
@CrossOrigin
public class PlayerController {
    private final PlayerService playerService;

    @Autowired
    public PlayerController (PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/players")
    public ResponseEntity<List<Player>> getAllPlayer() {
        return ResponseEntity.ok(this.playerService.getPlayerList());
    }
}
