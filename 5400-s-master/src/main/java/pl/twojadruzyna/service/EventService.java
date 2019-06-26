package pl.twojadruzyna.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.twojadruzyna.api.ViewModel.EventViewModel;
import pl.twojadruzyna.converter.impl.EventConverter;
import pl.twojadruzyna.repo.EventRepo;

import java.util.List;

@Service
public class EventService {
    private final EventRepo eventRepo;
    private final EventConverter converter;

    @Autowired
    public EventService(EventRepo eventRepo, EventConverter converter) {
        this.eventRepo = eventRepo;
        this.converter = converter;
    }

    public List<EventViewModel> getAllEvents() {
        return converter.convertToEventList(eventRepo.findAll());
    }

    public void saveResult(EventViewModel event) {
        eventRepo.save(converter.convertToEntity(event));
    }

    private void updateTotalScores() {

    }
}

