package com.diegowsu.springhexagonal.modules.hero.commons.mapper;

import com.diegowsu.springhexagonal.modules.hero.commons.dto.HeroDto;
import com.diegowsu.springhexagonal.modules.hero.commons.dto.CreateHeroDto;
import com.diegowsu.springhexagonal.modules.hero.domain.model.Hero;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface HeroDtoMapper {

    HeroDtoMapper INSTANCE = Mappers.getMapper(HeroDtoMapper.class);

    HeroDto toDto(Hero hero);

    Hero toDomainModel(CreateHeroDto heroDto);
}
