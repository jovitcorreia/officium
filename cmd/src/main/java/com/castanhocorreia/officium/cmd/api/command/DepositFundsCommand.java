package com.castanhocorreia.officium.cmd.api.command;

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
public class DepositFundsCommand extends BaseCommand {
  private BigDecimal amount;
}
