package net.ouja.api.event;

public abstract class Event {
    public Event() {}

    public abstract Handlers getHandlers();
}
