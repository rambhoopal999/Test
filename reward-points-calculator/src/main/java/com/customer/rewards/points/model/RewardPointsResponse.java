package com.customer.rewards.points.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class RewardPointsResponse {
    private Long rewardPoints;
    private Long transactionAmount;
}
