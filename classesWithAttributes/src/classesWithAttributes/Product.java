package classesWithAttributes;

public class Product {
	
	//Constructor
	
	/*
	public Product(int _id,String _name,String _despricion,double _price,int _stockAmount) {
		System.out.println("Yapıcı blok çalıştı");
		this._id=_id;
		this._despricion=_despricion;
		this._name=_name;
		this._price=_price;
		this._stockAmount=_stockAmount;
		
	}
	public Product(){
	
	}
	*/
	
	private int _id;
	private String _name;
	private String _despricion;
	private double _price;
	private int _stockAmount;
	
	
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String get_name() {
		return _name;
	}
	public void set_name(String _name) {
		this._name = _name;
	}
	public String get_despricion() {
		return _despricion;
	}
	public void set_despricion(String _despricion) {
		this._despricion = _despricion;
	}
	public double get_price() {
		return _price;
	}
	public void set_price(double _price) {
		this._price = _price;
	}
	public int get_stockAmount() {
		return _stockAmount;
	}
	public void set_stockAmount(int _stockAmount) {
		this._stockAmount = _stockAmount;
	}

}
