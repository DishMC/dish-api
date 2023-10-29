package net.ouja.api.event.vehicle;

import net.ouja.api.Player;
import net.ouja.api.event.CancellableEvent;
import net.ouja.api.event.EventListener;

import java.util.ArrayList;

public class VehicleMoveEvent implements EventListener, CancellableEvent {
    private boolean isCancelled = false;
    private final ArrayList<Player> passengers;
    private final double x;
    private final double y;
    private final double z;
    private final double xOld;
    private final double yOld;
    private final double zOld;

    public VehicleMoveEvent(ArrayList<Player> passengers, double x, double y, double z, double xOld, double yOld, double zOld) {
        this.passengers = passengers;
        this.x = x;
        this.y = y;
        this.z = z;
        this.xOld = xOld;
        this.yOld = yOld;
        this.zOld = zOld;
    }

    @Override
    public void setCancel(boolean cancel) {
        this.isCancelled = cancel;
    }

    @Override
    public boolean isCancelled() {
        return this.isCancelled;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double getxOld() {
        return xOld;
    }

    public double getyOld() {
        return yOld;
    }

    public double getzOld() {
        return zOld;
    }

    public ArrayList<Player> getPassengers() {
        return passengers;
    }
}
