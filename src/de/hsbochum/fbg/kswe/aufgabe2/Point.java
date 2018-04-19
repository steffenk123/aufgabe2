package de.hsbochum.fbg.kswe.aufgabe2;

/**
 *
 * @author Matthes Rieke <m.rieke@52north.org>
 */
public class Point {

    private final double latitude;
    private final double longitude;

    public Point(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double distanceTo(Point other) {
        return 0.0;
    }

}
