package de.blackgen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeClassTestTest {

  @Test
  public void passingTest() {
    assertEquals("FOO", SomeClass.toUpperCase("foo"));
  }

  @Test
  public void failingTest() {
    assertEquals("Foo", SomeClass.toUpperCase("foo"));
  }

}