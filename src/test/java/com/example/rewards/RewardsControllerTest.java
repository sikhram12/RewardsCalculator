package com.example.rewards;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import com.example.rewards.service.RewardService;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RewardsControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @MockBean
    private RewardService rewardService;

    @Test
    public void generateRewardsTest120() {
        int purchaseAmt = 120;
        int expectedRewards = 90;

        when(rewardService.calculateRewards(purchaseAmt)).thenReturn(expectedRewards);

        ResponseEntity<Integer> response = restTemplate.postForEntity("/calculateRewards", purchaseAmt, Integer.class);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(expectedRewards, response.getBody().intValue());
    }
    
    @Test
    public void generateRewardsTest3() {
        int purchaseAmt = 3;
        int expectedRewards = 0;

        when(rewardService.calculateRewards(purchaseAmt)).thenReturn(expectedRewards);

        ResponseEntity<Integer> response = restTemplate.postForEntity("/calculateRewards", purchaseAmt, Integer.class);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(expectedRewards, response.getBody().intValue());
    }
    
    @Test
    public void generateRewardsTest181() {
        int purchaseAmt = 181;
        int expectedRewards = 212;

        when(rewardService.calculateRewards(purchaseAmt)).thenReturn(expectedRewards);

        ResponseEntity<Integer> response = restTemplate.postForEntity("/calculateRewards", purchaseAmt, Integer.class);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(expectedRewards, response.getBody().intValue());
    }
    
    @Test
    public void generateRewardsTest1016() {
        int purchaseAmt = 1016;
        int expectedRewards = 1882;

        when(rewardService.calculateRewards(purchaseAmt)).thenReturn(expectedRewards);

        ResponseEntity<Integer> response = restTemplate.postForEntity("/calculateRewards", purchaseAmt, Integer.class);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(expectedRewards, response.getBody().intValue());
    }
    
    @Test
    public void generateRewardsTest115() {
        int purchaseAmt = 115;
        int expectedRewards = 80;

        when(rewardService.calculateRewards(purchaseAmt)).thenReturn(expectedRewards);

        ResponseEntity<Integer> response = restTemplate.postForEntity("/calculateRewards", purchaseAmt, Integer.class);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(expectedRewards, response.getBody().intValue());
    }
}