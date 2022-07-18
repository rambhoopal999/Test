package com.customer.rewards.points.service;

import com.customer.rewards.points.model.RewardPointsResponse;
import org.springframework.stereotype.Service;


@Service
public class RewardPointsService {


    public RewardPointsResponse getRewardPointsService(Long transactionAmount) {
        RewardPointsResponse response = new RewardPointsResponse();
        Long rewardPoints = 0l;
        if (transactionAmount > 50 && transactionAmount <= 100) {
            rewardPoints += (transactionAmount.intValue() - 50) * 1;

        }
        if (transactionAmount > 100) {
            rewardPoints += 50;  //1 point for every dollar spent over $50
            rewardPoints += (transactionAmount.intValue() - 100) * 2;  //2 points for every dollar spent over $100
        }
        response.setRewardPoints(rewardPoints);
        response.setTransactionAmount(transactionAmount);
        return response;
    }
}
