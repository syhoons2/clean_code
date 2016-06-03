package com.nts.cleancode.collections;

public class List extends AbstractCollection {
	public boolean isEmpty() {
		return size == 0;
	}

	public void add(Object element) {
		if (readOnly)
			return;

		if (shouldGrow()) {
			grow();
		}
		addElement(element);

	}

	protected boolean shouldGrow() {
		return size + 1 > elements.length;
	}

	protected void grow() {
		Object[] newElements = new Object[elements.length + 10];
		for (int i = 0; i < size; i++)
			newElements[i] = elements[i];
		elements = newElements;
	}

	protected void addElement(Object element) {
		elements[size++] = element;
	}

	public boolean contains(Object element) {
		for (int i = 0; i < size; i++)
			if (elements[i].equals(element))
				return true;
		return false;
	}

	public int size() {
		return size;
	}

	public int capacity() {
		return elements.length;
	}

	public void set(int i, Object value) {
		if (!readOnly) {
			if (i >= size)
				throw new ArrayIndexOutOfBoundsException();
			elements[i] = value;
		}
	}
}
