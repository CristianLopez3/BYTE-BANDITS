package com.sena.senasoft.domain.goals;

import com.sena.senasoft.domain.user.User;
import com.sena.senasoft.domain.user.UserServiceImpl;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GoalServiceImpl implements IGoalService {

    /**
     * Dependency injection
     */
    private final GoalRepository goalRepository;
    private final UserServiceImpl userService;
    @Override
    public Goals saveGoal(GoalDto goalDto) {
        User user = userService.getUser(goalDto.user());
        Goals goals = new Goals();
        goals.setUser(user);
        goals.setDescription(goalDto.description());
        goals.setStart(goalDto.start());
        goals.setFinish(goalDto.finish());
        return goalRepository.save(goals);
    }

    @Override
    public List<Goals> getGoalList() {
        return null;
    }

    @Override
    public Goals getGoal(Long id) {
        Optional<Goals> goals = goalRepository.findById(id);
        if (goals.isEmpty()) {
            throw new EntityNotFoundException("Goal not found");
        }
        return goals.get();
    }

    @Override
    public Goals updateGoal(Long id, GoalDto goalDto) {
        Optional<Goals> goals = goalRepository.findById(id);
        if (goals.isEmpty()) {
            throw new EntityNotFoundException("Form not found");
        }
        Goals realGoal = goals.get();
        realGoal.setDescription(goalDto.description());
        realGoal.setFinish(goalDto.finish());
        realGoal.setStart(goalDto.start());
        return goalRepository.save(realGoal);
    }

    @Override
    public void deleteGoal(Long id) {
        Optional<Goals> goals = goalRepository.findById(id);
        if (goals.isEmpty()) {
            throw new EntityNotFoundException("Goal not found");
        }
        goalRepository.delete(goals.get());
    }
    /**
     * @param id
     * @return list of choices for a given question
     */
    @Override
    public List<Goals> findGoalByUser(Long id) {
        return goalRepository.findByUserId(id);
    }
}
