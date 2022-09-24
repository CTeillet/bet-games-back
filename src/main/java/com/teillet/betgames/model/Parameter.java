package com.teillet.betgames.model;

import com.teillet.betgames.enums.ParameterEnum;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Parameter {
    @Id
    private ParameterEnum name;
    private Date value;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Parameter parameter = (Parameter) o;
        return name != null && Objects.equals(name, parameter.name);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
