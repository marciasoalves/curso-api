package br.com.dicasdeumdev.api.domain.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
public class UserDTO {

    private Integer Id;
    private String name;
    private String email;

    @JsonIgnore
    private String password;
}
