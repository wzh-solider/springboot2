package com.atguigu.boot;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

/**
 * @author Solider
 * @version 1.0
 * @Date 2023/10/11 20:52
 * @since 1.0
 */
@SpringBootTest
@DisplayName("参数化测试")
public class ParamsTest {

    @ParameterizedTest
    @DisplayName("参数化测试")
    // @ValueSource(ints = {1, 2, 3, 4, 5})
    @MethodSource("stringProvider")
    public void testParam(String s) {
        System.out.println(s);
    }

    public static Stream<String> stringProvider() {
        return Stream.of("apple", "banana", "orange");
    }
}
