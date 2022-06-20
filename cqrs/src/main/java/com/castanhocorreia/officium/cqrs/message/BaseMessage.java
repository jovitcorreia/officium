package com.castanhocorreia.officium.cqrs.message;

import lombok.*;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
@SuperBuilder
@ToString
public abstract class BaseMessage {
  private String id;
}
