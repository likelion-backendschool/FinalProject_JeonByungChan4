package com.example.finalproject1.app.member;

import com.example.finalproject1.base.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@SuperBuilder
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class Member extends BaseEntity {

    @Column(unique = true)
    private String username;

    @JsonIgnore
    private String password;

    private String nickname; // 필명
    private String email;

    private AuthLevel authLevel; // 권한 레벨



    public Member(Long id) {
        super(id);
    }
}
