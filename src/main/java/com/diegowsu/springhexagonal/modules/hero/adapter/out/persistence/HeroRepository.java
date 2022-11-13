package com.diegowsu.springhexagonal.modules.hero.adapter.out.persistence;

import com.diegowsu.springhexagonal.common.annotations.Adapter;
import com.diegowsu.springhexagonal.modules.hero.application.port.out.HeroRepositoryPort;
import com.diegowsu.springhexagonal.modules.hero.domain.model.Hero;
import org.springframework.stereotype.Repository;

@Adapter
@Repository
public class HeroRepository implements HeroRepositoryPort {

    private final HeroJpaRepository heroJpaRepository;

    HeroRepository(HeroJpaRepository heroJpaRepository) {
        this.heroJpaRepository = heroJpaRepository;
    }

    @Override
    public Hero create(Hero hero) {
        HeroEntity heroEntity = HeroEntityMapper.INSTANCE.toEntity(hero);
        return HeroEntityMapper.INSTANCE.toDomainModel(heroJpaRepository.save(heroEntity));
    }

}
