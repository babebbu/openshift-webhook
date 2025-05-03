package dev.babebbu.openshiftalertwebhook;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class WebhookController {

    @GetMapping
    public ResponseEntity<?> webhook(@RequestBody Object request) {
        log.info("{}", request);
        return ResponseEntity.ok().build();
    }

}
