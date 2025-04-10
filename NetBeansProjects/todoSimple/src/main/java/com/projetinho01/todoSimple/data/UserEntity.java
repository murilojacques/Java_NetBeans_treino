/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projetinho01.todoSimple.data;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.Data;

/**
 *
 * @author Murilo
 */
@Data
@Entity
@Table(name = UserEntity.TABLE_NAME, uniqueConstraints = {
    @UniqueConstraint(columnNames = "id")})
public class UserEntity implements Serializable{
    
//    public interface CreateUser {
//    }
//    
//    public interface UpdateUser {
//    }
    
    public static final String TABLE_NAME = "user";
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Long id;
    
    
    @Column(length = 100, nullable = false, unique = true)
    @NotBlank() //valida se o valor de usuario não é Null nem vazio
    @Size(min = 2, max = 100)
    private String username;
    
    
    @JsonProperty(access = Access.WRITE_ONLY)
    @Column(length = 100, nullable = false)
    @NotBlank()
    @Size(min = 8, max = 100)
    private String password;
    
    
    @JsonIgnore
    @JsonProperty(access = Access.WRITE_ONLY)
    @OneToMany(mappedBy = "user")
    private List<TaskEntity> tasks = new ArrayList<TaskEntity>();

    public Long getId() {
        return id;
    }
    
    
    @ElementCollection(fetch = FetchType.EAGER)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @CollectionTable(name = "user_Profile")
    @Column(name = "profile", nullable = false)
    private Set<Integer> profiles = new HashSet<>();
    
    public Set<ProfileEnum> getProfile(){
        return this.profiles.stream().map(x -> ProfileEnum.toEnum(x)).collect(Collectors.toSet());
    }
    
    public void addProfile(ProfileEnum profileEnum){
        this.profiles.add(profileEnum.getCode());
    }
    
}
