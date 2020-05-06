package com.inifinitelambda.test.service;

import org.springframework.stereotype.Service;

/**
 * Author: yanislav_ivanov
 * Date: 06/05/2020
 */
@Service
public class PrimeNumberService {
    public boolean isPrimeNumber(long n) {
        if (n == 0 || n == 1) {
            return false;
        }
        long m = 0;
        int i = 0, flag = 0;
        m = n / 2;

        for (i = 2; i <= m; i++) {
            if (n % i == 0) {
                flag = 1;
                return false;
            }
        }
        if (flag == 0) {
            return true;
        }
        return false;
    }

    public long nextPrime(long num) {
        num++;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                num++;
                i = 2;
            } else {
                continue;
            }
        }
        return num;
    }
}
