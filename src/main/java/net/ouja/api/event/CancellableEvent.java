package net.ouja.api.event;

public interface CancellableEvent {

    /**
     * Controls whether the event will be cancelled or not
     */
    public void setCancel(boolean cancel);

    /**
     * @return the cancelled state
     */
    public boolean isCancelled();
}
