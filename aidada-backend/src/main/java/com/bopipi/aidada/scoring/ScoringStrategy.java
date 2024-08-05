package com.bopipi.aidada.scoring;


import com.bopipi.aidada.model.entity.App;
import com.bopipi.aidada.model.entity.UserAnswer;

import java.util.List;

/**
 * 评分策略
 *
 * @author bopipi
 */
public interface ScoringStrategy {

    /**
     * 执行评分
     *
     * @param choices
     * @param app
     * @return
     * @throws Exception
     */
    UserAnswer doScore(List<String> choices, App app) throws Exception;
}