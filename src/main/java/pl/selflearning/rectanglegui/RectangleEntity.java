package pl.selflearning.rectanglegui;

import jakarta.persistence.*;

@Entity
@Table(name = "rectangle")
public class RectangleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int height;
    private int width;

    public RectangleEntity() {
    }

    public RectangleEntity(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "RectangleEntity{" +
                "id=" + id +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
