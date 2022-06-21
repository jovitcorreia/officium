package com.castanhocorreia.officium.cqrs.command;

@FunctionalInterface
public interface CommandHandler<T extends BaseCommand> {
  void handle(T command);
}
