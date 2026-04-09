package org.jobrunr.springio.demo1;

import org.jobrunr.springio.common.Region;
import org.jobrunr.springio.common.ChristopherColumbusRelaxRequestHandler.ChristopherColumbusRelaxRequest;
import org.jobrunr.springio.common.ChristopherColumbusService;
import org.jobrunr.scheduling.JobRequestScheduler;
import org.jobrunr.scheduling.JobScheduler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo1")
public class Demo1API {

    private final JobScheduler jobScheduler;
    private final JobRequestScheduler jobRequestScheduler;
    private final ChristopherColumbusService christopherColumbusService;

    public Demo1API(JobScheduler jobScheduler, JobRequestScheduler jobRequestScheduler, ChristopherColumbusService christopherColumbusService) {
        this.jobScheduler = jobScheduler;
        this.jobRequestScheduler = jobRequestScheduler;
        this.christopherColumbusService = christopherColumbusService;
    }

    @GetMapping("/enqueue-via-lambda")
    public String createJobViaLambda(@RequestParam(required = false, defaultValue = "chess") String tableGame, @RequestParam(required = false, defaultValue = "Estrella") String beerType) {
        // use the JobScheduler to make sure Christoper Columbus relaxes
        return "ok";
    }

    @GetMapping("/enqueue-via-jobrequest")
    public String createJobViaJobRequest(@RequestParam(required = false, defaultValue = "chess") String tableGame, @RequestParam(required = false, defaultValue = "Estrella") String beerType) {
        // use the JobRequestScheduler to make sure Christoper Columbus relaxes
        return "ok";
    }

    @GetMapping("/do-expedition")
    public String doExpedition(@RequestParam(required = false, defaultValue = "belgium") Region region) {
        jobScheduler.enqueue(() -> christopherColumbusService.doExpedition(region));
        return "ok";
    }
}
