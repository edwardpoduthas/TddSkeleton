package com.oocode;

import org.junit.*;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.*;

public class ReacentlyUsedListShould {

	@Test 
	public void initializeEmpty() {
		assertThat(new RecentlyUsedList().getList(), is([]));
	}
}
