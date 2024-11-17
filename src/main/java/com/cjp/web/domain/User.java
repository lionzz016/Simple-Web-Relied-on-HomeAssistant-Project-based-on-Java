package com.cjp.web.domain;

import lombok.*;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * user
 * @author 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Component
public class User implements Serializable {
    private Integer userId;

    private String userName;

    private String userPassword;

    private static final long serialVersionUID = 1L;

}