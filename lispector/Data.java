package lispector;

public class Data {
	private int dia, mes, ano;

	public Data(int dia, int mes, int ano) throws DataException {
		
		this.setDia(dia);
		this.setMes(mes);
		this.setAno(ano);
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) throws DataException {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) throws DataException{
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String toString() {
		return "Data = " + this.dia + "/" + this.mes + "/" + this.ano + ".";
	}
}
