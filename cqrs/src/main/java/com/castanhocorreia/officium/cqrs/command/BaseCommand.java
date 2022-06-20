package com.castanhocorreia.officium.cqrs.command;

import com.castanhocorreia.officium.cqrs.message.BaseMessage;
import lombok.*;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
@SuperBuilder
@ToString
public abstract class BaseCommand extends BaseMessage {}
