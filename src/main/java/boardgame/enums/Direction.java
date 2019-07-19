package boardgame.enums;

import java.util.HashMap;
import java.util.Map;

public enum Direction {
    EAST('E', 90),
    WEST('W', 270),
    NORTH('N', 0),
    SOUTH('S', 180);

    private final char shortName;
    private final int degrees;

    // Reverse-lookup map for getting a direction from an shortName
    private static final Map<Integer, Direction> lookup = new HashMap<>();

    static {
        for (Direction d : Direction.values()) {
            lookup.put(d.getDegrees(), d);
        }
    }

    Direction(char shortName, int degrees) {
        this.shortName = shortName;
        this.degrees = degrees;
    }

    public char getShortName() {
        return this.shortName;
    }

    public int getDegrees() {
        return this.degrees;
    }

    public static Direction getByDegrees(int degrees) {
        degrees = degrees % 360;
        if (degrees < 0) {
            degrees += 360;
        }
        return lookup.get(degrees);
    }
}
