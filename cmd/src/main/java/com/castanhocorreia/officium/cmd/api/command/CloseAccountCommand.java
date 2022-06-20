package com.castanhocorreia.officium.cmd.api.command;

import com.castanhocorreia.officium.cqrs.command.BaseCommand;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@NoArgsConstructor
@Setter
@SuperBuilder
@ToString
public class CloseAccountCommand extends BaseCommand {}
