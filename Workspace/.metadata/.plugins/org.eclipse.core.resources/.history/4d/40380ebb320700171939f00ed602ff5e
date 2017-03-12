package freqassist;

public class OperatingBand {
	public int bandIndex;
	public BandType bandType;
	public double f_Dl_low;
	public double f_Dl_high;
	public long n_Dl_low;
	public long n_Dl_high;
	public double f_Ul_low;
	public double f_Ul_high;
	public long n_Ul_low;
	public long n_Ul_high;
	public boolean isDl;

	public OperatingBand(int bandIndex, double f_Dl_low, double f_Dl_high, long n_Dl_low, long n_Dl_high,
			double f_Ul_low, double f_Ul_high, long n_Ul_low, long n_Ul_high) {
		super();
		this.bandIndex = bandIndex;
		this.f_Dl_low = f_Dl_low;
		this.f_Dl_high = f_Dl_high;
		this.n_Dl_low = n_Dl_low;
		this.n_Dl_high = n_Dl_high;
		this.f_Ul_low = f_Ul_low;
		this.f_Ul_high = f_Ul_high;
		this.n_Ul_low = n_Ul_low;
		this.n_Ul_high = n_Ul_high;
	}
	
	public void fillBandType() {
		bandType = BandType.ERRORTYPE;
		if ((bandIndex >= 1 && bandIndex <=32) || (bandIndex)) {
			bandType = BandType.FDD;
			return;
		} 
		if (bandIndex >= 33 && bandIndex <= ) {
			bandType = BandType.TDD;
			return;
		}
	}
	
	public long getArfcnByFreq(double centerFreq) {
		long arfcn = 0;
		return arfcn;
	}
	public String toString() {
		return "OperatingBand [bandIndex=" + bandIndex + ", bandType=" + bandType + ", f_Dl_low=" + f_Dl_low
				+ ", f_Dl_high=" + f_Dl_high + ", n_Dl_low=" + n_Dl_low + ", n_Dl_high=" + n_Dl_high + ", f_Ul_low="
				+ f_Ul_low + ", f_Ul_high=" + f_Ul_high + ", n_Ul_low=" + n_Ul_low + ", n_Ul_high=" + n_Ul_high + "]";
	}
	
}
