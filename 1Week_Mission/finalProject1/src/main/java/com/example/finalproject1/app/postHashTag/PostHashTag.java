package com.example.finalproject1.app.postHashTag;

import com.example.finalproject1.app.member.Member;
import com.example.finalproject1.app.post.Post;
import com.example.finalproject1.app.postkeyword.PostKeyword;
import com.example.finalproject1.app.base.BaseEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@SuperBuilder
@ToString(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class PostHashTag extends BaseEntity {

    @ManyToOne
    @ToString.Exclude
    private Member author;

    @ManyToOne
    @ToString.Exclude
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Post post;

    @ManyToOne
    @ToString.Exclude
    private PostKeyword postKeyword;
}
