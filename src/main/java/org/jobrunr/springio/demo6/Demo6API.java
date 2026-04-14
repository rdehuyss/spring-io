package org.jobrunr.springio.demo6;

import org.jobrunr.scheduling.JobScheduler;
import org.jobrunr.springio.common.TranslationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo6")
public class Demo6API {

    private final JobScheduler jobScheduler;
    private final TranslationService translationService;

    public Demo6API(JobScheduler jobScheduler, TranslationService translationService) {
        this.jobScheduler = jobScheduler;
        this.translationService = translationService;
    }

    @GetMapping("/translate")
    public String translate(@RequestParam(required = false, defaultValue = "hello") String input) {
        // use the TranslationService to translate content from English to native indian
        return "ok";
    }
}
