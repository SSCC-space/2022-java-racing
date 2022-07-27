package org.sscc.study.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.sscc.study.view.InputView;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class RoundInputTest {
    public static InputStream generateInput(String input) {
        return new ByteArrayInputStream(input.getBytes());
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "1.5",
            "a",
            "*",
            "#$%"
    })
    @DisplayName("라운드 횟수 테스트 : 정수 외 입력 필터링")
    void shouldThrowInputMismatchException_When_InvalidInput(String input) {
        //given
        InputStream in = generateInput(input);
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        //when
        InputView inputView = new InputView(scanner);
        //then
        assertThatThrownBy(inputView::roundNumber).isInstanceOf(InputMismatchException.class);
    }
}