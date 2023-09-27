package com.sena.senasoft.domain.score;

import com.sena.senasoft.domain.goals.GoalRepository;
import com.sena.senasoft.domain.user.User;
import com.sena.senasoft.domain.user.UserServiceImpl;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ScoreServiceImpl implements IScoreService {
    /**
     * Dependency injection
     */
    private final ScoreRepository scoreRepository;
    private final UserServiceImpl userService;
    @Override
    public Score saveScore(ScoreDto scoreDto) {
        User user = userService.getUser(scoreDto.user());
        Score score = new Score();
        score.setUser(user);
        score.setPoints(scoreDto.points());
        return scoreRepository.save(score);
    }

    @Override
    public List<Score> getScoreList() {
        return scoreRepository.findAll();
    }

    @Override
    public Score getScore(Long id) {
        Optional<Score> score = scoreRepository.findById(id);
        if (score.isEmpty()){
            throw new EntityNotFoundException("Score not found");
        }
        Score realScore = score.get();
        return score.get();
    }

    @Override
    public List<Score> findScoreByUser(Long id) {
        return scoreRepository.findByUserId(id);
    }

    @Override
    public List<Score> findScoreyForm(Long id) {
        return scoreRepository.findByFormId(id);
    }
}
