package net.ouja.api.entity.passive;

public interface Sniffer {

    /**
     * @return if the sniffer is panicking
     */
    public boolean isPanicked();

    /**
     * @return if the sniffer is searching
     */
    public boolean isSearching();

    /**
     * @return if the sniffer is tempted
     */
    public boolean isTempted();

    /**
     * @return the sniffer's state
     */
    public SnifferState getState();
}
