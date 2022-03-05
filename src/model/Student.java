package model;
public class Student {
	
	private String name;
	private String code;
	private int id;
	private int ingreso;
	private int gasto;
	private float total;
	
	public Student(String name, String code, int id, int ingreso, int gasto, float total) {
		this.name = name;
		this.code = code;
		this.id = id;
		this.ingreso = ingreso;
		this.gasto = gasto;
		this.total = total;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getIngreso() {
		return ingreso;
	}

	public void setIngreso(int ingreso) {
		this.ingreso = ingreso;
	}
	
	public int getGasto() {
		return gasto;
	}

	public void setGasto(int gasto) {
		this.gasto = gasto;
	}
	
	//Metodo De Ganancia
    public float total(){
    return total;
    }
	
}