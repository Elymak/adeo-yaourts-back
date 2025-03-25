package com.breuzon.controller;

import com.breuzon.entity.YaourtHistory;
import com.breuzon.service.YaourtService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/yaourts")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class YaourtController {

    @Autowired
    private YaourtService yaourtService;

    @GetMapping("/{userId}")
    public List<YaourtHistory> getYaourtHistory(@PathVariable("userId") int userId) {
        return yaourtService.getYaourtHistory(userId);
    }

    @GetMapping("/current/{userId}")
    public YaourtHistory getCurrentYaourt(@PathVariable("userId") int userId) {
        return yaourtService.findMostRecentYaourtHistory(userId);
    }

}
