package com.diegowsu.springhexagonal.modules.hero.adapter.outbound;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Hero")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class HeroEntity {
    @Id
    @GeneratedValue
    Long id;
    String name;
    String realName;
    Integer strength;
}
