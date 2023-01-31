package com.example.rewards.service;

import org.springframework.stereotype.Service;

@Service
public class RewardService {
	
	public int calculateRewards(int purchaseAmount) {
		int rewards = 0;

		if (purchaseAmount > 100) {
			rewards += (purchaseAmount - 100) * 2;
			purchaseAmount = 100;
		}

		if (purchaseAmount > 50) {
			rewards += (purchaseAmount - 50) * 1;
		}

		return rewards;
	}

}
