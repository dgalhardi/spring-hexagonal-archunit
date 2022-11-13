package com.diegowsu.springhexagonal.modules.hero.adapter.outbound;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroJpaRepository extends JpaRepository<HeroEntity, Long> {
}
