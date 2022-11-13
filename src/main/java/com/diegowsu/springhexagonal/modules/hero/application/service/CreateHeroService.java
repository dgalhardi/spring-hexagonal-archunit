package com.diegowsu.springhexagonal.modules.hero.application.service;

import com.diegowsu.springhexagonal.common.annotations.UseCase;
import com.diegowsu.springhexagonal.modules.hero.application.port.inbound.CreateHeroCommand;
import com.diegowsu.springhexagonal.modules.hero.application.port.inbound.CreateHeroPort;
import com.diegowsu.springhexagonal.modules.hero.application.port.outbound.HeroRepositoryPort;
import com.diegowsu.springhexagonal.modules.hero.domain.model.Hero;

@UseCase
public class CreateHeroService implements CreateHeroPort {

    private final HeroRepositoryPort heroRepositoryPort;

    CreateHeroService(HeroRepositoryPort heroRepositoryPort) {
        this.heroRepositoryPort = heroRepositoryPort;
    }

    @Override
    public Hero create(CreateHeroCommand command) {
        Hero hero = Hero.builder()
                .name(command.getName())
                .realName(command.getRealName())
                .strength(command.getStrength())
                .build();
        return heroRepositoryPort.create(hero);
    }

}
