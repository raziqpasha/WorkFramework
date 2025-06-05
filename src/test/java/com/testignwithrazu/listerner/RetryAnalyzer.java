package com.testignwithrazu.listerner;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
int mincount =0;
int maxcount=3;
    @Override
    public boolean retry(ITestResult iTestResult) {
        if(mincount<maxcount){
            mincount++;
            return true;
        }
        return false;
    }

}
