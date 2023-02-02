package com.example.rewards.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.rewards.service.RewardService;



@RestController
public class RewardController {
	
	@Autowired
	RewardService rewardService;
	
	@PostMapping("/calculateRewards")
	public int generateRewards(@RequestBody int purchaseAmt) {
		
		int rewards = rewardService.calculateRewards(purchaseAmt);
		System.out.println(
				"For a purchase amount of $" + purchaseAmt + ", the rewards earned are: " + rewards + " points");
		
		return rewards;
	}

}
