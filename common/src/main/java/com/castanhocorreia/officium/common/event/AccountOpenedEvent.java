package com.castanhocorreia.officium.common.event;

import com.castanhocorreia.officium.common.dto.AccountType;
import com.castanhocorreia.officium.common.dto.HolderData;
import com.castanhocorreia.officium.cqrs.event.BaseEvent;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Setter
@SuperBuilder
@ToString
public class AccountOpenedEvent extends BaseEvent {
  private HolderData holder;
  private AccountType type;
  private BigDecimal openingBalance;
  private LocalDateTime createdDate;
}
