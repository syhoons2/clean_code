package com.nts.cleancode.collections;

public abstract class AbstractCollection {
	protected Object[] elements = new Object[10];
	protected boolean readOnly;
	protected int size = 0;

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

	public abstract boolean contains(Object element);

	public abstract int size();

	public Object get(int i) {
		return elements[i];
	}

	public void setReadOnly(boolean b) {
		readOnly = b;
	}

	public boolean remove(Object element) {
		if (readOnly)
			return false;
		for (int i = 0; i < size; i++)
			if (elements[i].equals(element)) {
				removeElementAt(i);
				return true;
			}
		return false;
	}

	protected void removeElementAt(int i) {
		elements[i] = null;
		Object[] newElements = new Object[size - 1];
		int k = 0;
		for (int j = 0; j < size; j++) {
			if (elements[j] != null)
				newElements[k++] = elements[j];
		}
		size--;
		elements = newElements;
	}
}
