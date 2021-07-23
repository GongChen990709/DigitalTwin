package DigitalTwin.Service;

import DigitalTwin.Dao.demoMapper;
import DigitalTwin.Entities.dataEntity;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class DemoService {

    private demoMapper demoMapper;

    public void setDemoMapper(DigitalTwin.Dao.demoMapper demoMapper) {
        this.demoMapper = demoMapper;
    }

    public List<dataEntity> queryDataByIndex(int index){
        return demoMapper.queryDataByIndex(index);
    }

}
