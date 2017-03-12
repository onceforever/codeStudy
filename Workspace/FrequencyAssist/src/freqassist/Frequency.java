package freqassist;

import java.util.ArrayList;
import java.util.List;

public class Frequency {

	private double centerFreq;
	private long arfcn;
	private boolean isDl;
	private List<OperatingBand> bandList = new ArrayList<OperatingBand>();

	public Frequency(double centerFreq, long arfcn, boolean isDl) {
		super();
		this.centerFreq = centerFreq;
		this.arfcn = arfcn;
		this.isDl = isDl;
	}

	public void setBandList(List<OperatingBand> bandList) {
		this.bandList = bandList;
	}

}
