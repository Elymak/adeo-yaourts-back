package com.breuzon.controller;

import com.breuzon.entity.UserConfig;
import com.breuzon.service.ConfigurationService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/config")
@AllArgsConstructor
@CrossOrigin(origins = "*")
@Slf4j
public class ConfigurationController {

    @Autowired
    private ConfigurationService configurationService;

    @GetMapping("/{id}")
    public Optional<UserConfig> getUserConfig(@PathVariable("id") Long id) {
        return configurationService.getUserConfigurationById(id);
    }

    @GetMapping
    public List<UserConfig> findAllDeliveryTimes() {
        return configurationService.findAllConfigurations();
    }

    @PostMapping(consumes = "application/json")
    public UserConfig saveUserConfig(@RequestBody UserConfig userConfig) {
        log.info("Saving user configuration: {}", userConfig);
        return configurationService.saveConfiguration(userConfig);
    }

}
