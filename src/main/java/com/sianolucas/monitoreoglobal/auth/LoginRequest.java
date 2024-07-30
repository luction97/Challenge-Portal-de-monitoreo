package com.sianolucas.monitoreoglobal.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class LoginRequest {

    String email;
    String password;
    String firstName;
    String lastName;



}
