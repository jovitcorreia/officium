package com.castanhocorreia.officium.cqrs.infra;

import com.castanhocorreia.officium.cqrs.command.BaseCommand;
import com.castanhocorreia.officium.cqrs.command.CommandHandler;

public interface CommandDispatcher {
  <T extends BaseCommand> void registerHandler(Class<T> type, CommandHandler<T> handler);
}
