package DigitalTwin.Dao;

import DigitalTwin.Entities.dataEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface demoMapper {
    List<dataEntity> queryDataByIndex(@Param("index") int index);
}
