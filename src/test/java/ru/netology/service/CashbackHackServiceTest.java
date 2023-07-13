package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
        @Test
       public void testAmountNoEquals1000() {
            CashbackHackService service = new CashbackHackService();
            int amount = 900;
            int actual = service.remain(amount);
            int expected = 100;
            assertEquals(expected, actual);
        }

        @Test
      public   void testAmountEquals1000() {
            CashbackHackService service = new CashbackHackService();
            int amount = 100;
            int actual = service.remain(amount);
            int expected = 0;
            assertEquals(expected, actual);
        }
    }
