package com.sena.senasoft.domain.goals;

import java.util.List;

public interface IGoalService {
    Goal saveGoal(GoalDto goalDto);
    List<Goal> getGoalList();
    Goal getGoal(Long id);
    Goal updateGoal(Long id, GoalDto goalDto);
    void deleteGoal(Long id);
    List<Goal> findGoalByUser(Long id);
}
