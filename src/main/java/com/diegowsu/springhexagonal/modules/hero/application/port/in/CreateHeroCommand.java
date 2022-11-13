package com.diegowsu.springhexagonal.modules.hero.application.port.in;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class CreateHeroCommand {
    private String name;
    private String realName;
    private Integer strength;
}
