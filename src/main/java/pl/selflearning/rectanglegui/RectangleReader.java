package pl.selflearning.rectanglegui;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class RectangleReader {

    private final RectangleRepo rectangleRepo;

    @Value("${siteA1}")
    private int siteA1;
    @Value("${siteB1}")
    private int siteB1;

    @Value("${siteA2}")
    private int siteA2;
    @Value("${siteB2}")
    private int siteB2;

    @Value("${siteA3}")
    private int siteA3;
    @Value("${siteB3}")
    private int siteB3;

    @Value("${config1.siteA4}")
    private int siteA4;
    @Value("${siteB4}")
    private int siteB4;

    public RectangleReader(RectangleRepo rectangleRepo) {
        this.rectangleRepo = rectangleRepo;
    }

    //    @GetMapping("/add")
    @EventListener(ApplicationReadyEvent.class)
    public void addRectangles() {
        RectangleEntity rectangleEntity1 = new RectangleEntity(siteA1, siteB1);
        RectangleEntity rectangleEntity2 = new RectangleEntity(siteA2, siteB2);
        RectangleEntity rectangleEntity3 = new RectangleEntity(siteA3, siteB3);
        RectangleEntity rectangleEntity4 = new RectangleEntity(siteA4, siteB4);
        rectangleRepo.save(rectangleEntity1);
        rectangleRepo.save(rectangleEntity2);
        rectangleRepo.save(rectangleEntity3);
        rectangleRepo.save(rectangleEntity4);
    }
}
