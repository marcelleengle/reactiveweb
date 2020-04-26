package com.pokedex.reactiveweb.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class PokemonEvent {
    private Long eventId;
    private String eventType;

}
