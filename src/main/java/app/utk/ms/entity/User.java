package app.utk.ms.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.beans.factory.annotation.Required;

import javax.persistence.*;

@Entity
@Table(name = "INTERNAL_USER")
@Cacheable
@DynamicInsert
@DynamicUpdate
public class User extends BaseEntity {

    private String username;

    private String password;

    @Embedded
    private EntityMetaData entityMetaData;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public EntityMetaData getEntityMetaData() {
        return entityMetaData;
    }

    public void setEntityMetaData(EntityMetaData entityMetaData) {
        this.entityMetaData = entityMetaData;
    }

    User() {

    }

    @PrePersist
    public void beforeSavingUser(){
        System.out.println("Going to Add New User");
    }

    @PostPersist
    public void afterSavingUser(){
        System.out.println("Added a New User");
    }
}
