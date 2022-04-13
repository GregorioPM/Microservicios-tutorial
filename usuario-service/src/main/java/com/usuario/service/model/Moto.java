package com.usuario.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Moto {

    private String marca;
    private String modelo;
    private int usuarioId;

}
