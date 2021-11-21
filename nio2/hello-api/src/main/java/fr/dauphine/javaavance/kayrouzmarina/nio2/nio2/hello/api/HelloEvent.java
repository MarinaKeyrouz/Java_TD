package fr.dauphine.javaavance.kayrouzmarina.nio2.nio2.hello.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.google.common.base.Preconditions;
import lombok.Value;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = HelloEvent.GreetingMessageChanged.class, name = "greeting-message-changed")
})
public interface HelloEvent {

  String getName();

  @Value
  final class GreetingMessageChanged implements HelloEvent {
    public final String name;
    public final String message;

    @JsonCreator
    public GreetingMessageChanged(String name, String message) {
        this.name = Preconditions.checkNotNull(name, "name");
        this.message = Preconditions.checkNotNull(message, "message");
    }

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getMessage() {
		// TODO Auto-generated method stub
		return null;
	}
  }
}
