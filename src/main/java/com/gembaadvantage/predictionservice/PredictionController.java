package com.gembaadvantage.predictionservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/prediction")
public class PredictionController {
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/football")
    public FootballResult football(@RequestParam(value = "home", defaultValue= "HomeTeam") String home, @RequestParam(value = "away", defaultValue = "AwayTeam") String away) {
        return new FootballResult(counter.incrementAndGet(), home, away);
    }
}
