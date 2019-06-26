package pl.twojadruzyna.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.twojadruzyna.api.ViewModel.EventViewModel;
import pl.twojadruzyna.service.EventService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/event")
@CrossOrigin
public class EventController {

    private final EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping()
    public ResponseEntity<List<EventViewModel>> getEventsList() {
        return ResponseEntity.ok(eventService.getAllEvents());
    }

    @PostMapping("/save")
    public void saveResults(@RequestBody @Valid EventViewModel event) {
        eventService.saveResult(event);
    }


}
