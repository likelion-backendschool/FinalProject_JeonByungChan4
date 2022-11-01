package com.example.finalproject1.app.base;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import static javax.persistence.GenerationType.*;

@Getter
@MappedSuperclass
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class)
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @CreatedDate
    private LocalDateTime createDate;

    @LastModifiedDate
    private LocalDateTime updateDate;

    @Transient // ( DB 필드가 되는 것을 막는 어노테이션)
    @Builder.Default
    // 이 필드 덕분에 다양한 DTO 클래스를 만들 필요성이 줄어들게 된다.
    // 하지만 이 방식은 DTO 방식에 비해서 휴먼에러가 일어날 확률을 높힌다.
    // 그것은 TDD로 보완 해야 한다.
    private Map<String, Object> extra = new LinkedHashMap<>();

    public BaseEntity(Long id) {
        this.id = id;
    }
}