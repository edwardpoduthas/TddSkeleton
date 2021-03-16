package com.oocode;

import org.junit.*;

import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.*;

public class ReacentlyUsedListShould {

	@Test 
	public void initializeEmpty() {
		assertThat(new RecentlyUsedList().getList().isEmpty(), is(true));
	}

	@Test
	public void addItemToList() {
		RecentlyUsedList recentlyUsedList = new RecentlyUsedList();
		recentlyUsedList.add("0899777666");
		assertThat( recentlyUsedList.getList(), is(List.of("0899777666")));
	}
}
