package net.ouja.api.server.players;

import javax.annotation.Nullable;
import java.util.Date;

public class BanEntry {
    private final Date created;
    private final String source;
    private final Date expires;
    private final String reason;

    public BanEntry(Date created, String source, @Nullable Date expires, String reason) {
        this.created = created;
        this.source = source;
        this.expires = expires;
        this.reason = reason;
    }

    public Date getCreated() {
        return created;
    }

    public String getSource() {
        return source;
    }

    public Date getExpires() {
        return expires;
    }

    public String getReason() {
        return reason;
    }

    public boolean hasExpired() {
        return this.expires == null ? false : this.expires.before(new Date());
    }
}
