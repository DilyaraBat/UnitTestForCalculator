package ru.levelup.dilyara.batdalova.unitfw.suit;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.junit.platform.suite.api.SelectClasses;
import ru.levelup.dilyara.batdalova.qa.unitframeworks.TestDiv;
import ru.levelup.dilyara.batdalova.qa.unitframeworks.TestMult;

@RunWith(JUnitPlatform.class)

@SelectClasses({ru.levelup.dilyara.batdalova.qa.unitframeworks.TestMult.class, ru.levelup.dilyara.batdalova.qa.unitframeworks.TestDiv.class})


public class TestSuiteMultDiv {
}
