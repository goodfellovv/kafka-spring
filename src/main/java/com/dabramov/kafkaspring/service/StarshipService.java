package com.dabramov.kafkaspring.service;

import com.dabramov.kafkaspring.dto.StarshipDto;

public interface StarshipService {

    StarshipDto save(StarshipDto dto);

    void send(StarshipDto dto);

    void consume(StarshipDto dto);
}
