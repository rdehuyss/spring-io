package org.jobrunr.springio.common;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Component;

@Component
public class TranslationService {

    private final ChatClient chatClient;

    public TranslationService(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder
                .defaultSystem("Translate all given input to native indian language")
                .build();
    }

    public String translate(String userInput) {
        return this.chatClient.prompt()
                .user(userInput)
                .call()
                .content();
    }
}
