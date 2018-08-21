package com.crossover.techtrial.repository;

import com.crossover.techtrial.model.DailyElectricity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Repository for all operations related to {@link DailyElectricity}.
 *
 * @author Som
 */
public interface DailyElectricityRepository extends CrudRepository<DailyElectricity, Long> {

    List<DailyElectricity> findAllByPanelId(Long panelId);
}
