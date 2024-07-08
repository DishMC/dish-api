package net.ouja.api.server;

import net.ouja.api.network.chat.Component;

import java.net.URI;

public class ServerLink {
  private final Component link;
  private final URI uri;

  public ServerLink(Component link, URI uri) {
	this.link = link;
	this.uri = uri;
  }

  public Component getLink() {
	return this.link;
  }

  public URI getUri() {
	return this.uri;
  }

  @Override
  public String toString() {
	return "ServerLinks{" +
			"link='" + link + '\'' +
			", uri=" + uri +
			'}';
  }
}
