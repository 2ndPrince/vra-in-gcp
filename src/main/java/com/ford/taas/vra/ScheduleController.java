package com.ford.taas.vra;

import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping(value = "/schedule")
public class ScheduleController {

    @GetMapping()
    public String postScheduleRequest(@RequestParam String name) {
        return "hello " + name;
    }
}
