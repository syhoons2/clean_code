package com.nts.cleancode.collections;

public class Set extends AbstractCollection {
	@Override
	public void add(Object element) {

		if (contains(element))
			return;

		super.add(element);
	}
}
