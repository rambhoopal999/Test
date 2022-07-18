package com.customer.rewards.points.controller;

import com.customer.rewards.points.model.RewardPointsResponse;
import com.customer.rewards.points.service.RewardPointsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/reward-points")
public class RewardPointsController {

    @Autowired
    private RewardPointsService service;

    @GetMapping("/transaction/{amount}")
    public ResponseEntity<RewardPointsResponse> getCustomer(@PathVariable Long amount) {
        RewardPointsResponse response = service.getRewardPointsService(amount);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}




