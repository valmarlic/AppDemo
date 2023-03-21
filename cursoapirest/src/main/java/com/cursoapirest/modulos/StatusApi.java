package com.cursoapirest.modulos;

import org.springframework.http.ResponseEntity;

public interface StatusApi{
    ResponseEntity<StatusDTO> getStatus();
}
