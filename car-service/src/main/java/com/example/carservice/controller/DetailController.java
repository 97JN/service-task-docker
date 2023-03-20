package com.example.carservice.controller;

import com.example.carservice.entity.DetailEntity;
import com.example.carservice.entity.Detail_DTO;
import com.example.carservice.service.DetailService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/details")
public class DetailController {
    private DetailService detailService;

    public DetailController(DetailService detailService) {
        this.detailService = detailService;
    }
    @GetMapping("/all")
    public Iterable <DetailEntity> getAll(){
        return detailService.findAll();
    }

    @PostMapping
    public DetailEntity addDetail(@RequestBody Detail_DTO detailDto){
        return  detailService.save(detailDto);
    }


}
