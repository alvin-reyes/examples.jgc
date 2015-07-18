package com.areyes1.junitassertthat.sample;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

public class CustomMatcher {
	public static Matcher<Object> matches(final Object expected){
			return new BaseMatcher<Object>() {
				protected Object expectedObject = expected;
				public boolean matches(Object item) {
					return expectedObject.equals(item);
				}
				public void describeTo(Description description) {
					description.appendText(expectedObject.toString());
				}
			};
	}
}
