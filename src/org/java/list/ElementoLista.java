package org.java.list;

public class ElementoLista {
private String destinatario;
private String regalo;
public String getDestinatario() {
	return destinatario;
}
public void setDestinatario(String destinatario) {
	this.destinatario = destinatario;
}
public String getRegalo() {
	return regalo;
}
public void setRegalo(String regalo) {
	this.regalo = regalo;
}
public ElementoLista(String regalo,String destinatario) {
	// TODO Auto-generated constructor stub
	this.setRegalo(regalo);
	this.setDestinatario(destinatario);
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Destinatario : " + this.getDestinatario() +" -> Regalo : " + this.getRegalo();
	}
}
