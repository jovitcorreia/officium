package com.castanhocorreia.officium.common.event;

import com.castanhocorreia.officium.cqrs.event.BaseEvent;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Getter
@NoArgsConstructor
@Setter
@SuperBuilder
@ToString
public class FundsDepositedEvent extends BaseEvent {
  private BigDecimal amount;
}
