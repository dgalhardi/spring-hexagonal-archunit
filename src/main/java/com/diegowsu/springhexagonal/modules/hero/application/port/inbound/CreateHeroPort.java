package com.diegowsu.springhexagonal.modules.hero.application.port.inbound;

import com.diegowsu.springhexagonal.modules.hero.domain.model.Hero;

public interface CreateHeroPort {
    Hero create(CreateHeroCommand command);
}
