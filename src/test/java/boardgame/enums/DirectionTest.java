package boardgame.enums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DirectionTest {

    @Test
    public void getByDegreesWithPositiveValue() {
        //given
        Direction direction = Direction.EAST;

        //when
        int degrees = direction.getDegrees();
        degrees += 180;

        //then
        assertEquals(Direction.WEST, Direction.getByDegrees(degrees));
    }

    @Test
    public void getByDegreesWithNegativeValue() {
        //given
        Direction direction = Direction.NORTH;

        //when
        int degrees = direction.getDegrees();
        degrees -= 90;

        //then
        assertEquals(Direction.WEST, Direction.getByDegrees(degrees));
    }
}
