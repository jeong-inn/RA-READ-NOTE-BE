package com.example.fa.member.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class MemberDTO {
    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;
}
