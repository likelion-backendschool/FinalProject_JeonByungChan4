package com.example.finalproject1.app.postkeyword;

import com.example.finalproject1.base.BaseEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@SuperBuilder
@ToString(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class PostKeyword extends BaseEntity {

    private String content;

}
