package org.acme;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class ReportRepository {
    HashMap<UUID, Payment> payments = new HashMap<>(){{
        put(UUID.randomUUID(), new Payment("p1","c1","m1","Token1", BigDecimal.valueOf(100),"submit"));
        put(UUID.randomUUID(), new Payment("p2","c1","m1","Token11", BigDecimal.valueOf(150),"transfer"));
        put(UUID.randomUUID(), new Payment("p3","c2","m2","Token2", BigDecimal.valueOf(200),"submit"));
        put(UUID.randomUUID(), new Payment("p4","c2","m2","Token22", BigDecimal.valueOf(250),"transfer"));
        put(UUID.randomUUID(), new Payment("p5","c2","m3","Token222", BigDecimal.valueOf(255),"submit"));
        put(UUID.randomUUID(), new Payment("p6","c3","m1","Token3", BigDecimal.valueOf(300),"transfer"));
        put(UUID.randomUUID(), new Payment("p7","c3","m3","Token32", BigDecimal.valueOf(350),"submit"));
    }};

}
