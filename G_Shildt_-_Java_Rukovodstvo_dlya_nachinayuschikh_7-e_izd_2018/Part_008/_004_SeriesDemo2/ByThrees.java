package _004_SeriesDemo2;

import _003_SeriesDemo.Series;

class ByThrees implements Series {
	int start;
	int val;

	ByThrees() {
		start = 0;
		val = 0;
	}

	@Override
	public int getNext() {
		start += 3;
		return val;
	}

	@Override
	public void reset() {
		start = 0;
		val = 0;
	}

	@Override
	public void setStart(int x) {
		start = x;
		val = x;
	}

}
