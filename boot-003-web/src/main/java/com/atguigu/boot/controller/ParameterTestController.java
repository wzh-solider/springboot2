package com.atguigu.boot.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试参数的控制器
 *
 * @author Solider
 * @version 1.0
 * @Date 2023/10/9 18:34
 * @since 1.0
 */
@RestController
public class ParameterTestController {

    @RequestMapping("/map")
    public Map<String, Integer> map(@RequestParam("username") String username, @RequestParam("password") String password) {
        Map<String, Integer> map = new HashMap<>();
        map.put(username, password.length());
        return map;
    }

    @RequestMapping("/car/{id}")
    public Map<String, Integer> car(@PathVariable("id") Integer id) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("id", id);
        return map;
    }

    @RequestMapping("/save")
    public Model saveUser(Model model) {
        model.addAttribute("msg", "成功了");
        return model;
    }

    @RequestMapping("/demo/{path}")
    public Map<String, Object> demo(@MatrixVariable("name") String name,
                                    @MatrixVariable("age") Integer age,
                                    @PathVariable String path) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", name);
        map.put("age", age);
        map.put("path", path);
        return map;
    }

    @RequestMapping("/demo2/{boss}/{emp}")
    public Map<String, Object> demo (@MatrixVariable(value = "age", pathVar = "boss") Integer bossAge,
                                     @MatrixVariable(value = "age", pathVar = "emp") Integer empAge) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("bossAge", bossAge);
        map.put("emp", empAge);
        return map;
    }
}
