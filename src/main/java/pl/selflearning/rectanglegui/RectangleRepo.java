package pl.selflearning.rectanglegui;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RectangleRepo extends JpaRepository<RectangleEntity, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM RECTANGLE rect WHERE (2*rect.height+2*rect.width) >= :size")
    List<RectangleEntity> getBigRectangles(@Param("size") int size);

    @Query(nativeQuery = true, value = "SELECT * FROM RECTANGLE rect WHERE (2*rect.height+2*rect.width) < :size")
    List<RectangleEntity> getSmallRectangles(@Param("size") int size);
}
