package com.diegowsu.springhexagonal.modules.hero.application.port.out;

import com.diegowsu.springhexagonal.modules.hero.domain.model.Hero;

public interface HeroRepositoryPort {
    Hero create(Hero hero);
}
