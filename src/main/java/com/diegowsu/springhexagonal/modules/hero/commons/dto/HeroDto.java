package com.diegowsu.springhexagonal.modules.hero.commons.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HeroDto {
    Long id;
    String name;
    String realName;
    Integer strength;
}
