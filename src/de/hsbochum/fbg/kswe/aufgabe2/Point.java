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
        double deltaLat = this.latitude - other.latitude;
        double deltaLon = this.longitude - other.longitude;

        return Math.sqrt((deltaLat*deltaLat)+(deltaLon*deltaLon)) * 100000;
    }

}
