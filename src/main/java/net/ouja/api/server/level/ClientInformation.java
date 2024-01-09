package net.ouja.api.server.level;

public interface ClientInformation {

    public String getLanguage();

    public int getViewDistance();

    public int getChatVisibility();

    public boolean isChatColors();

    public int getModelCustomisation();

    public String getMainHand();

    public boolean isTextFilteringEnabled();

    public boolean isAllowsListing();
}
