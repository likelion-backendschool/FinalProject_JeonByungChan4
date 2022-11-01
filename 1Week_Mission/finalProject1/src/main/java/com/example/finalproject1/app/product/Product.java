package com.example.finalproject1.app.product;

import com.example.finalproject1.app.member.Member;
import com.example.finalproject1.base.BaseEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Entity
@Getter @Setter
@SuperBuilder
@ToString(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class Product extends BaseEntity {

    private String subject;

    private int price;

    @ManyToOne(fetch = FetchType.LAZY)
    private Member author;

//    @ManyToOne(fetch = FetchType.LAZY)
//    private PostKeyword postKeyword;
}
