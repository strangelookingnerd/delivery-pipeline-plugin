/*
This file is part of Delivery Pipeline Plugin.

Delivery Pipeline Plugin is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Delivery Pipeline Plugin is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Delivery Pipeline Plugin.
If not, see <http://www.gnu.org/licenses/>.
*/
package se.diabol.jenkins.pipeline.functionaltest;

import java.time.Duration;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtil {
    public static WebElement waitForElement(WebDriver driver, String id) {
        return waitForElement(driver, By.id(id));
    }

    public static WebElement waitForElement(WebDriver driver, By by) {
        return new WebDriverWait(driver, Duration.ofSeconds(30)).until(new Function<>() {
            @Override
            public WebElement apply(WebDriver webDriver) {
                return webDriver.findElement(by);
            }
        });
    }

}
