package com.nts.cleancode.collections;

public class Set extends AbstractCollection {
	public void add(Object element) {
		if (readOnly)
			return;

		if (shouldGrow()) {
			grow();
		}

		if (contains(element))
			return;
		addElement(element);
	}
}
