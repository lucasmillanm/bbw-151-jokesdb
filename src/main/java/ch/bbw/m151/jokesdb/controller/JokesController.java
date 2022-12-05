package ch.bbw.m151.jokesdb.controller;

import java.util.List;

import ch.bbw.m151.jokesdb.datamodel.JokesDto;
import ch.bbw.m151.jokesdb.datamodel.JokesEntity;
import ch.bbw.m151.jokesdb.service.JokesService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/jokes")
public class JokesController {
    private final JokesService jokesService;

    @PostMapping
    public JokesEntity addJoke(
            @Valid @RequestBody JokesEntity joke
    ) {
        return jokesService.addJoke(joke);
    }

    @GetMapping
    public List<JokesEntity> getJokes(Pageable pageable) {
        return jokesService.getAllJokes(pageable);
    }

    @GetMapping("/{id}")
    public JokesEntity getJokesById(
            @PathVariable Integer id
    ) throws Exception {
        return jokesService.getJokesById(id);
    }

    @GetMapping("/daily-joke")
    public JokesEntity getDailyJoke() {
        return this.jokesService.saveJokeToDB();
    }

    @Transactional
    @PutMapping("/{id}")
    public JokesEntity updateJoke(
            @PathVariable("id") Integer id,
            @Valid @RequestBody JokesDto joke
    ) throws Exception {
        return jokesService.updateJoke(id, joke);
    }

    @Transactional
    @PutMapping("/rate/{id}")
    public void rateJoke(
            @PathVariable("id") Integer id,
            @Valid @RequestBody String rating
    ) {
        jokesService.rateJoke(id, rating);
    }

    @DeleteMapping("/{id}")
    public void deleteJoke(
            @PathVariable("id") Integer id
    ) {
        jokesService.deleteJoke(id);
    }

}
