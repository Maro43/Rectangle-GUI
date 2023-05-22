package pl.selflearning.rectanglegui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route
public class RectangleSizeGui extends VerticalLayout {

    private RectangleRepo rectangleRepo;
    private TextField textFieldSize;
    private TextArea textAreaRectangles;
    private Button buttonBigger;
    private Button buttonSmaller;

//@Autowired
    public RectangleSizeGui(RectangleRepo rectangleRepo) {
        this.rectangleRepo = rectangleRepo;
        this.textFieldSize = new TextField("Podaj Rozmiar");
        this.textAreaRectangles = new TextArea("Rezultat");
        this.buttonBigger = new Button("Pokaż Większe");
        this.buttonSmaller = new Button("Pokaż Mniejsze");

        buttonBigger.addClickListener(ClickEvent -> textAreaRectangles.setValue(rectangleRepo.getBigRectangles(Integer.parseInt(textFieldSize.getValue())).toString()));
        buttonSmaller.addClickListener(ClickEvent -> textAreaRectangles.setValue(rectangleRepo.getSmallRectangles(Integer.parseInt(textFieldSize.getValue())).toString()));

        add(textFieldSize);
        add(textAreaRectangles);
        add(buttonBigger);
        add(buttonSmaller);
    }
}
