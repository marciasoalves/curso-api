package br.com.dicasdeumdev.api.domain.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
public class UserDto {

    private Integer Id;
    private String name;
    private String email;
    private String password;
}
