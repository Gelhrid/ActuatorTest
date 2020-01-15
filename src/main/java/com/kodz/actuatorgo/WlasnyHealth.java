package com.kodz.actuatorgo;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class WlasnyHealth implements HealthIndicator {

    private Obiekcik obiekcik;

    public WlasnyHealth(Obiekcik obiekcik) {
        this.obiekcik = obiekcik;
    }

    @Override
    public Health health() {
        int errorCode = check(); // perform some specific health check
        if (errorCode == 0) {
            return Health.down()
                    .withDetail("BLABLABLA", obiekcik.dawaj()).build();
        }
        return Health.up().build();
    }

    public int check() {
        // Our logic to check health
        return 0;
    }
}
