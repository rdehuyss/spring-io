package org.jobrunr.springio.demo3;

import org.jobrunr.springio.common.ChristopherColumbusService;
import org.jobrunr.scheduling.JobScheduler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo3")
public class Demo3API {

    private final JobScheduler jobScheduler;
    private final ChristopherColumbusService christopherColumbusService;

    public Demo3API(JobScheduler jobScheduler, ChristopherColumbusService christopherColumbusService) {
        this.jobScheduler = jobScheduler;
        this.christopherColumbusService = christopherColumbusService;
    }

    @GetMapping("/fish-job")
    public String fetchSomeFish(@RequestParam(required = false, defaultValue = "salmon") String fishType, @RequestParam(required = false, defaultValue = "") String naturalDisaster) {
        // use the ChristopherColumbusService to fetch some fresh fish via a job but be careful with natural disasters!
        // try to limit the amount of retries
        return "ok";
    }
}
