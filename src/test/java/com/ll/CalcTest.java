package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.*;

class CalcTest {
    @Test
    @DisplayName("1 + 1 = 2")
    void t1() {
        assertThat(new Calc().run("1 + 1")).isEqualTo(2);
    }

    @Test
    @DisplayName("13 + 2 = 15")
    void t2() {
        assertThat(new Calc().run("13 + 2")).isEqualTo(15);
    }

    @Test
    @DisplayName("50 - 30 = 20")
    void t3() {
        assertThat(new Calc().run("50 - 30")).isEqualTo(20);
    }

    @Test
    @DisplayName("10 + 20 + 30 = 60")
    void t4() {
        assertThat(Calc.run("10 + 20 + 30")).isEqualTo(60);
    }

    @Test
    @DisplayName("10 - 20 + 30 = 20")
    void t5() {
        assertThat(Calc.run("10 - 20 + 30")).isEqualTo(20);
    }

    @Test
    @DisplayName("10 - 10 - 10 - 10 - 10 = -30")
    void t6() {
        assertThat(Calc.run("10 - 10 - 10 - 10 - 10")).isEqualTo(-30);
    }
}