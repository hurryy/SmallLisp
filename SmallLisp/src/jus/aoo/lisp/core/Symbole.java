package jus.aoo.lisp.core;

import java.util.HashMap;
import java.util.Map;

public class Symbole extends Atome {

	private static Map<String, Symbole> variables = new HashMap<String, Symbole>();
	
	private String value;
		
	private Symbole(String value) { this.value = value; }
	
	public static void instancier(String name)
	{
		if(!variables.containsKey(name))
			variables.put(name, new Symbole(name));
	}
	@Override
	public SExpr car() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SExpr cdr() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eq(SExpr expr) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isAtome() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isList() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isNil() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isSCons() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isSymbole() {
		// TODO Auto-generated method stub
		return false;
	}

}
