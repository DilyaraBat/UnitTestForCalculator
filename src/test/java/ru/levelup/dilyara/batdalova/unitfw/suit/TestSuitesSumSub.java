package ru.levelup.dilyara.batdalova.unitfw.suit;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
import ru.levelup.dilyara.batdalova.qa.unitframeworks.TestSub;
import ru.levelup.dilyara.batdalova.qa.unitframeworks.TestSum;

@RunWith(JUnitPlatform.class)

@SelectClasses({TestSum.class,TestSub.class})
public class TestSuitesSumSub {
}
