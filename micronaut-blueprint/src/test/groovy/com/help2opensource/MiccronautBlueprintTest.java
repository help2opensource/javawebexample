package com.help2opensource;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;

import javax.inject.Inject;

import com.help2opensource.service.Vehicle;

@MicronautTest
class MiccronautBlueprintTest {

    @Inject
    EmbeddedApplication<?> application;

    @Test
    void testItWorks() {
        ApplicationContext context = application.getApplicationContext();

        Vehicle vehicle = context.getBean(Vehicle.class);
        String expected = "Starting V8";
        String outcome = vehicle.start();
        assertEquals(outcome, expected);
    }

}
