package com.castanhocorreia.officium.cqrs.event;

import com.castanhocorreia.officium.cqrs.message.BaseMessage;
import lombok.*;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
@SuperBuilder
@ToString
public abstract class BaseEvent extends BaseMessage {
  private int version;
}
