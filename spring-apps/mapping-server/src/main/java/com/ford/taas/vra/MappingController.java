package com.ford.taas.vra;

import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping(value = "/mapping")
public class MappingController {

    @GetMapping()
    public String postScheduleRequest(@RequestParam String name) {
        return "hello mapping " + name;
    }
}
