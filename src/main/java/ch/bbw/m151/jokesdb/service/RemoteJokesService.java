package ch.bbw.m151.jokesdb.service;

import ch.bbw.m151.jokesdb.datamodel.JokesDto;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class RemoteJokesService {
    public JokesDto jotd() {
        WebClient client = WebClient.builder()
                .baseUrl("https://v2.jokeapi.dev")
                .build();
        return client.get()
                .uri("/joke/Programming?type=single")
                .retrieve()
                .bodyToMono(JokesDto.class)
                .block();
    }

}
