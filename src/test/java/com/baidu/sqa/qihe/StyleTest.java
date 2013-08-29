package com.baidu.sqa.qihe;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class StyleTest {

    @Test
    public void StyleShouldPrintWhatISay() {
        Style style = new Style();
        String say = "hello world";
        Assert.assertThat(style.print(say), is(say));
    }
}
