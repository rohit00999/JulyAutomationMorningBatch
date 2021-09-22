package miscellaneous;

interface RBI
{
	abstract void interestRate();
}


class HdfcBank implements RBI
{
	public void interestRate() {
		System.out.println("HDFC: 2 % interest");
	}
}


class SbiBank implements RBI
{
	public void interestRate() {
		System.out.println("SBI: 0.5 % interest");
	}
}

public class AbstractionDemo {
	public static void main(String[] args) {
		HdfcBank hdfc = new HdfcBank();
		hdfc.interestRate();
		
		System.out.println("******************");
		
		SbiBank sbi = new SbiBank();
		sbi.interestRate();
	}
}
