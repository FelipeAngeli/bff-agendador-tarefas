package com.felipe.bffagendadortarefas.business.dto.in;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginDTORequest {
    private  String email;
    private  String senha;
}
