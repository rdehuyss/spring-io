package org.jobrunr.springio.common;

import org.jobrunr.jobs.lambdas.JobRequest;
import org.jobrunr.jobs.lambdas.JobRequestHandler;
import org.springframework.stereotype.Component;

@Component
public class ChristopherColumbusRelaxRequestHandler implements JobRequestHandler<ChristopherColumbusRelaxRequestHandler.ChristopherColumbusRelaxRequest> {

    @Override
    public void run(ChristopherColumbusRelaxRequest christopherColumbusRelaxRequest) throws Exception {
        System.out.println("Relaxing Chistopher Columbus by playing " + christopherColumbusRelaxRequest.tableGame + " and drinking " + christopherColumbusRelaxRequest.beerType);
    }

    public record ChristopherColumbusRelaxRequest(String tableGame, String beerType) implements JobRequest {

        @Override
        public Class<ChristopherColumbusRelaxRequestHandler> getJobRequestHandler() {
            return ChristopherColumbusRelaxRequestHandler.class;
        }
    }
}
