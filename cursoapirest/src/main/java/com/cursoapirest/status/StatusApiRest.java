package com.cursoapirest.status;

import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusApiRest implements StatusApi{
    @GetMapping(value = "/status")
    @Override
    public ResponseEntity<StatusDTO> getStatus() {
        StatusDTO statusDTO = new StatusDTO();
        return ResponseEntity.ok().body(statusDTO);
    }
}
