package com.abdulazisposeightteen.pageobject.drivers.strategies;

import com.abdulazisposeightteen.pageobject.utils.Constants;

public class DriverStrategyImplementer {
    public static DriverStrategy chooseStrategy(String strategy) {
        switch (strategy) {
            case Constants.CHROME:
                return new Chrome();


            default:
                return null;
        }
    }
}
