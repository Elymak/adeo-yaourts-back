package com.breuzon.service;

import com.breuzon.entity.YaourtHistory;
import com.breuzon.repository.YaourtRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class YaourtService {

    @Autowired
    private YaourtRepository yaourtRepository;

    @Autowired
    private ConfigurationService configurationService;

    public List<YaourtHistory> getYaourtHistory(int userId) {
        return yaourtRepository.findYaourtHistoryByUserIdOrderByDatetime(userId);
    }

    public YaourtHistory findMostRecentYaourtHistory(int userId) {
        return yaourtRepository.findTopByOrderByDatetimeDesc(userId);
    }

}
