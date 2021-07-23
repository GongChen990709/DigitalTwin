package DigitalTwin.Controller;


import DigitalTwin.Entities.dataEntity;
import DigitalTwin.Service.DemoService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DemoController {
    @Autowired
    @Qualifier("DemoService")
    private DemoService demoService;


    @RequestMapping("/data/index")
    @ResponseBody
    public List<dataEntity> dataByIndex(HttpServletRequest request){
        int index = 1;
        return demoService.queryDataByIndex(index);
    }


}
