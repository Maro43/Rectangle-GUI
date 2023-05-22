package pl.selflearning.rectanglegui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route
public class RectangleGui extends VerticalLayout {

    private RectangleRepo rectangleRepo;

    private TextField textFieldHeight;
    private TextField textFieldWidth;
    private Button button;

    //    @Autowired
    public RectangleGui(RectangleRepo rectangleRepo) {
        this.rectangleRepo = rectangleRepo;
        textFieldHeight = new TextField("Podaj Wysokość");
        textFieldWidth = new TextField("Podaj Szerokość");
        button = new Button("Dodaj");
        button.addClickListener(buttonClickEvent -> addRectangle());

        add(textFieldHeight);
        add(textFieldWidth);
        add(button);
    }

    public void addRectangle() {
        RectangleEntity rectangleEntity = new RectangleEntity();
        rectangleEntity.setHeight(Integer.parseInt(textFieldHeight.getValue()));
        rectangleEntity.setWidth(Integer.parseInt(textFieldWidth.getValue()));
        rectangleRepo.save(rectangleEntity);
    }
}
