package com.spti.helloworld1.entity;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PersonRoleId implements Serializable {
    private static final long serialVersionUID = 4517889629645459736L;
    @Column(name = "person_id", nullable = false)
    private Integer personId;

    @Column(name = "role_id", nullable = false)
    private Integer roleId;

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PersonRoleId entity = (PersonRoleId) o;
        return Objects.equals(this.roleId, entity.roleId) &&
                Objects.equals(this.personId, entity.personId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, personId);
    }

}