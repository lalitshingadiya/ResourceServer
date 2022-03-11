package com.ls.resourceserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RestController
public class TollController {

    private List<TollData> tollData;

    public TollController() {
        this.tollData = new ArrayList<TollData>();
        this.tollData.add(new TollData("900","GJ01PJ8866","2022-03-02"));
        this.tollData.add(new TollData("901","GJ02PJ4585","2022-03-01"));
        this.tollData.add(new TollData("902","GJ03RJ8567","2022-03-03"));
    }

    @RequestMapping("/api/tolldata")
    public List<TollData> listTollData(){
        return this.tollData;
    }
}
