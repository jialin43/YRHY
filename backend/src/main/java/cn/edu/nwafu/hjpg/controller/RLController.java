package cn.edu.nwafu.hjpg.controller;

import cn.edu.nwafu.hjpg.entity.Rl;
import cn.edu.nwafu.hjpg.service.RLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/rl")
public class RLController {
    @Autowired
    RLService rlService;
    @RequestMapping(value = "list",method = RequestMethod.POST)
    @ResponseBody
    public List<Rl> findAll(){
        return rlService.findAll();
    }
}
