package com.castanhocorreia.officium.cmd.api.command;

import com.castanhocorreia.officium.common.dto.AccountType;
import com.castanhocorreia.officium.common.dto.HolderData;
import com.castanhocorreia.officium.cqrs.command.BaseCommand;
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
public class OpenAccountCommand extends BaseCommand {
  private HolderData holder;
  private AccountType type;
  private BigDecimal openingBalance;
}
