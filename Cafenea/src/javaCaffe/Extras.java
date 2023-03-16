package javaCaffe;

///ZAHAR//// ciocolata calda, late machiato, frappe,ceai
class Zahar extends BauturaDecorator{
	
	private final Bautura bautura;
	
	public Zahar(Bautura bautura){
		this.bautura = bautura;
		}
		@Override
		public String getDesc() {
		return bautura.getDesc()+"\n + Zahar (1 leu)";
		}
		
		@Override
		public double getPrice() {
		return bautura.getPrice()+1;
		}
}

/////LAPTE/////
class Lapte extends BauturaDecorator{
	
	private final Bautura bautura;
	
	public Lapte(Bautura bautura){
	this.bautura = bautura;
	}
	
	@Override
	public String getDesc() {
	return bautura.getDesc()+"\n + Lapte (2 lei)";
	}
	
	@Override
	public double getPrice() {
	return bautura.getPrice()+2;
	}
}

class Caramel extends BauturaDecorator{
	
	private final Bautura bautura;
	
	public Caramel(Bautura bautura){
	this.bautura = bautura;
	}
	
	@Override
	public String getDesc() {
	return bautura.getDesc()+"\n + Caramel (2.69 lei)";
	}
	
	@Override
	public double getPrice() {
	return bautura.getPrice()+2.69;
	}
}

class Ciocolata extends BauturaDecorator{
	
	private final Bautura bautura;
	
	public Ciocolata(Bautura bautura){
	this.bautura = bautura;
	}
	
	@Override
	public String getDesc() {
	return bautura.getDesc()+"\n + Ciocolata (3.49 lei)";
	}
	
	@Override
	public double getPrice() {
	return bautura.getPrice()+3.49;
	}
}

class Biscuiti extends BauturaDecorator{
	
	private final Bautura bautura;
	
	public Biscuiti(Bautura bautura){
	this.bautura = bautura;
	}
	
	@Override
	public String getDesc() {
	return bautura.getDesc()+"\n + Biscuiti (4.99 lei)";
	}
	
	@Override
	public double getPrice() {
	return bautura.getPrice()+4.99;
	}
}

