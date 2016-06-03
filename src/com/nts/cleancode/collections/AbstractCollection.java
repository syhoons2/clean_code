package com.nts.cleancode.collections;

public abstract class AbstractCollection {
	protected Object[] elements = new Object[10];
	protected boolean readOnly;

	public void addAll(AbstractCollection collection) {

		for (int i = 0; i < collection.size(); i++) {
			if (!contains(collection.get(i))) {
				add(collection.get(i));
			}
		}

	}

	public void add(Object key, Object value) {
	}

	public abstract boolean isEmpty();

	public abstract void add(Object element);

	public abstract boolean remove(Object element);

	public abstract boolean contains(Object element);

	public abstract int size();

	public Object get(int i) {
		return elements[i];
	}

	public void setReadOnly(boolean b) {
		readOnly = b;
	}
}
