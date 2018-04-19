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
        double radius = 6371000;

        double latDelta = Math.toRadians(Math.abs(this.latitude - other.latitude));
        double lonDelta = Math.toRadians(Math.abs(this.longitude - other.longitude));
        double a = Math.sin(latDelta/2) * Math.sin(latDelta/2) +
                Math.cos(Math.toRadians(this.latitude)) * Math.cos(Math.toRadians(other.latitude)) *
                Math.sin(lonDelta/2) * Math.sin(lonDelta/2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));

        return (double) (radius * c);
    }

}
