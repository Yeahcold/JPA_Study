package jpabook.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {
    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded
    private Address address;

    // 저는 연관관계의 주인이 아니에요! => mappedBy
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();

}
