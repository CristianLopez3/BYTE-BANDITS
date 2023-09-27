package com.sena.senasoft.domain.score;


import java.util.List;

public interface IScoreService {
    Score saveScore(ScoreDto scoreDto);
    List<Score> getScoreList();
    Score getScore(Long id);
    List<Score> findScoreByUser(Long id);
    List<Score> findScoreyForm(Long id);

}
