package com.bopipi.aidada.model.dto.question;

import lombok.Data;

import java.io.Serializable;

/**
 * AI生成题目请求
 *
 * @author bopipi
 * @date 2024-08-02
 */
@Data
public class AiGenerateQuestionRequest implements Serializable {

    private Long appId;

    private int questionNumber = 10;

    private int optionNumber = 2;

    private static final long serialVersionUID = 1L;
}
