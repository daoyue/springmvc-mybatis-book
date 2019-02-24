package com.ay.model;

import lombok.*;

import java.io.Serializable;

/**
 * Author innjewel
 * Description 用户实体
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AyUser implements Serializable {

    private Integer id;
    private String name;
    private String password;

}
