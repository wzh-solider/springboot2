package com.atguigu.boot;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Solider
 * @version 1.0
 * @Date 2023/10/11 20:27
 * @since 1.0
 */
@DisplayName("测试断言机制")
// @SpringBootTest
public class AssertTest {

    public int cal(int a, int b) {
        return a + b;
    }

    @Test
    @DisplayName("测试简单断言")
    public void TestSimpleAssertions() {
        int cal = cal(2, 3);

        // 测试相等
        assertEquals(5, cal, "业务逻辑计算失败！！！"); // 期待值5， 传入值cal

        // 测试对象
        Object obj1 = new Object();
        Object obj2 = new Object();
        assertSame(obj1, obj2, "两个对象不相同！！！");
    }

    @Test
    @DisplayName("测试数组断言")
    public void TestArrayAssertions() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        assertArrayEquals(arr1, arr2, "数组内容不相等！！！");
    }

    @Test
    @DisplayName("测试组合断言")
    public void TestAll() {
        assertAll("Math",
                () -> assertEquals(2, 1 + 1),
                () -> assertTrue(false)
        );
    }

    @Test
    @DisplayName("测试异常断言")
    public void TestExceptionAssertions() {
        assertThrowsExactly(NumberFormatException.class, () -> {
            // Integer.parseInt("a");
            // int i = 1 / 0;
        }, "业务逻辑居然正常运行！！！");
    }

    @Test
    @DisplayName("快速失败")
    public void testFail() {
        if (2 > 1) {
            fail("测试失败！！！");
        }
    }

    @Test
    @DisplayName("测试前置条件")
    public void testAssumptions() {
        Assumptions.assumeTrue(true, "结果不是true");

        System.out.println("测试测试测试");
    }
}
