package com.castanhocorreia.officium.common.event;

import com.castanhocorreia.officium.cqrs.event.BaseEvent;
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
public class AccountClosedEvent extends BaseEvent {}
