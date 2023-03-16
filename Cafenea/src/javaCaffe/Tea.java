package javaCaffe;

public class Tea implements Bautura{
	@Override
	public String getDesc() {
	return "Ceai (5 lei)";
	}
	@Override
	public double getPrice() {
	return 5;
	}
}