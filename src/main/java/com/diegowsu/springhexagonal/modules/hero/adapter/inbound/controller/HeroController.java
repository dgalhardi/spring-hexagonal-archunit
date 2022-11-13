package com.diegowsu.springhexagonal.modules.hero.adapter.inbound.controller;

import com.diegowsu.springhexagonal.common.annotations.Adapter;
import com.diegowsu.springhexagonal.modules.hero.application.port.inbound.CreateHeroCommand;
import com.diegowsu.springhexagonal.modules.hero.application.port.inbound.CreateHeroPort;
import com.diegowsu.springhexagonal.modules.hero.commons.dto.CreateHeroDto;
import com.diegowsu.springhexagonal.modules.hero.commons.dto.HeroDto;
import com.diegowsu.springhexagonal.modules.hero.commons.mapper.HeroDtoMapper;
import com.diegowsu.springhexagonal.modules.hero.domain.model.Hero;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@Adapter
@RestController()
@Tag(name = "Hero")
@RequestMapping(path = "/api/heroes")
public class HeroController {

    private final CreateHeroPort createHeroPort;

    HeroController(CreateHeroPort createHeroPort) {
        this.createHeroPort = createHeroPort;
    }

    @PostMapping
    HeroDto createHero(@RequestBody CreateHeroDto heroDto) {
        CreateHeroCommand command = CreateHeroCommand.builder()
                .name(heroDto.getName())
                .realName(heroDto.getRealName())
                .strength(heroDto.getStrength())
                .build();
        Hero createdHero = createHeroPort.create(command);
        return HeroDtoMapper.INSTANCE.toDto(createdHero);
    }

}
