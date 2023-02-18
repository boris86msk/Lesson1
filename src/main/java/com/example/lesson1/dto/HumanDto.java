package com.example.lesson1.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
//@Data  //заменяет первые 3 ант.
public class HumanDto {

    private String name;

    private Integer age;
}
