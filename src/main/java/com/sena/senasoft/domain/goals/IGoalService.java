package com.sena.senasoft.domain.goals;

import java.util.List;

public interface IGoalService {
    Goals saveGoal(GoalDto goalDto);
    List<Goals> getGoalList();
    Goals getGoal(Long id);
    Goals updateGoal(Long id, GoalDto goalDto);
    void deleteGoal(Long id);
    List<Goals> findGoalByUser(Long id);
}
