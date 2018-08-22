package ut.com.zwu.rest;

import org.junit.Test;
import com.zwu.rest.api.MyPluginComponent;
import com.zwu.rest.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}