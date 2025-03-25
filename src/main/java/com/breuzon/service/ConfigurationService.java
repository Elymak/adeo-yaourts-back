package com.breuzon.service;

import com.breuzon.entity.UserConfig;
import com.breuzon.repository.ConfigurationRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ConfigurationService {

    @Autowired
    private ConfigurationRepository configurationRepository;

    public Optional<UserConfig> getUserConfigurationById(Long id) {
        return configurationRepository.findById(id);
    }

    public List<UserConfig> findAllConfigurations() {
        return (List<UserConfig>) configurationRepository.findAll();
    }

    public UserConfig saveConfiguration(UserConfig userConfig) {
        return configurationRepository.save(userConfig);
    }
}
