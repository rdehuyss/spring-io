package org.jobrunr.springio.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import static org.jobrunr.utils.StringUtils.isNotNullOrEmpty;

@Service
public class ChristopherColumbusService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChristopherColumbusService.class);

    public void playSomeTableGamesAndDrinkSomeBeer(String tableGame, String beerType) {
        System.out.println("Playing table game " + tableGame + " and drinking beer " + beerType);
    }

    public void doFishing(String fishType, String naturalDisaster) {
        System.out.println("Doing some fishing and hope to catch some " + fishType);
        if (isNotNullOrEmpty(naturalDisaster)) {
            throw new NaturalDisasterException(naturalDisaster);
        }
    }

    public void doExpedition(Region region) throws InterruptedException {
        LOGGER.info("Starting a new expedition to " + region);
        Thread.sleep(15_000);
        LOGGER.info("Continuing expedition to " + region);
        Thread.sleep(15_000);
        LOGGER.info("Conquering " + region);
        Thread.sleep(15_000);
        LOGGER.info("Returning home from " + region);
        Thread.sleep(15_000);
        LOGGER.info("Celebrating our victory from the expedition to " + region);
    }
}
