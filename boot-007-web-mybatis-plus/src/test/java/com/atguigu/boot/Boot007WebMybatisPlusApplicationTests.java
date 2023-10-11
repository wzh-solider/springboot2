package com.atguigu.boot;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@DisplayName("Junit5功能测试类")
class Boot007WebMybatisPlusApplicationTests {

    @BeforeAll
    public static void testBeforeAll() {
        System.out.println("所有单元测试开始");
    }


    @Disabled // 禁用测试类
    @Test
    void contextLoads() {
    }

    @BeforeEach
    @Test
    public void testBeforeEach() {
        System.out.println("单个单元测试开始");
    }

    @DisplayName("测试@DisplayName")
    @Test
    public void testDisplayName() {
        System.out.println("1");
    }

    @AfterEach
    @Test
    public void testAfterEach() {
        System.out.println("单个单元测试结束");
    }

    @Tag("testTag")
    @Timeout(5)
    @Test
    public void testTag() throws InterruptedException {
        Thread.sleep(1000 * 10);
        System.out.println("testTag");
    }

    @AfterAll
    public static void testAfterAll() {
        System.out.println("所有单元测试结束");
    }

}
