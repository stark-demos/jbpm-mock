package com.stark.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MockProcessContextTest {

    @Test
    public void testSetVariable() {
        MockProcessContext kcontext = new MockProcessContext();
        kcontext.setVariable("foo", "bar");
        assertEquals("bar", kcontext.getVariable("foo"));
    }

    @Test
    public void testSetProcessInstance() {
        MockProcessContext kcontext = new MockProcessContext();
        kcontext.setProcessInstanceId(1L);

        assertEquals(1L, kcontext.getProcessInstance().getId());
    }
}