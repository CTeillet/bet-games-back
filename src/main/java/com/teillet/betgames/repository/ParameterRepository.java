package com.teillet.betgames.repository;

import com.teillet.betgames.enums.ParameterEnum;
import com.teillet.betgames.model.Parameter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParameterRepository extends JpaRepository<Parameter, String> {
    Parameter findByName(ParameterEnum name);
}
